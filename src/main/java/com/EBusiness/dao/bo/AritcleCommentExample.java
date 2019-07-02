package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AritcleCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AritcleCommentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andArticleCommentIdIsNull() {
            addCriterion("article_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdIsNotNull() {
            addCriterion("article_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdEqualTo(Integer value) {
            addCriterion("article_comment_id =", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdNotEqualTo(Integer value) {
            addCriterion("article_comment_id <>", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdGreaterThan(Integer value) {
            addCriterion("article_comment_id >", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_id >=", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdLessThan(Integer value) {
            addCriterion("article_comment_id <", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_id <=", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdIn(List<Integer> values) {
            addCriterion("article_comment_id in", values, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdNotIn(List<Integer> values) {
            addCriterion("article_comment_id not in", values, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_id between", value1, value2, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_id not between", value1, value2, "articleCommentId");
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

        public Criteria andAuthorAccountIsNull() {
            addCriterion("author_account is null");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountIsNotNull() {
            addCriterion("author_account is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountEqualTo(String value) {
            addCriterion("author_account =", value, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountNotEqualTo(String value) {
            addCriterion("author_account <>", value, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountGreaterThan(String value) {
            addCriterion("author_account >", value, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountGreaterThanOrEqualTo(String value) {
            addCriterion("author_account >=", value, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountLessThan(String value) {
            addCriterion("author_account <", value, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountLessThanOrEqualTo(String value) {
            addCriterion("author_account <=", value, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountLike(String value) {
            addCriterion("author_account like", value, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountNotLike(String value) {
            addCriterion("author_account not like", value, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountIn(List<String> values) {
            addCriterion("author_account in", values, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountNotIn(List<String> values) {
            addCriterion("author_account not in", values, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountBetween(String value1, String value2) {
            addCriterion("author_account between", value1, value2, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andAuthorAccountNotBetween(String value1, String value2) {
            addCriterion("author_account not between", value1, value2, "authorAccount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentIsNull() {
            addCriterion("article_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentIsNotNull() {
            addCriterion("article_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentEqualTo(String value) {
            addCriterion("article_comment_content =", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentNotEqualTo(String value) {
            addCriterion("article_comment_content <>", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentGreaterThan(String value) {
            addCriterion("article_comment_content >", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("article_comment_content >=", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentLessThan(String value) {
            addCriterion("article_comment_content <", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentLessThanOrEqualTo(String value) {
            addCriterion("article_comment_content <=", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentLike(String value) {
            addCriterion("article_comment_content like", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentNotLike(String value) {
            addCriterion("article_comment_content not like", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentIn(List<String> values) {
            addCriterion("article_comment_content in", values, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentNotIn(List<String> values) {
            addCriterion("article_comment_content not in", values, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentBetween(String value1, String value2) {
            addCriterion("article_comment_content between", value1, value2, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentNotBetween(String value1, String value2) {
            addCriterion("article_comment_content not between", value1, value2, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecIsNull() {
            addCriterion("article_comment_sec is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecIsNotNull() {
            addCriterion("article_comment_sec is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecEqualTo(Integer value) {
            addCriterion("article_comment_sec =", value, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecNotEqualTo(Integer value) {
            addCriterion("article_comment_sec <>", value, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecGreaterThan(Integer value) {
            addCriterion("article_comment_sec >", value, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_sec >=", value, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecLessThan(Integer value) {
            addCriterion("article_comment_sec <", value, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_sec <=", value, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecIn(List<Integer> values) {
            addCriterion("article_comment_sec in", values, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecNotIn(List<Integer> values) {
            addCriterion("article_comment_sec not in", values, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_sec between", value1, value2, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentSecNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_sec not between", value1, value2, "articleCommentSec");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeIsNull() {
            addCriterion("article_comment_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeIsNotNull() {
            addCriterion("article_comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeEqualTo(Date value) {
            addCriterionForJDBCDate("article_comment_time =", value, "articleCommentTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("article_comment_time <>", value, "articleCommentTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("article_comment_time >", value, "articleCommentTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("article_comment_time >=", value, "articleCommentTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeLessThan(Date value) {
            addCriterionForJDBCDate("article_comment_time <", value, "articleCommentTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("article_comment_time <=", value, "articleCommentTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeIn(List<Date> values) {
            addCriterionForJDBCDate("article_comment_time in", values, "articleCommentTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("article_comment_time not in", values, "articleCommentTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("article_comment_time between", value1, value2, "articleCommentTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("article_comment_time not between", value1, value2, "articleCommentTime");
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