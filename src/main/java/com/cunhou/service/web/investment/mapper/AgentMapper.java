package com.cunhou.service.web.investment.mapper;

import com.cunhou.service.web.investment.entry.Agent;
import com.cunhou.service.web.investment.entry.criteria.AgentCriteria;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentMapper {
    int countByCriteria(AgentCriteria example);

    int deleteByCriteria(AgentCriteria example);

    int deleteByPrimaryKey(Integer agentId);

    int insert(Agent record);

    int insertSelective(Agent record);

    List<Agent> selectByCriteria(AgentCriteria example);

    Agent selectByPrimaryKey(Integer agentId);

    int updateByCriteriaSelective(@Param("record") Agent record, @Param("example") AgentCriteria example);

    int updateByCriteria(@Param("record") Agent record, @Param("example") AgentCriteria example);

    int updateByPrimaryKeySelective(Agent record);

    int updateByPrimaryKey(Agent record);
    
    List<Agent> getAgentInfoByCondition(Map<String, Object> params);
}