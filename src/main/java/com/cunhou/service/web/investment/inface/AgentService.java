package com.cunhou.service.web.investment.inface;

import java.util.List;
import java.util.Map;

import com.cunhou.service.web.common.BaseService;
import com.cunhou.service.web.investment.entry.Agent;

public interface AgentService extends BaseService<Agent> {
    List<Agent> getAgentInfoByCondition(Map<String, Object> params);
}
