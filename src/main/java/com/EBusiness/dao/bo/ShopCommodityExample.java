package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class ShopCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopCommodityExample() {
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

        public Criteria andShopCommodityIdIsNull() {
            addCriterion("shop_commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdIsNotNull() {
            addCriterion("shop_commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdEqualTo(Integer value) {
            addCriterion("shop_commodity_id =", value, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdNotEqualTo(Integer value) {
            addCriterion("shop_commodity_id <>", value, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdGreaterThan(Integer value) {
            addCriterion("shop_commodity_id >", value, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_commodity_id >=", value, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdLessThan(Integer value) {
            addCriterion("shop_commodity_id <", value, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_commodity_id <=", value, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdIn(List<Integer> values) {
            addCriterion("shop_commodity_id in", values, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdNotIn(List<Integer> values) {
            addCriterion("shop_commodity_id not in", values, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_commodity_id between", value1, value2, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_commodity_id not between", value1, value2, "shopCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIsNull() {
            addCriterion("shop_account is null");
            return (Criteria) this;
        }

        public Criteria andShopAccountIsNotNull() {
            addCriterion("shop_account is not null");
            return (Criteria) this;
        }

        public Criteria andShopAccountEqualTo(String value) {
            addCriterion("shop_account =", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotEqualTo(String value) {
            addCriterion("shop_account <>", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountGreaterThan(String value) {
            addCriterion("shop_account >", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountGreaterThanOrEqualTo(String value) {
            addCriterion("shop_account >=", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountLessThan(String value) {
            addCriterion("shop_account <", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountLessThanOrEqualTo(String value) {
            addCriterion("shop_account <=", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountLike(String value) {
            addCriterion("shop_account like", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotLike(String value) {
            addCriterion("shop_account not like", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountIn(List<String> values) {
            addCriterion("shop_account in", values, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotIn(List<String> values) {
            addCriterion("shop_account not in", values, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountBetween(String value1, String value2) {
            addCriterion("shop_account between", value1, value2, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotBetween(String value1, String value2) {
            addCriterion("shop_account not between", value1, value2, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Integer value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Integer value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Integer value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Integer value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Integer> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Integer> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1IsNull() {
            addCriterion("shop_commodity_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1IsNotNull() {
            addCriterion("shop_commodity_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1EqualTo(String value) {
            addCriterion("shop_commodity_ext1 =", value, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1NotEqualTo(String value) {
            addCriterion("shop_commodity_ext1 <>", value, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1GreaterThan(String value) {
            addCriterion("shop_commodity_ext1 >", value, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1GreaterThanOrEqualTo(String value) {
            addCriterion("shop_commodity_ext1 >=", value, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1LessThan(String value) {
            addCriterion("shop_commodity_ext1 <", value, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1LessThanOrEqualTo(String value) {
            addCriterion("shop_commodity_ext1 <=", value, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1Like(String value) {
            addCriterion("shop_commodity_ext1 like", value, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1NotLike(String value) {
            addCriterion("shop_commodity_ext1 not like", value, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1In(List<String> values) {
            addCriterion("shop_commodity_ext1 in", values, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1NotIn(List<String> values) {
            addCriterion("shop_commodity_ext1 not in", values, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1Between(String value1, String value2) {
            addCriterion("shop_commodity_ext1 between", value1, value2, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andShopCommodityExt1NotBetween(String value1, String value2) {
            addCriterion("shop_commodity_ext1 not between", value1, value2, "shopCommodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountIsNull() {
            addCriterion("commodity_discount is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountIsNotNull() {
            addCriterion("commodity_discount is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountEqualTo(Long value) {
            addCriterion("commodity_discount =", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountNotEqualTo(Long value) {
            addCriterion("commodity_discount <>", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountGreaterThan(Long value) {
            addCriterion("commodity_discount >", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_discount >=", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountLessThan(Long value) {
            addCriterion("commodity_discount <", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountLessThanOrEqualTo(Long value) {
            addCriterion("commodity_discount <=", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountIn(List<Long> values) {
            addCriterion("commodity_discount in", values, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountNotIn(List<Long> values) {
            addCriterion("commodity_discount not in", values, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountBetween(Long value1, Long value2) {
            addCriterion("commodity_discount between", value1, value2, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountNotBetween(Long value1, Long value2) {
            addCriterion("commodity_discount not between", value1, value2, "commodityDiscount");
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