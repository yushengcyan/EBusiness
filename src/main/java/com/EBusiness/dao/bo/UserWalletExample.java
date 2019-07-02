package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserWalletExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserWalletExample() {
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

        public Criteria andUserWalletIdIsNull() {
            addCriterion("user_wallet_id is null");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdIsNotNull() {
            addCriterion("user_wallet_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdEqualTo(Integer value) {
            addCriterion("user_wallet_id =", value, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdNotEqualTo(Integer value) {
            addCriterion("user_wallet_id <>", value, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdGreaterThan(Integer value) {
            addCriterion("user_wallet_id >", value, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_wallet_id >=", value, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdLessThan(Integer value) {
            addCriterion("user_wallet_id <", value, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_wallet_id <=", value, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdIn(List<Integer> values) {
            addCriterion("user_wallet_id in", values, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdNotIn(List<Integer> values) {
            addCriterion("user_wallet_id not in", values, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdBetween(Integer value1, Integer value2) {
            addCriterion("user_wallet_id between", value1, value2, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserWalletIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_wallet_id not between", value1, value2, "userWalletId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIsNull() {
            addCriterion("user_balance is null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIsNotNull() {
            addCriterion("user_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceEqualTo(Long value) {
            addCriterion("user_balance =", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotEqualTo(Long value) {
            addCriterion("user_balance <>", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThan(Long value) {
            addCriterion("user_balance >", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("user_balance >=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThan(Long value) {
            addCriterion("user_balance <", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThanOrEqualTo(Long value) {
            addCriterion("user_balance <=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIn(List<Long> values) {
            addCriterion("user_balance in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotIn(List<Long> values) {
            addCriterion("user_balance not in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceBetween(Long value1, Long value2) {
            addCriterion("user_balance between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotBetween(Long value1, Long value2) {
            addCriterion("user_balance not between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionIsNull() {
            addCriterion("user_consumption is null");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionIsNotNull() {
            addCriterion("user_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionEqualTo(Long value) {
            addCriterion("user_consumption =", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionNotEqualTo(Long value) {
            addCriterion("user_consumption <>", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionGreaterThan(Long value) {
            addCriterion("user_consumption >", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionGreaterThanOrEqualTo(Long value) {
            addCriterion("user_consumption >=", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionLessThan(Long value) {
            addCriterion("user_consumption <", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionLessThanOrEqualTo(Long value) {
            addCriterion("user_consumption <=", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionIn(List<Long> values) {
            addCriterion("user_consumption in", values, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionNotIn(List<Long> values) {
            addCriterion("user_consumption not in", values, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionBetween(Long value1, Long value2) {
            addCriterion("user_consumption between", value1, value2, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionNotBetween(Long value1, Long value2) {
            addCriterion("user_consumption not between", value1, value2, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeIsNull() {
            addCriterion("user_walete_time is null");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeIsNotNull() {
            addCriterion("user_walete_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeEqualTo(Date value) {
            addCriterion("user_walete_time =", value, "userWaleteTime");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeNotEqualTo(Date value) {
            addCriterion("user_walete_time <>", value, "userWaleteTime");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeGreaterThan(Date value) {
            addCriterion("user_walete_time >", value, "userWaleteTime");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_walete_time >=", value, "userWaleteTime");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeLessThan(Date value) {
            addCriterion("user_walete_time <", value, "userWaleteTime");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_walete_time <=", value, "userWaleteTime");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeIn(List<Date> values) {
            addCriterion("user_walete_time in", values, "userWaleteTime");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeNotIn(List<Date> values) {
            addCriterion("user_walete_time not in", values, "userWaleteTime");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeBetween(Date value1, Date value2) {
            addCriterion("user_walete_time between", value1, value2, "userWaleteTime");
            return (Criteria) this;
        }

        public Criteria andUserWaleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_walete_time not between", value1, value2, "userWaleteTime");
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