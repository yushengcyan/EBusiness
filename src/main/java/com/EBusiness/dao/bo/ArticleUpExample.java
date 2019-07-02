package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleUpExample() {
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

        public Criteria andArticleUpIdIsNull() {
            addCriterion("article_up_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdIsNotNull() {
            addCriterion("article_up_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdEqualTo(Integer value) {
            addCriterion("article_up_id =", value, "articleUpId");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdNotEqualTo(Integer value) {
            addCriterion("article_up_id <>", value, "articleUpId");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdGreaterThan(Integer value) {
            addCriterion("article_up_id >", value, "articleUpId");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_up_id >=", value, "articleUpId");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdLessThan(Integer value) {
            addCriterion("article_up_id <", value, "articleUpId");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_up_id <=", value, "articleUpId");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdIn(List<Integer> values) {
            addCriterion("article_up_id in", values, "articleUpId");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdNotIn(List<Integer> values) {
            addCriterion("article_up_id not in", values, "articleUpId");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdBetween(Integer value1, Integer value2) {
            addCriterion("article_up_id between", value1, value2, "articleUpId");
            return (Criteria) this;
        }

        public Criteria andArticleUpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_up_id not between", value1, value2, "articleUpId");
            return (Criteria) this;
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

        public Criteria andArticleUpStatusIsNull() {
            addCriterion("article_up_status is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusIsNotNull() {
            addCriterion("article_up_status is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusEqualTo(Integer value) {
            addCriterion("article_up_status =", value, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusNotEqualTo(Integer value) {
            addCriterion("article_up_status <>", value, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusGreaterThan(Integer value) {
            addCriterion("article_up_status >", value, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_up_status >=", value, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusLessThan(Integer value) {
            addCriterion("article_up_status <", value, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("article_up_status <=", value, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusIn(List<Integer> values) {
            addCriterion("article_up_status in", values, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusNotIn(List<Integer> values) {
            addCriterion("article_up_status not in", values, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusBetween(Integer value1, Integer value2) {
            addCriterion("article_up_status between", value1, value2, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("article_up_status not between", value1, value2, "articleUpStatus");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeIsNull() {
            addCriterion("article_up_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeIsNotNull() {
            addCriterion("article_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeEqualTo(Date value) {
            addCriterion("article_up_time =", value, "articleUpTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeNotEqualTo(Date value) {
            addCriterion("article_up_time <>", value, "articleUpTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeGreaterThan(Date value) {
            addCriterion("article_up_time >", value, "articleUpTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_up_time >=", value, "articleUpTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeLessThan(Date value) {
            addCriterion("article_up_time <", value, "articleUpTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("article_up_time <=", value, "articleUpTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeIn(List<Date> values) {
            addCriterion("article_up_time in", values, "articleUpTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeNotIn(List<Date> values) {
            addCriterion("article_up_time not in", values, "articleUpTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeBetween(Date value1, Date value2) {
            addCriterion("article_up_time between", value1, value2, "articleUpTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("article_up_time not between", value1, value2, "articleUpTime");
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