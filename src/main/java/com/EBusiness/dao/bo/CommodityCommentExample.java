package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityCommentExample() {
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

        public Criteria andCommodityCommentIdIsNull() {
            addCriterion("commodity_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdIsNotNull() {
            addCriterion("commodity_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdEqualTo(Integer value) {
            addCriterion("commodity_comment_id =", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdNotEqualTo(Integer value) {
            addCriterion("commodity_comment_id <>", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdGreaterThan(Integer value) {
            addCriterion("commodity_comment_id >", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_comment_id >=", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdLessThan(Integer value) {
            addCriterion("commodity_comment_id <", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_comment_id <=", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdIn(List<Integer> values) {
            addCriterion("commodity_comment_id in", values, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdNotIn(List<Integer> values) {
            addCriterion("commodity_comment_id not in", values, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_comment_id between", value1, value2, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_comment_id not between", value1, value2, "commodityCommentId");
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

        public Criteria andCommodityCommentContentIsNull() {
            addCriterion("commodity_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentIsNotNull() {
            addCriterion("commodity_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentEqualTo(String value) {
            addCriterion("commodity_comment_content =", value, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentNotEqualTo(String value) {
            addCriterion("commodity_comment_content <>", value, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentGreaterThan(String value) {
            addCriterion("commodity_comment_content >", value, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_comment_content >=", value, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentLessThan(String value) {
            addCriterion("commodity_comment_content <", value, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentLessThanOrEqualTo(String value) {
            addCriterion("commodity_comment_content <=", value, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentLike(String value) {
            addCriterion("commodity_comment_content like", value, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentNotLike(String value) {
            addCriterion("commodity_comment_content not like", value, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentIn(List<String> values) {
            addCriterion("commodity_comment_content in", values, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentNotIn(List<String> values) {
            addCriterion("commodity_comment_content not in", values, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentBetween(String value1, String value2) {
            addCriterion("commodity_comment_content between", value1, value2, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentContentNotBetween(String value1, String value2) {
            addCriterion("commodity_comment_content not between", value1, value2, "commodityCommentContent");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeIsNull() {
            addCriterion("commodity_comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeIsNotNull() {
            addCriterion("commodity_comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeEqualTo(Date value) {
            addCriterion("commodity_comment_time =", value, "commodityCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeNotEqualTo(Date value) {
            addCriterion("commodity_comment_time <>", value, "commodityCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeGreaterThan(Date value) {
            addCriterion("commodity_comment_time >", value, "commodityCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commodity_comment_time >=", value, "commodityCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeLessThan(Date value) {
            addCriterion("commodity_comment_time <", value, "commodityCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("commodity_comment_time <=", value, "commodityCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeIn(List<Date> values) {
            addCriterion("commodity_comment_time in", values, "commodityCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeNotIn(List<Date> values) {
            addCriterion("commodity_comment_time not in", values, "commodityCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeBetween(Date value1, Date value2) {
            addCriterion("commodity_comment_time between", value1, value2, "commodityCommentTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("commodity_comment_time not between", value1, value2, "commodityCommentTime");
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

        public Criteria andCommodityCommentExtIsNull() {
            addCriterion("commodity_comment_ext is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtIsNotNull() {
            addCriterion("commodity_comment_ext is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtEqualTo(String value) {
            addCriterion("commodity_comment_ext =", value, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtNotEqualTo(String value) {
            addCriterion("commodity_comment_ext <>", value, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtGreaterThan(String value) {
            addCriterion("commodity_comment_ext >", value, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_comment_ext >=", value, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtLessThan(String value) {
            addCriterion("commodity_comment_ext <", value, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtLessThanOrEqualTo(String value) {
            addCriterion("commodity_comment_ext <=", value, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtLike(String value) {
            addCriterion("commodity_comment_ext like", value, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtNotLike(String value) {
            addCriterion("commodity_comment_ext not like", value, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtIn(List<String> values) {
            addCriterion("commodity_comment_ext in", values, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtNotIn(List<String> values) {
            addCriterion("commodity_comment_ext not in", values, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtBetween(String value1, String value2) {
            addCriterion("commodity_comment_ext between", value1, value2, "commodityCommentExt");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentExtNotBetween(String value1, String value2) {
            addCriterion("commodity_comment_ext not between", value1, value2, "commodityCommentExt");
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