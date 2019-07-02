package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class CommodityTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityTypeExample() {
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

        public Criteria andCommodityTypeIdIsNull() {
            addCriterion("commodity_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIsNotNull() {
            addCriterion("commodity_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdEqualTo(Integer value) {
            addCriterion("commodity_type_id =", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotEqualTo(Integer value) {
            addCriterion("commodity_type_id <>", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThan(Integer value) {
            addCriterion("commodity_type_id >", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_type_id >=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThan(Integer value) {
            addCriterion("commodity_type_id <", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_type_id <=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIn(List<Integer> values) {
            addCriterion("commodity_type_id in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotIn(List<Integer> values) {
            addCriterion("commodity_type_id not in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_type_id between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_type_id not between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameIsNull() {
            addCriterion("commodity_type_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameIsNotNull() {
            addCriterion("commodity_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameEqualTo(String value) {
            addCriterion("commodity_type_name =", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotEqualTo(String value) {
            addCriterion("commodity_type_name <>", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameGreaterThan(String value) {
            addCriterion("commodity_type_name >", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_type_name >=", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameLessThan(String value) {
            addCriterion("commodity_type_name <", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_type_name <=", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameLike(String value) {
            addCriterion("commodity_type_name like", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotLike(String value) {
            addCriterion("commodity_type_name not like", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameIn(List<String> values) {
            addCriterion("commodity_type_name in", values, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotIn(List<String> values) {
            addCriterion("commodity_type_name not in", values, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameBetween(String value1, String value2) {
            addCriterion("commodity_type_name between", value1, value2, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotBetween(String value1, String value2) {
            addCriterion("commodity_type_name not between", value1, value2, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescIsNull() {
            addCriterion("commodity_type_desc is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescIsNotNull() {
            addCriterion("commodity_type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescEqualTo(String value) {
            addCriterion("commodity_type_desc =", value, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescNotEqualTo(String value) {
            addCriterion("commodity_type_desc <>", value, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescGreaterThan(String value) {
            addCriterion("commodity_type_desc >", value, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_type_desc >=", value, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescLessThan(String value) {
            addCriterion("commodity_type_desc <", value, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescLessThanOrEqualTo(String value) {
            addCriterion("commodity_type_desc <=", value, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescLike(String value) {
            addCriterion("commodity_type_desc like", value, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescNotLike(String value) {
            addCriterion("commodity_type_desc not like", value, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescIn(List<String> values) {
            addCriterion("commodity_type_desc in", values, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescNotIn(List<String> values) {
            addCriterion("commodity_type_desc not in", values, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescBetween(String value1, String value2) {
            addCriterion("commodity_type_desc between", value1, value2, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDescNotBetween(String value1, String value2) {
            addCriterion("commodity_type_desc not between", value1, value2, "commodityTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtIsNull() {
            addCriterion("commodity_type_ext is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtIsNotNull() {
            addCriterion("commodity_type_ext is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtEqualTo(String value) {
            addCriterion("commodity_type_ext =", value, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtNotEqualTo(String value) {
            addCriterion("commodity_type_ext <>", value, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtGreaterThan(String value) {
            addCriterion("commodity_type_ext >", value, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_type_ext >=", value, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtLessThan(String value) {
            addCriterion("commodity_type_ext <", value, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtLessThanOrEqualTo(String value) {
            addCriterion("commodity_type_ext <=", value, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtLike(String value) {
            addCriterion("commodity_type_ext like", value, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtNotLike(String value) {
            addCriterion("commodity_type_ext not like", value, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtIn(List<String> values) {
            addCriterion("commodity_type_ext in", values, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtNotIn(List<String> values) {
            addCriterion("commodity_type_ext not in", values, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtBetween(String value1, String value2) {
            addCriterion("commodity_type_ext between", value1, value2, "commodityTypeExt");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeExtNotBetween(String value1, String value2) {
            addCriterion("commodity_type_ext not between", value1, value2, "commodityTypeExt");
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