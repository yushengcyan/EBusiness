package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCollectionExample() {
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

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(Integer value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(Integer value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(Integer value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(Integer value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<Integer> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<Integer> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
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

        public Criteria andCollectedAccoutIsNull() {
            addCriterion("collected_accout is null");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutIsNotNull() {
            addCriterion("collected_accout is not null");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutEqualTo(String value) {
            addCriterion("collected_accout =", value, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutNotEqualTo(String value) {
            addCriterion("collected_accout <>", value, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutGreaterThan(String value) {
            addCriterion("collected_accout >", value, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutGreaterThanOrEqualTo(String value) {
            addCriterion("collected_accout >=", value, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutLessThan(String value) {
            addCriterion("collected_accout <", value, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutLessThanOrEqualTo(String value) {
            addCriterion("collected_accout <=", value, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutLike(String value) {
            addCriterion("collected_accout like", value, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutNotLike(String value) {
            addCriterion("collected_accout not like", value, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutIn(List<String> values) {
            addCriterion("collected_accout in", values, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutNotIn(List<String> values) {
            addCriterion("collected_accout not in", values, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutBetween(String value1, String value2) {
            addCriterion("collected_accout between", value1, value2, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectedAccoutNotBetween(String value1, String value2) {
            addCriterion("collected_accout not between", value1, value2, "collectedAccout");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusIsNull() {
            addCriterion("collection_status is null");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusIsNotNull() {
            addCriterion("collection_status is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusEqualTo(Integer value) {
            addCriterion("collection_status =", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusNotEqualTo(Integer value) {
            addCriterion("collection_status <>", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusGreaterThan(Integer value) {
            addCriterion("collection_status >", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_status >=", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusLessThan(Integer value) {
            addCriterion("collection_status <", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("collection_status <=", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusIn(List<Integer> values) {
            addCriterion("collection_status in", values, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusNotIn(List<Integer> values) {
            addCriterion("collection_status not in", values, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusBetween(Integer value1, Integer value2) {
            addCriterion("collection_status between", value1, value2, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_status not between", value1, value2, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNull() {
            addCriterion("collection_type is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNotNull() {
            addCriterion("collection_type is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeEqualTo(Integer value) {
            addCriterion("collection_type =", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotEqualTo(Integer value) {
            addCriterion("collection_type <>", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThan(Integer value) {
            addCriterion("collection_type >", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_type >=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThan(Integer value) {
            addCriterion("collection_type <", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("collection_type <=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIn(List<Integer> values) {
            addCriterion("collection_type in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotIn(List<Integer> values) {
            addCriterion("collection_type not in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeBetween(Integer value1, Integer value2) {
            addCriterion("collection_type between", value1, value2, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_type not between", value1, value2, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderIsNull() {
            addCriterion("collection_order is null");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderIsNotNull() {
            addCriterion("collection_order is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderEqualTo(Integer value) {
            addCriterion("collection_order =", value, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderNotEqualTo(Integer value) {
            addCriterion("collection_order <>", value, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderGreaterThan(Integer value) {
            addCriterion("collection_order >", value, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_order >=", value, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderLessThan(Integer value) {
            addCriterion("collection_order <", value, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderLessThanOrEqualTo(Integer value) {
            addCriterion("collection_order <=", value, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderIn(List<Integer> values) {
            addCriterion("collection_order in", values, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderNotIn(List<Integer> values) {
            addCriterion("collection_order not in", values, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderBetween(Integer value1, Integer value2) {
            addCriterion("collection_order between", value1, value2, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_order not between", value1, value2, "collectionOrder");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIsNull() {
            addCriterion("collection_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIsNotNull() {
            addCriterion("collection_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeEqualTo(Date value) {
            addCriterion("collection_time =", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotEqualTo(Date value) {
            addCriterion("collection_time <>", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThan(Date value) {
            addCriterion("collection_time >", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_time >=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThan(Date value) {
            addCriterion("collection_time <", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThanOrEqualTo(Date value) {
            addCriterion("collection_time <=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIn(List<Date> values) {
            addCriterion("collection_time in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotIn(List<Date> values) {
            addCriterion("collection_time not in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeBetween(Date value1, Date value2) {
            addCriterion("collection_time between", value1, value2, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotBetween(Date value1, Date value2) {
            addCriterion("collection_time not between", value1, value2, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkIsNull() {
            addCriterion("collection_remark is null");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkIsNotNull() {
            addCriterion("collection_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkEqualTo(String value) {
            addCriterion("collection_remark =", value, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkNotEqualTo(String value) {
            addCriterion("collection_remark <>", value, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkGreaterThan(String value) {
            addCriterion("collection_remark >", value, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("collection_remark >=", value, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkLessThan(String value) {
            addCriterion("collection_remark <", value, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkLessThanOrEqualTo(String value) {
            addCriterion("collection_remark <=", value, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkLike(String value) {
            addCriterion("collection_remark like", value, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkNotLike(String value) {
            addCriterion("collection_remark not like", value, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkIn(List<String> values) {
            addCriterion("collection_remark in", values, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkNotIn(List<String> values) {
            addCriterion("collection_remark not in", values, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkBetween(String value1, String value2) {
            addCriterion("collection_remark between", value1, value2, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionRemarkNotBetween(String value1, String value2) {
            addCriterion("collection_remark not between", value1, value2, "collectionRemark");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeIsNull() {
            addCriterion("collection_last_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeIsNotNull() {
            addCriterion("collection_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeEqualTo(Date value) {
            addCriterion("collection_last_time =", value, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeNotEqualTo(Date value) {
            addCriterion("collection_last_time <>", value, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeGreaterThan(Date value) {
            addCriterion("collection_last_time >", value, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_last_time >=", value, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeLessThan(Date value) {
            addCriterion("collection_last_time <", value, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("collection_last_time <=", value, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeIn(List<Date> values) {
            addCriterion("collection_last_time in", values, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeNotIn(List<Date> values) {
            addCriterion("collection_last_time not in", values, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeBetween(Date value1, Date value2) {
            addCriterion("collection_last_time between", value1, value2, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("collection_last_time not between", value1, value2, "collectionLastTime");
            return (Criteria) this;
        }

        public Criteria andCollectionExtIsNull() {
            addCriterion("collection_ext is null");
            return (Criteria) this;
        }

        public Criteria andCollectionExtIsNotNull() {
            addCriterion("collection_ext is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionExtEqualTo(String value) {
            addCriterion("collection_ext =", value, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtNotEqualTo(String value) {
            addCriterion("collection_ext <>", value, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtGreaterThan(String value) {
            addCriterion("collection_ext >", value, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtGreaterThanOrEqualTo(String value) {
            addCriterion("collection_ext >=", value, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtLessThan(String value) {
            addCriterion("collection_ext <", value, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtLessThanOrEqualTo(String value) {
            addCriterion("collection_ext <=", value, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtLike(String value) {
            addCriterion("collection_ext like", value, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtNotLike(String value) {
            addCriterion("collection_ext not like", value, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtIn(List<String> values) {
            addCriterion("collection_ext in", values, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtNotIn(List<String> values) {
            addCriterion("collection_ext not in", values, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtBetween(String value1, String value2) {
            addCriterion("collection_ext between", value1, value2, "collectionExt");
            return (Criteria) this;
        }

        public Criteria andCollectionExtNotBetween(String value1, String value2) {
            addCriterion("collection_ext not between", value1, value2, "collectionExt");
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