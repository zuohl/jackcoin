package com.cunhou.service.web.investment.entry.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchUserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset = -1;

    protected Integer limitCount = -1;

    public MatchUserCriteria() {
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
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCerttypeIsNull() {
            addCriterion("certtype is null");
            return (Criteria) this;
        }

        public Criteria andCerttypeIsNotNull() {
            addCriterion("certtype is not null");
            return (Criteria) this;
        }

        public Criteria andCerttypeEqualTo(String value) {
            addCriterion("certtype =", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotEqualTo(String value) {
            addCriterion("certtype <>", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeGreaterThan(String value) {
            addCriterion("certtype >", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeGreaterThanOrEqualTo(String value) {
            addCriterion("certtype >=", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLessThan(String value) {
            addCriterion("certtype <", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLessThanOrEqualTo(String value) {
            addCriterion("certtype <=", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLike(String value) {
            addCriterion("certtype like", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotLike(String value) {
            addCriterion("certtype not like", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeIn(List<String> values) {
            addCriterion("certtype in", values, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotIn(List<String> values) {
            addCriterion("certtype not in", values, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeBetween(String value1, String value2) {
            addCriterion("certtype between", value1, value2, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotBetween(String value1, String value2) {
            addCriterion("certtype not between", value1, value2, "certtype");
            return (Criteria) this;
        }

        public Criteria andCertnumIsNull() {
            addCriterion("certnum is null");
            return (Criteria) this;
        }

        public Criteria andCertnumIsNotNull() {
            addCriterion("certnum is not null");
            return (Criteria) this;
        }

        public Criteria andCertnumEqualTo(String value) {
            addCriterion("certnum =", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotEqualTo(String value) {
            addCriterion("certnum <>", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumGreaterThan(String value) {
            addCriterion("certnum >", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumGreaterThanOrEqualTo(String value) {
            addCriterion("certnum >=", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLessThan(String value) {
            addCriterion("certnum <", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLessThanOrEqualTo(String value) {
            addCriterion("certnum <=", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLike(String value) {
            addCriterion("certnum like", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotLike(String value) {
            addCriterion("certnum not like", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumIn(List<String> values) {
            addCriterion("certnum in", values, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotIn(List<String> values) {
            addCriterion("certnum not in", values, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumBetween(String value1, String value2) {
            addCriterion("certnum between", value1, value2, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotBetween(String value1, String value2) {
            addCriterion("certnum not between", value1, value2, "certnum");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("bankname is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankname is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankname =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankname <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankname >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankname >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankname <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankname <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankname like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankname not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankname in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankname not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankname between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankname not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNull() {
            addCriterion("banknumber is null");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNotNull() {
            addCriterion("banknumber is not null");
            return (Criteria) this;
        }

        public Criteria andBanknumberEqualTo(String value) {
            addCriterion("banknumber =", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotEqualTo(String value) {
            addCriterion("banknumber <>", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThan(String value) {
            addCriterion("banknumber >", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("banknumber >=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThan(String value) {
            addCriterion("banknumber <", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThanOrEqualTo(String value) {
            addCriterion("banknumber <=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLike(String value) {
            addCriterion("banknumber like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotLike(String value) {
            addCriterion("banknumber not like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberIn(List<String> values) {
            addCriterion("banknumber in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotIn(List<String> values) {
            addCriterion("banknumber not in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberBetween(String value1, String value2) {
            addCriterion("banknumber between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotBetween(String value1, String value2) {
            addCriterion("banknumber not between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andAccountorgIsNull() {
            addCriterion("accountOrg is null");
            return (Criteria) this;
        }

        public Criteria andAccountorgIsNotNull() {
            addCriterion("accountOrg is not null");
            return (Criteria) this;
        }

        public Criteria andAccountorgEqualTo(String value) {
            addCriterion("accountOrg =", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgNotEqualTo(String value) {
            addCriterion("accountOrg <>", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgGreaterThan(String value) {
            addCriterion("accountOrg >", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgGreaterThanOrEqualTo(String value) {
            addCriterion("accountOrg >=", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgLessThan(String value) {
            addCriterion("accountOrg <", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgLessThanOrEqualTo(String value) {
            addCriterion("accountOrg <=", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgLike(String value) {
            addCriterion("accountOrg like", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgNotLike(String value) {
            addCriterion("accountOrg not like", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgIn(List<String> values) {
            addCriterion("accountOrg in", values, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgNotIn(List<String> values) {
            addCriterion("accountOrg not in", values, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgBetween(String value1, String value2) {
            addCriterion("accountOrg between", value1, value2, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgNotBetween(String value1, String value2) {
            addCriterion("accountOrg not between", value1, value2, "accountorg");
            return (Criteria) this;
        }

        public Criteria andInvestortypeIsNull() {
            addCriterion("investorType is null");
            return (Criteria) this;
        }

        public Criteria andInvestortypeIsNotNull() {
            addCriterion("investorType is not null");
            return (Criteria) this;
        }

        public Criteria andInvestortypeEqualTo(String value) {
            addCriterion("investorType =", value, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeNotEqualTo(String value) {
            addCriterion("investorType <>", value, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeGreaterThan(String value) {
            addCriterion("investorType >", value, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeGreaterThanOrEqualTo(String value) {
            addCriterion("investorType >=", value, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeLessThan(String value) {
            addCriterion("investorType <", value, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeLessThanOrEqualTo(String value) {
            addCriterion("investorType <=", value, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeLike(String value) {
            addCriterion("investorType like", value, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeNotLike(String value) {
            addCriterion("investorType not like", value, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeIn(List<String> values) {
            addCriterion("investorType in", values, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeNotIn(List<String> values) {
            addCriterion("investorType not in", values, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeBetween(String value1, String value2) {
            addCriterion("investorType between", value1, value2, "investortype");
            return (Criteria) this;
        }

        public Criteria andInvestortypeNotBetween(String value1, String value2) {
            addCriterion("investorType not between", value1, value2, "investortype");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEmercontactIsNull() {
            addCriterion("emerContact is null");
            return (Criteria) this;
        }

        public Criteria andEmercontactIsNotNull() {
            addCriterion("emerContact is not null");
            return (Criteria) this;
        }

        public Criteria andEmercontactEqualTo(String value) {
            addCriterion("emerContact =", value, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactNotEqualTo(String value) {
            addCriterion("emerContact <>", value, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactGreaterThan(String value) {
            addCriterion("emerContact >", value, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactGreaterThanOrEqualTo(String value) {
            addCriterion("emerContact >=", value, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactLessThan(String value) {
            addCriterion("emerContact <", value, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactLessThanOrEqualTo(String value) {
            addCriterion("emerContact <=", value, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactLike(String value) {
            addCriterion("emerContact like", value, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactNotLike(String value) {
            addCriterion("emerContact not like", value, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactIn(List<String> values) {
            addCriterion("emerContact in", values, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactNotIn(List<String> values) {
            addCriterion("emerContact not in", values, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactBetween(String value1, String value2) {
            addCriterion("emerContact between", value1, value2, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactNotBetween(String value1, String value2) {
            addCriterion("emerContact not between", value1, value2, "emercontact");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneIsNull() {
            addCriterion("emerContactPhone is null");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneIsNotNull() {
            addCriterion("emerContactPhone is not null");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneEqualTo(String value) {
            addCriterion("emerContactPhone =", value, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneNotEqualTo(String value) {
            addCriterion("emerContactPhone <>", value, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneGreaterThan(String value) {
            addCriterion("emerContactPhone >", value, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("emerContactPhone >=", value, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneLessThan(String value) {
            addCriterion("emerContactPhone <", value, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneLessThanOrEqualTo(String value) {
            addCriterion("emerContactPhone <=", value, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneLike(String value) {
            addCriterion("emerContactPhone like", value, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneNotLike(String value) {
            addCriterion("emerContactPhone not like", value, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneIn(List<String> values) {
            addCriterion("emerContactPhone in", values, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneNotIn(List<String> values) {
            addCriterion("emerContactPhone not in", values, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneBetween(String value1, String value2) {
            addCriterion("emerContactPhone between", value1, value2, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andEmercontactphoneNotBetween(String value1, String value2) {
            addCriterion("emerContactPhone not between", value1, value2, "emercontactphone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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