package com.cunhou.service.web.investment.entry;

import com.cunhou.service.web.common.BasicBean;
import java.util.Date;

public class Agent extends BasicBean {
    private Integer agentId;

    private OperateInfo operateInfo;

    private String name;

    private String phone;

    private Double intentionMoney;

    private Date createTime;
    
    private String remark;

    private static final long serialVersionUID = 1L;

    public Agent(Integer agentId, OperateInfo operateInfo, String name, String phone, Double intentionMoney, Date createTime) {
        this.agentId = agentId;
        this.operateInfo = operateInfo;
        this.name = name;
        this.phone = phone;
        this.intentionMoney = intentionMoney;
        this.createTime = createTime;
    }

    public Agent() {
        super();
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public OperateInfo getOperateInfo() {
        return operateInfo;
    }

    public void setOperateInfo(OperateInfo operateInfo) {
        this.operateInfo = operateInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Double getIntentionMoney() {
        return intentionMoney;
    }

    public void setIntentionMoney(Double intentionMoney) {
        this.intentionMoney = intentionMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}