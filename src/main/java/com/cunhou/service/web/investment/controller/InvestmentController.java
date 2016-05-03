package com.cunhou.service.web.investment.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cunhou.service.web.common.PageView;
import com.cunhou.service.web.common.web.WebResult;
import com.cunhou.service.web.common.web.WebResultCode;
import com.cunhou.service.web.investment.entry.Agent;
import com.cunhou.service.web.investment.entry.OperateInfo;
import com.cunhou.service.web.investment.inface.AgentService;
import com.cunhou.service.web.investment.inface.OperateInfoService;

@Controller
public class InvestmentController {
    
    // 经营信息id，这些id对应的记录需要锁定
    String[] codings = {"0091","0218","0432","0433","0436","0460","0562","0566","0655","0683","0708","0716","0731","0915","1000","1028","1045","1064","1139","1172","1309","1349","1352","1438","1478","1547","1563","1654","1689","1769","1807","1969","2512","2536"};
    
    @Autowired
    private OperateInfoService operateInfoService;
    
    @Autowired
    private AgentService anentService;

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String getOperateInfoList(HttpServletRequest request,HttpServletResponse response, String area, String nameOrPhone, Integer pageIndex) throws Exception {
        List<OperateInfo> list = null;
        if (null == pageIndex) {
            pageIndex = 1;
        }
        PageView pageView =  new PageView(pageIndex);
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("paging", pageView);
        if (StringUtils.isNotEmpty(area)) {
            param.put("searchKeyWord", area);
            pageView = operateInfoService.selectByArea(pageView, param);
            list = (List<OperateInfo>) pageView.getRecords();
        } else {
            pageView = operateInfoService.findAllRecords(pageView, param);
            list = (List<OperateInfo>) pageView.getRecords();
        }
       
        if (null != list) {
            for (int i = 0; i < list.size(); i++) {
                OperateInfo operateInfo = list.get(i);
                Map<String, Object> params = new HashMap<String, Object>();
                params.put("operateId", operateInfo.getOperateId());
                List<Agent> agentList = anentService.getAgentInfoByCondition(params);
                String status = "未锁定";
                int num = 0;
                // 遍历agent，设置状态
                if (CollectionUtils.isNotEmpty(agentList)) {
                    // 如果根据代理商姓名或手机号码查询，需要把operateInfo中不包含对应代理商的数据过滤掉
                    boolean flag = false;
                    for (Agent agent : agentList) {
                        if (StringUtils.isNotEmpty(nameOrPhone)) {
                            if (nameOrPhone.equals(agent.getName()) || nameOrPhone.equals(agent.getPhone())) {
                                flag = true;
                            }
                        } else {
                            flag = true;
                        }
                        double intentionMoney = agent.getIntentionMoney();
                        double money = operateInfo.getOperateMoney()-intentionMoney;
                        if (intentionMoney > 0) {
                            num++;
                            agent.setRemark(agent.getName()+"("+agent.getPhone()+")已缴纳意向金"+intentionMoney+"，待缴纳余额为"+money);
                        } else {
                            agent.setRemark(agent.getName()+"("+agent.getPhone()+")未缴纳意向金"+"，待缴纳余额为"+money);
                        }
                    }
                    if (!flag) {
                        list.remove(i);
                        i--;
                        continue;
                    }
                    if (num > 0) {
                        status = "已锁定("+num+")";
                    }
                } else {
                    // agent列表为空，并且nameOrPhone不为空，需要删除当前的operateInfo
                    if (StringUtils.isNotEmpty(nameOrPhone)) {
                        list.remove(i);
                        i--;
                        continue;
                    }
                }
                operateInfo.setStatus(status);
                // 如果是特殊的编码，则特殊处理为锁定状态
                if (checkCoding(codings, operateInfo.getCoding())) {
                    operateInfo.setLock("1");
                    operateInfo.setStatus("已锁定");
                }
                operateInfo.setAgentList(agentList);
            }
        }
        request.setAttribute("area", area);
        request.setAttribute("nameOrPhone", nameOrPhone);
        request.setAttribute("list", list);
        if (null!=pageIndex && pageIndex>pageView.getPageCount()) {
            pageView.setPageNow(1);
        }
        request.setAttribute("pageView", pageView);
        return "list.jsp";
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "list_mobile",method = RequestMethod.GET)
    public String getOperateInfoListMobile(HttpServletRequest request,HttpServletResponse response, String area, String nameOrPhone, Integer pageIndex) throws Exception {
        long a = System.currentTimeMillis();
        List<OperateInfo> list = null;
        if (null == pageIndex) {
            pageIndex = 1;
        }
        PageView pageView =  new PageView(pageIndex);
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("paging", pageView);
        if (StringUtils.isNotEmpty(area)) {
            param.put("searchKeyWord", area);
            pageView = operateInfoService.selectByArea(pageView, param);
            list = (List<OperateInfo>) pageView.getRecords();
        } else {
            //pageView = operateInfoService.findAllRecords(pageView, param);
            //list = (List<OperateInfo>) pageView.getRecords();
        }
       
        if (null != list) {
            for (int i = 0; i < list.size(); i++) {
                OperateInfo operateInfo = list.get(i);
                // 运营保证金为0的，不展示
                if (operateInfo.getOperateMoney() == 0) {
                    list.remove(i);
                    i--;
                    continue;
                }
                Map<String, Object> params = new HashMap<String, Object>();
                params.put("operateId", operateInfo.getOperateId());
                List<Agent> agentList = anentService.getAgentInfoByCondition(params);
                String status = "未锁定";
                int num = 0;
                // 遍历agent，设置状态
                if (CollectionUtils.isNotEmpty(agentList)) {
                    // 如果根据代理商姓名或手机号码查询，需要把operateInfo中不包含对应代理商的数据过滤掉
                    boolean flag = false;
                    for (Agent agent : agentList) {
                        if (StringUtils.isNotEmpty(nameOrPhone)) {
                            if (nameOrPhone.equals(agent.getName()) || nameOrPhone.equals(agent.getPhone())) {
                                flag = true;
                            }
                        } else {
                            flag = true;
                        }
                        double intentionMoney = agent.getIntentionMoney();
                        double money = operateInfo.getOperateMoney()-intentionMoney;
                        if (intentionMoney > 0) {
                            num++;
                            agent.setRemark(agent.getName()+"("+agent.getPhone()+")已缴纳意向金"+intentionMoney+"，待缴纳余额为"+money);
                        } else {
                            agent.setRemark(agent.getName()+"("+agent.getPhone()+")未缴纳意向金"+"，待缴纳余额为"+money);
                        }
                    }
                    if (!flag) {
                        list.remove(i);
                        i--;
                        continue;
                    }
                    if (num > 0) {
                        status = "已锁定("+num+")";
                    }
                } else {
                    // agent列表为空，并且nameOrPhone不为空，需要删除当前的operateInfo
                    if (StringUtils.isNotEmpty(nameOrPhone)) {
                        list.remove(i);
                        i--;
                        continue;
                    }
                }
                operateInfo.setStatus(status);
                // 如果是特殊的编码，则特殊处理为锁定状态
                if (checkCoding(codings, operateInfo.getCoding())) {
                    operateInfo.setLock("1");
                    operateInfo.setStatus("已锁定");
                }
                operateInfo.setAgentList(agentList);
            }
        }
        request.setAttribute("area", area);
        request.setAttribute("nameOrPhone", nameOrPhone);
        request.setAttribute("list", list);
        request.setAttribute("pageView", pageView);
        System.out.println("end time--->"+(System.currentTimeMillis() - a));
        return "list_mobile.jsp";
    }

    @RequestMapping("insert_agent")
    public @ResponseBody WebResult<Boolean> insertAgent(HttpServletRequest request,HttpServletResponse response, String operateId, String agentName, String agentPhone) throws Exception {
        WebResult<Boolean> webResult = new WebResult<Boolean>(WebResultCode.SUCCESS);
        try {
            Agent agent = new Agent();
            agent.setOperateInfo(operateInfoService.findById(operateId));
            agent.setName(agentName);
            agent.setPhone(agentPhone);
            agent.setIntentionMoney(Double.valueOf(0));
            agent.setCreateTime(Calendar.getInstance().getTime());
            int result = anentService.add(agent);
            if (0 == result) {
                webResult.setCode(WebResultCode.BUSINESS_ERROR);
                webResult.setData(false);
            } else {
                webResult.setData(true);
            }
        } catch (Exception e) {
            webResult.setCode(WebResultCode.BUSINESS_ERROR);
            webResult.setMsg(e.getMessage());
            webResult.setData(false);
        }
        return webResult;
    }

    @RequestMapping("update_agent")
    public @ResponseBody WebResult<Boolean> updateAgent(HttpServletRequest request,HttpServletResponse response, String agentId, String intentionMoney) throws Exception {
        
        WebResult<Boolean> webResult = new WebResult<Boolean>(WebResultCode.SUCCESS);
        
        try {
            int result = 0;
            Agent agent = anentService.findById(agentId);
            if (null != agent) {
                agent.setIntentionMoney(Double.parseDouble(intentionMoney));
                result = anentService.update(agent);
            }
            if (0 == result) {
                webResult.setCode(WebResultCode.BUSINESS_ERROR);
                webResult.setData(false);
            } else {
                webResult.setData(true);
            }
        } catch (Exception e) {
            webResult.setCode(WebResultCode.BUSINESS_ERROR);
            webResult.setMsg(e.getMessage());
            webResult.setData(false);
        }
        return webResult;
    }

    @RequestMapping("delete_agent")
    public @ResponseBody WebResult<Boolean> deleteAgent(HttpServletRequest request,HttpServletResponse response, String agentId) throws Exception {
        WebResult<Boolean> webResult = new WebResult<Boolean>(WebResultCode.SUCCESS);
        try {
            int result = anentService.delete(agentId);
            if (0 == result) {
                webResult.setCode(WebResultCode.BUSINESS_ERROR);
                webResult.setData(false);
            } else {
                webResult.setData(true);
            }
        } catch (Exception e) {
            webResult.setCode(WebResultCode.BUSINESS_ERROR);
            webResult.setMsg(e.getMessage());
            webResult.setData(false);
        }
        return webResult;
    }
    
    public boolean checkCoding(String[] codings, String coding) {
        for (int i = 0; i < codings.length; i++) {
            if (coding.equals(codings[i])) {
                return true;
            }
        }
        return false;
    }
}
