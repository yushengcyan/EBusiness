package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class UserLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLevelExample() {
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

        public Criteria andUserLevelIdIsNull() {
            addCriterion("user_level_id is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdIsNotNull() {
            addCriterion("user_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdEqualTo(Integer value) {
            addCriterion("user_level_id =", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdNotEqualTo(Integer value) {
            addCriterion("user_level_id <>", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdGreaterThan(Integer value) {
            addCriterion("user_level_id >", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level_id >=", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdLessThan(Integer value) {
            addCriterion("user_level_id <", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_level_id <=", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdIn(List<Integer> values) {
            addCriterion("user_level_id in", values, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdNotIn(List<Integer> values) {
            addCriterion("user_level_id not in", values, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("user_level_id between", value1, value2, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level_id not between", value1, value2, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreIsNull() {
            addCriterion("user_level_low_score is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreIsNotNull() {
            addCriterion("user_level_low_score is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreEqualTo(Integer value) {
            addCriterion("user_level_low_score =", value, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreNotEqualTo(Integer value) {
            addCriterion("user_level_low_score <>", value, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreGreaterThan(Integer value) {
            addCriterion("user_level_low_score >", value, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level_low_score >=", value, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreLessThan(Integer value) {
            addCriterion("user_level_low_score <", value, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreLessThanOrEqualTo(Integer value) {
            addCriterion("user_level_low_score <=", value, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreIn(List<Integer> values) {
            addCriterion("user_level_low_score in", values, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreNotIn(List<Integer> values) {
            addCriterion("user_level_low_score not in", values, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreBetween(Integer value1, Integer value2) {
            addCriterion("user_level_low_score between", value1, value2, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelLowScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level_low_score not between", value1, value2, "userLevelLowScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreIsNull() {
            addCriterion("user_level_high_score is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreIsNotNull() {
            addCriterion("user_level_high_score is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreEqualTo(Integer value) {
            addCriterion("user_level_high_score =", value, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreNotEqualTo(Integer value) {
            addCriterion("user_level_high_score <>", value, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreGreaterThan(Integer value) {
            addCriterion("user_level_high_score >", value, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level_high_score >=", value, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreLessThan(Integer value) {
            addCriterion("user_level_high_score <", value, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreLessThanOrEqualTo(Integer value) {
            addCriterion("user_level_high_score <=", value, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreIn(List<Integer> values) {
            addCriterion("user_level_high_score in", values, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreNotIn(List<Integer> values) {
            addCriterion("user_level_high_score not in", values, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreBetween(Integer value1, Integer value2) {
            addCriterion("user_level_high_score between", value1, value2, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelHighScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level_high_score not between", value1, value2, "userLevelHighScore");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameIsNull() {
            addCriterion("user_level_name is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameIsNotNull() {
            addCriterion("user_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameEqualTo(String value) {
            addCriterion("user_level_name =", value, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameNotEqualTo(String value) {
            addCriterion("user_level_name <>", value, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameGreaterThan(String value) {
            addCriterion("user_level_name >", value, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_level_name >=", value, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameLessThan(String value) {
            addCriterion("user_level_name <", value, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameLessThanOrEqualTo(String value) {
            addCriterion("user_level_name <=", value, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameLike(String value) {
            addCriterion("user_level_name like", value, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameNotLike(String value) {
            addCriterion("user_level_name not like", value, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameIn(List<String> values) {
            addCriterion("user_level_name in", values, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameNotIn(List<String> values) {
            addCriterion("user_level_name not in", values, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameBetween(String value1, String value2) {
            addCriterion("user_level_name between", value1, value2, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelNameNotBetween(String value1, String value2) {
            addCriterion("user_level_name not between", value1, value2, "userLevelName");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtIsNull() {
            addCriterion("user_level_ext is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtIsNotNull() {
            addCriterion("user_level_ext is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtEqualTo(String value) {
            addCriterion("user_level_ext =", value, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtNotEqualTo(String value) {
            addCriterion("user_level_ext <>", value, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtGreaterThan(String value) {
            addCriterion("user_level_ext >", value, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtGreaterThanOrEqualTo(String value) {
            addCriterion("user_level_ext >=", value, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtLessThan(String value) {
            addCriterion("user_level_ext <", value, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtLessThanOrEqualTo(String value) {
            addCriterion("user_level_ext <=", value, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtLike(String value) {
            addCriterion("user_level_ext like", value, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtNotLike(String value) {
            addCriterion("user_level_ext not like", value, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtIn(List<String> values) {
            addCriterion("user_level_ext in", values, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtNotIn(List<String> values) {
            addCriterion("user_level_ext not in", values, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtBetween(String value1, String value2) {
            addCriterion("user_level_ext between", value1, value2, "userLevelExt");
            return (Criteria) this;
        }

        public Criteria andUserLevelExtNotBetween(String value1, String value2) {
            addCriterion("user_level_ext not between", value1, value2, "userLevelExt");
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