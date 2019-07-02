package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class ShopLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopLevelExample() {
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

        public Criteria andShopLevelIdIsNull() {
            addCriterion("shop_level_id is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdIsNotNull() {
            addCriterion("shop_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdEqualTo(Integer value) {
            addCriterion("shop_level_id =", value, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdNotEqualTo(Integer value) {
            addCriterion("shop_level_id <>", value, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdGreaterThan(Integer value) {
            addCriterion("shop_level_id >", value, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_level_id >=", value, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdLessThan(Integer value) {
            addCriterion("shop_level_id <", value, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_level_id <=", value, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdIn(List<Integer> values) {
            addCriterion("shop_level_id in", values, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdNotIn(List<Integer> values) {
            addCriterion("shop_level_id not in", values, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_level_id between", value1, value2, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_level_id not between", value1, value2, "shopLevelId");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameIsNull() {
            addCriterion("shop_level_name is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameIsNotNull() {
            addCriterion("shop_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameEqualTo(String value) {
            addCriterion("shop_level_name =", value, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameNotEqualTo(String value) {
            addCriterion("shop_level_name <>", value, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameGreaterThan(String value) {
            addCriterion("shop_level_name >", value, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_level_name >=", value, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameLessThan(String value) {
            addCriterion("shop_level_name <", value, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameLessThanOrEqualTo(String value) {
            addCriterion("shop_level_name <=", value, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameLike(String value) {
            addCriterion("shop_level_name like", value, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameNotLike(String value) {
            addCriterion("shop_level_name not like", value, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameIn(List<String> values) {
            addCriterion("shop_level_name in", values, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameNotIn(List<String> values) {
            addCriterion("shop_level_name not in", values, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameBetween(String value1, String value2) {
            addCriterion("shop_level_name between", value1, value2, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelNameNotBetween(String value1, String value2) {
            addCriterion("shop_level_name not between", value1, value2, "shopLevelName");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowIsNull() {
            addCriterion("shop_level_low is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowIsNotNull() {
            addCriterion("shop_level_low is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowEqualTo(String value) {
            addCriterion("shop_level_low =", value, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowNotEqualTo(String value) {
            addCriterion("shop_level_low <>", value, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowGreaterThan(String value) {
            addCriterion("shop_level_low >", value, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowGreaterThanOrEqualTo(String value) {
            addCriterion("shop_level_low >=", value, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowLessThan(String value) {
            addCriterion("shop_level_low <", value, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowLessThanOrEqualTo(String value) {
            addCriterion("shop_level_low <=", value, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowLike(String value) {
            addCriterion("shop_level_low like", value, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowNotLike(String value) {
            addCriterion("shop_level_low not like", value, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowIn(List<String> values) {
            addCriterion("shop_level_low in", values, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowNotIn(List<String> values) {
            addCriterion("shop_level_low not in", values, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowBetween(String value1, String value2) {
            addCriterion("shop_level_low between", value1, value2, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelLowNotBetween(String value1, String value2) {
            addCriterion("shop_level_low not between", value1, value2, "shopLevelLow");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighIsNull() {
            addCriterion("shop_level_high is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighIsNotNull() {
            addCriterion("shop_level_high is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighEqualTo(String value) {
            addCriterion("shop_level_high =", value, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighNotEqualTo(String value) {
            addCriterion("shop_level_high <>", value, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighGreaterThan(String value) {
            addCriterion("shop_level_high >", value, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighGreaterThanOrEqualTo(String value) {
            addCriterion("shop_level_high >=", value, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighLessThan(String value) {
            addCriterion("shop_level_high <", value, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighLessThanOrEqualTo(String value) {
            addCriterion("shop_level_high <=", value, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighLike(String value) {
            addCriterion("shop_level_high like", value, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighNotLike(String value) {
            addCriterion("shop_level_high not like", value, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighIn(List<String> values) {
            addCriterion("shop_level_high in", values, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighNotIn(List<String> values) {
            addCriterion("shop_level_high not in", values, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighBetween(String value1, String value2) {
            addCriterion("shop_level_high between", value1, value2, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelHighNotBetween(String value1, String value2) {
            addCriterion("shop_level_high not between", value1, value2, "shopLevelHigh");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescIsNull() {
            addCriterion("shop_level_desc is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescIsNotNull() {
            addCriterion("shop_level_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescEqualTo(String value) {
            addCriterion("shop_level_desc =", value, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescNotEqualTo(String value) {
            addCriterion("shop_level_desc <>", value, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescGreaterThan(String value) {
            addCriterion("shop_level_desc >", value, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescGreaterThanOrEqualTo(String value) {
            addCriterion("shop_level_desc >=", value, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescLessThan(String value) {
            addCriterion("shop_level_desc <", value, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescLessThanOrEqualTo(String value) {
            addCriterion("shop_level_desc <=", value, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescLike(String value) {
            addCriterion("shop_level_desc like", value, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescNotLike(String value) {
            addCriterion("shop_level_desc not like", value, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescIn(List<String> values) {
            addCriterion("shop_level_desc in", values, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescNotIn(List<String> values) {
            addCriterion("shop_level_desc not in", values, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescBetween(String value1, String value2) {
            addCriterion("shop_level_desc between", value1, value2, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelDescNotBetween(String value1, String value2) {
            addCriterion("shop_level_desc not between", value1, value2, "shopLevelDesc");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtIsNull() {
            addCriterion("shop_level_ext is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtIsNotNull() {
            addCriterion("shop_level_ext is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtEqualTo(String value) {
            addCriterion("shop_level_ext =", value, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtNotEqualTo(String value) {
            addCriterion("shop_level_ext <>", value, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtGreaterThan(String value) {
            addCriterion("shop_level_ext >", value, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtGreaterThanOrEqualTo(String value) {
            addCriterion("shop_level_ext >=", value, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtLessThan(String value) {
            addCriterion("shop_level_ext <", value, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtLessThanOrEqualTo(String value) {
            addCriterion("shop_level_ext <=", value, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtLike(String value) {
            addCriterion("shop_level_ext like", value, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtNotLike(String value) {
            addCriterion("shop_level_ext not like", value, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtIn(List<String> values) {
            addCriterion("shop_level_ext in", values, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtNotIn(List<String> values) {
            addCriterion("shop_level_ext not in", values, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtBetween(String value1, String value2) {
            addCriterion("shop_level_ext between", value1, value2, "shopLevelExt");
            return (Criteria) this;
        }

        public Criteria andShopLevelExtNotBetween(String value1, String value2) {
            addCriterion("shop_level_ext not between", value1, value2, "shopLevelExt");
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