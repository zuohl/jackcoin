package com.cunhou.service.web.investment.dubbo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cunhou.service.web.common.PageView;
import com.cunhou.service.web.exception.YuehouServiceException;
import com.cunhou.service.web.investment.entry.Agent;
import com.cunhou.service.web.investment.inface.AgentService;
import com.cunhou.service.web.investment.mapper.AgentMapper;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentMapper agentMapper;
    
    @Override
    public List<Agent> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int delete(String id) throws YuehouServiceException {
        return agentMapper.deleteByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public int update(Agent t) throws YuehouServiceException {
        int i = agentMapper.updateByPrimaryKey(t);
        return i;
    }

    @Override
    public Agent findById(String id) {
        // TODO Auto-generated method stub
        return agentMapper.selectByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public int add(Agent t) throws YuehouServiceException {
        return agentMapper.insert(t);
    }

    @Override
    public PageView findPage(PageView pageView, Agent t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Agent> getAgentInfoByCondition(Map<String, Object> params) {
        //AgentCriteria example 
        //agentMapper.selectByCriteria(example)
        return agentMapper.getAgentInfoByCondition(params);
    }

    

}
