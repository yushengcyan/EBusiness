package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
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

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleComtentIsNull() {
            addCriterion("article_comtent is null");
            return (Criteria) this;
        }

        public Criteria andArticleComtentIsNotNull() {
            addCriterion("article_comtent is not null");
            return (Criteria) this;
        }

        public Criteria andArticleComtentEqualTo(String value) {
            addCriterion("article_comtent =", value, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentNotEqualTo(String value) {
            addCriterion("article_comtent <>", value, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentGreaterThan(String value) {
            addCriterion("article_comtent >", value, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentGreaterThanOrEqualTo(String value) {
            addCriterion("article_comtent >=", value, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentLessThan(String value) {
            addCriterion("article_comtent <", value, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentLessThanOrEqualTo(String value) {
            addCriterion("article_comtent <=", value, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentLike(String value) {
            addCriterion("article_comtent like", value, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentNotLike(String value) {
            addCriterion("article_comtent not like", value, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentIn(List<String> values) {
            addCriterion("article_comtent in", values, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentNotIn(List<String> values) {
            addCriterion("article_comtent not in", values, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentBetween(String value1, String value2) {
            addCriterion("article_comtent between", value1, value2, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleComtentNotBetween(String value1, String value2) {
            addCriterion("article_comtent not between", value1, value2, "articleComtent");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdIsNull() {
            addCriterion("article_type_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdIsNotNull() {
            addCriterion("article_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdEqualTo(Integer value) {
            addCriterion("article_type_id =", value, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdNotEqualTo(Integer value) {
            addCriterion("article_type_id <>", value, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdGreaterThan(Integer value) {
            addCriterion("article_type_id >", value, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_type_id >=", value, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdLessThan(Integer value) {
            addCriterion("article_type_id <", value, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_type_id <=", value, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdIn(List<Integer> values) {
            addCriterion("article_type_id in", values, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdNotIn(List<Integer> values) {
            addCriterion("article_type_id not in", values, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("article_type_id between", value1, value2, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_type_id not between", value1, value2, "articleTypeId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeIsNull() {
            addCriterion("article_first_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeIsNotNull() {
            addCriterion("article_first_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeEqualTo(Date value) {
            addCriterion("article_first_time =", value, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeNotEqualTo(Date value) {
            addCriterion("article_first_time <>", value, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeGreaterThan(Date value) {
            addCriterion("article_first_time >", value, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_first_time >=", value, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeLessThan(Date value) {
            addCriterion("article_first_time <", value, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeLessThanOrEqualTo(Date value) {
            addCriterion("article_first_time <=", value, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeIn(List<Date> values) {
            addCriterion("article_first_time in", values, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeNotIn(List<Date> values) {
            addCriterion("article_first_time not in", values, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeBetween(Date value1, Date value2) {
            addCriterion("article_first_time between", value1, value2, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andArticleFirstTimeNotBetween(Date value1, Date value2) {
            addCriterion("article_first_time not between", value1, value2, "articleFirstTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeIsNull() {
            addCriterion("atricle_last_time is null");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeIsNotNull() {
            addCriterion("atricle_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeEqualTo(Date value) {
            addCriterion("atricle_last_time =", value, "atricleLastTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeNotEqualTo(Date value) {
            addCriterion("atricle_last_time <>", value, "atricleLastTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeGreaterThan(Date value) {
            addCriterion("atricle_last_time >", value, "atricleLastTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("atricle_last_time >=", value, "atricleLastTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeLessThan(Date value) {
            addCriterion("atricle_last_time <", value, "atricleLastTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("atricle_last_time <=", value, "atricleLastTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeIn(List<Date> values) {
            addCriterion("atricle_last_time in", values, "atricleLastTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeNotIn(List<Date> values) {
            addCriterion("atricle_last_time not in", values, "atricleLastTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeBetween(Date value1, Date value2) {
            addCriterion("atricle_last_time between", value1, value2, "atricleLastTime");
            return (Criteria) this;
        }

        public Criteria andAtricleLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("atricle_last_time not between", value1, value2, "atricleLastTime");
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