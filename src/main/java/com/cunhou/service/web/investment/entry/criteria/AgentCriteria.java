package com.cunhou.service.web.investment.entry.criteria;

import com.cunhou.service.web.investment.entry.OperateInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset = -1;

    protected Integer limitCount = -1;

    public AgentCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount=limitCount;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> operateInfoCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            operateInfoCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getOperateInfoCriteria() {
            return operateInfoCriteria;
        }

        protected void addOperateInfoCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            operateInfoCriteria.add(new Criterion(condition, value, "com.cunhou.service.web.investment.mapper.handler.OperateInfoTypeHandler"));
            allCriteria = null;
        }

        protected void addOperateInfoCriterion(String condition, OperateInfo value1, OperateInfo value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            operateInfoCriteria.add(new Criterion(condition, value1, value2, "com.cunhou.service.web.investment.mapper.handler.OperateInfoTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || operateInfoCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(operateInfoCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andOperateInfoIsNull() {
            addCriterion("operate_id is null");
            return (Criteria) this;
        }

        public Criteria andOperateInfoIsNotNull() {
            addCriterion("operate_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperateInfoEqualTo(OperateInfo value) {
            addOperateInfoCriterion("operate_id =", value, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andOperateInfoNotEqualTo(OperateInfo value) {
            addOperateInfoCriterion("operate_id <>", value, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andOperateInfoGreaterThan(OperateInfo value) {
            addOperateInfoCriterion("operate_id >", value, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andOperateInfoGreaterThanOrEqualTo(OperateInfo value) {
            addOperateInfoCriterion("operate_id >=", value, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andOperateInfoLessThan(OperateInfo value) {
            addOperateInfoCriterion("operate_id <", value, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andOperateInfoLessThanOrEqualTo(OperateInfo value) {
            addOperateInfoCriterion("operate_id <=", value, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andOperateInfoIn(List<OperateInfo> values) {
            addOperateInfoCriterion("operate_id in", values, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andOperateInfoNotIn(List<OperateInfo> values) {
            addOperateInfoCriterion("operate_id not in", values, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andOperateInfoBetween(OperateInfo value1, OperateInfo value2) {
            addOperateInfoCriterion("operate_id between", value1, value2, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andOperateInfoNotBetween(OperateInfo value1, OperateInfo value2) {
            addOperateInfoCriterion("operate_id not between", value1, value2, "operateInfo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyIsNull() {
            addCriterion("intention_money is null");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyIsNotNull() {
            addCriterion("intention_money is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyEqualTo(Double value) {
            addCriterion("intention_money =", value, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyNotEqualTo(Double value) {
            addCriterion("intention_money <>", value, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyGreaterThan(Double value) {
            addCriterion("intention_money >", value, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("intention_money >=", value, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyLessThan(Double value) {
            addCriterion("intention_money <", value, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyLessThanOrEqualTo(Double value) {
            addCriterion("intention_money <=", value, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyIn(List<Double> values) {
            addCriterion("intention_money in", values, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyNotIn(List<Double> values) {
            addCriterion("intention_money not in", values, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyBetween(Double value1, Double value2) {
            addCriterion("intention_money between", value1, value2, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andIntentionMoneyNotBetween(Double value1, Double value2) {
            addCriterion("intention_money not between", value1, value2, "intentionMoney");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}