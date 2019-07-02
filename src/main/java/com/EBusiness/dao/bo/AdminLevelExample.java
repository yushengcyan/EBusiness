package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class AdminLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminLevelExample() {
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

        public Criteria andAdminLevelIdIsNull() {
            addCriterion("admin_level_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdIsNotNull() {
            addCriterion("admin_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdEqualTo(Integer value) {
            addCriterion("admin_level_id =", value, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdNotEqualTo(Integer value) {
            addCriterion("admin_level_id <>", value, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdGreaterThan(Integer value) {
            addCriterion("admin_level_id >", value, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_level_id >=", value, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdLessThan(Integer value) {
            addCriterion("admin_level_id <", value, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_level_id <=", value, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdIn(List<Integer> values) {
            addCriterion("admin_level_id in", values, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdNotIn(List<Integer> values) {
            addCriterion("admin_level_id not in", values, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_level_id between", value1, value2, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_level_id not between", value1, value2, "adminLevelId");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleIsNull() {
            addCriterion("admin_level_role is null");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleIsNotNull() {
            addCriterion("admin_level_role is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleEqualTo(String value) {
            addCriterion("admin_level_role =", value, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleNotEqualTo(String value) {
            addCriterion("admin_level_role <>", value, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleGreaterThan(String value) {
            addCriterion("admin_level_role >", value, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleGreaterThanOrEqualTo(String value) {
            addCriterion("admin_level_role >=", value, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleLessThan(String value) {
            addCriterion("admin_level_role <", value, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleLessThanOrEqualTo(String value) {
            addCriterion("admin_level_role <=", value, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleLike(String value) {
            addCriterion("admin_level_role like", value, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleNotLike(String value) {
            addCriterion("admin_level_role not like", value, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleIn(List<String> values) {
            addCriterion("admin_level_role in", values, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleNotIn(List<String> values) {
            addCriterion("admin_level_role not in", values, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleBetween(String value1, String value2) {
            addCriterion("admin_level_role between", value1, value2, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelRoleNotBetween(String value1, String value2) {
            addCriterion("admin_level_role not between", value1, value2, "adminLevelRole");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescIsNull() {
            addCriterion("admin_level_desc is null");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescIsNotNull() {
            addCriterion("admin_level_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescEqualTo(String value) {
            addCriterion("admin_level_desc =", value, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescNotEqualTo(String value) {
            addCriterion("admin_level_desc <>", value, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescGreaterThan(String value) {
            addCriterion("admin_level_desc >", value, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescGreaterThanOrEqualTo(String value) {
            addCriterion("admin_level_desc >=", value, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescLessThan(String value) {
            addCriterion("admin_level_desc <", value, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescLessThanOrEqualTo(String value) {
            addCriterion("admin_level_desc <=", value, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescLike(String value) {
            addCriterion("admin_level_desc like", value, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescNotLike(String value) {
            addCriterion("admin_level_desc not like", value, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescIn(List<String> values) {
            addCriterion("admin_level_desc in", values, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescNotIn(List<String> values) {
            addCriterion("admin_level_desc not in", values, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescBetween(String value1, String value2) {
            addCriterion("admin_level_desc between", value1, value2, "adminLevelDesc");
            return (Criteria) this;
        }

        public Criteria andAdminLevelDescNotBetween(String value1, String value2) {
            addCriterion("admin_level_desc not between", value1, value2, "adminLevelDesc");
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