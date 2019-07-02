package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserFriendsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFriendsExample() {
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

        public Criteria andFridendIdIsNull() {
            addCriterion("fridend_id is null");
            return (Criteria) this;
        }

        public Criteria andFridendIdIsNotNull() {
            addCriterion("fridend_id is not null");
            return (Criteria) this;
        }

        public Criteria andFridendIdEqualTo(Integer value) {
            addCriterion("fridend_id =", value, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFridendIdNotEqualTo(Integer value) {
            addCriterion("fridend_id <>", value, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFridendIdGreaterThan(Integer value) {
            addCriterion("fridend_id >", value, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFridendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fridend_id >=", value, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFridendIdLessThan(Integer value) {
            addCriterion("fridend_id <", value, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFridendIdLessThanOrEqualTo(Integer value) {
            addCriterion("fridend_id <=", value, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFridendIdIn(List<Integer> values) {
            addCriterion("fridend_id in", values, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFridendIdNotIn(List<Integer> values) {
            addCriterion("fridend_id not in", values, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFridendIdBetween(Integer value1, Integer value2) {
            addCriterion("fridend_id between", value1, value2, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFridendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fridend_id not between", value1, value2, "fridendId");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountIsNull() {
            addCriterion("friending_user_account is null");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountIsNotNull() {
            addCriterion("friending_user_account is not null");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountEqualTo(String value) {
            addCriterion("friending_user_account =", value, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountNotEqualTo(String value) {
            addCriterion("friending_user_account <>", value, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountGreaterThan(String value) {
            addCriterion("friending_user_account >", value, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("friending_user_account >=", value, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountLessThan(String value) {
            addCriterion("friending_user_account <", value, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountLessThanOrEqualTo(String value) {
            addCriterion("friending_user_account <=", value, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountLike(String value) {
            addCriterion("friending_user_account like", value, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountNotLike(String value) {
            addCriterion("friending_user_account not like", value, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountIn(List<String> values) {
            addCriterion("friending_user_account in", values, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountNotIn(List<String> values) {
            addCriterion("friending_user_account not in", values, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountBetween(String value1, String value2) {
            addCriterion("friending_user_account between", value1, value2, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserAccountNotBetween(String value1, String value2) {
            addCriterion("friending_user_account not between", value1, value2, "friendingUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameIsNull() {
            addCriterion("friending_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameIsNotNull() {
            addCriterion("friending_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameEqualTo(String value) {
            addCriterion("friending_user_name =", value, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameNotEqualTo(String value) {
            addCriterion("friending_user_name <>", value, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameGreaterThan(String value) {
            addCriterion("friending_user_name >", value, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("friending_user_name >=", value, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameLessThan(String value) {
            addCriterion("friending_user_name <", value, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameLessThanOrEqualTo(String value) {
            addCriterion("friending_user_name <=", value, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameLike(String value) {
            addCriterion("friending_user_name like", value, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameNotLike(String value) {
            addCriterion("friending_user_name not like", value, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameIn(List<String> values) {
            addCriterion("friending_user_name in", values, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameNotIn(List<String> values) {
            addCriterion("friending_user_name not in", values, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameBetween(String value1, String value2) {
            addCriterion("friending_user_name between", value1, value2, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendingUserNameNotBetween(String value1, String value2) {
            addCriterion("friending_user_name not between", value1, value2, "friendingUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountIsNull() {
            addCriterion("friended_user_account is null");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountIsNotNull() {
            addCriterion("friended_user_account is not null");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountEqualTo(String value) {
            addCriterion("friended_user_account =", value, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountNotEqualTo(String value) {
            addCriterion("friended_user_account <>", value, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountGreaterThan(String value) {
            addCriterion("friended_user_account >", value, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("friended_user_account >=", value, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountLessThan(String value) {
            addCriterion("friended_user_account <", value, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountLessThanOrEqualTo(String value) {
            addCriterion("friended_user_account <=", value, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountLike(String value) {
            addCriterion("friended_user_account like", value, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountNotLike(String value) {
            addCriterion("friended_user_account not like", value, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountIn(List<String> values) {
            addCriterion("friended_user_account in", values, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountNotIn(List<String> values) {
            addCriterion("friended_user_account not in", values, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountBetween(String value1, String value2) {
            addCriterion("friended_user_account between", value1, value2, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserAccountNotBetween(String value1, String value2) {
            addCriterion("friended_user_account not between", value1, value2, "friendedUserAccount");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameIsNull() {
            addCriterion("friended_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameIsNotNull() {
            addCriterion("friended_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameEqualTo(String value) {
            addCriterion("friended_user_name =", value, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameNotEqualTo(String value) {
            addCriterion("friended_user_name <>", value, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameGreaterThan(String value) {
            addCriterion("friended_user_name >", value, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("friended_user_name >=", value, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameLessThan(String value) {
            addCriterion("friended_user_name <", value, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameLessThanOrEqualTo(String value) {
            addCriterion("friended_user_name <=", value, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameLike(String value) {
            addCriterion("friended_user_name like", value, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameNotLike(String value) {
            addCriterion("friended_user_name not like", value, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameIn(List<String> values) {
            addCriterion("friended_user_name in", values, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameNotIn(List<String> values) {
            addCriterion("friended_user_name not in", values, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameBetween(String value1, String value2) {
            addCriterion("friended_user_name between", value1, value2, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendedUserNameNotBetween(String value1, String value2) {
            addCriterion("friended_user_name not between", value1, value2, "friendedUserName");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameIsNull() {
            addCriterion("friend_nickname is null");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameIsNotNull() {
            addCriterion("friend_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameEqualTo(String value) {
            addCriterion("friend_nickname =", value, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameNotEqualTo(String value) {
            addCriterion("friend_nickname <>", value, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameGreaterThan(String value) {
            addCriterion("friend_nickname >", value, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("friend_nickname >=", value, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameLessThan(String value) {
            addCriterion("friend_nickname <", value, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameLessThanOrEqualTo(String value) {
            addCriterion("friend_nickname <=", value, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameLike(String value) {
            addCriterion("friend_nickname like", value, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameNotLike(String value) {
            addCriterion("friend_nickname not like", value, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameIn(List<String> values) {
            addCriterion("friend_nickname in", values, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameNotIn(List<String> values) {
            addCriterion("friend_nickname not in", values, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameBetween(String value1, String value2) {
            addCriterion("friend_nickname between", value1, value2, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendNicknameNotBetween(String value1, String value2) {
            addCriterion("friend_nickname not between", value1, value2, "friendNickname");
            return (Criteria) this;
        }

        public Criteria andFriendStatusIsNull() {
            addCriterion("friend_status is null");
            return (Criteria) this;
        }

        public Criteria andFriendStatusIsNotNull() {
            addCriterion("friend_status is not null");
            return (Criteria) this;
        }

        public Criteria andFriendStatusEqualTo(Integer value) {
            addCriterion("friend_status =", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusNotEqualTo(Integer value) {
            addCriterion("friend_status <>", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusGreaterThan(Integer value) {
            addCriterion("friend_status >", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("friend_status >=", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusLessThan(Integer value) {
            addCriterion("friend_status <", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusLessThanOrEqualTo(Integer value) {
            addCriterion("friend_status <=", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusIn(List<Integer> values) {
            addCriterion("friend_status in", values, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusNotIn(List<Integer> values) {
            addCriterion("friend_status not in", values, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusBetween(Integer value1, Integer value2) {
            addCriterion("friend_status between", value1, value2, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("friend_status not between", value1, value2, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendTimeIsNull() {
            addCriterion("friend_time is null");
            return (Criteria) this;
        }

        public Criteria andFriendTimeIsNotNull() {
            addCriterion("friend_time is not null");
            return (Criteria) this;
        }

        public Criteria andFriendTimeEqualTo(Date value) {
            addCriterion("friend_time =", value, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendTimeNotEqualTo(Date value) {
            addCriterion("friend_time <>", value, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendTimeGreaterThan(Date value) {
            addCriterion("friend_time >", value, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("friend_time >=", value, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendTimeLessThan(Date value) {
            addCriterion("friend_time <", value, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendTimeLessThanOrEqualTo(Date value) {
            addCriterion("friend_time <=", value, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendTimeIn(List<Date> values) {
            addCriterion("friend_time in", values, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendTimeNotIn(List<Date> values) {
            addCriterion("friend_time not in", values, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendTimeBetween(Date value1, Date value2) {
            addCriterion("friend_time between", value1, value2, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendTimeNotBetween(Date value1, Date value2) {
            addCriterion("friend_time not between", value1, value2, "friendTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeIsNull() {
            addCriterion("friend_last_time is null");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeIsNotNull() {
            addCriterion("friend_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeEqualTo(Date value) {
            addCriterion("friend_last_time =", value, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeNotEqualTo(Date value) {
            addCriterion("friend_last_time <>", value, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeGreaterThan(Date value) {
            addCriterion("friend_last_time >", value, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("friend_last_time >=", value, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeLessThan(Date value) {
            addCriterion("friend_last_time <", value, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("friend_last_time <=", value, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeIn(List<Date> values) {
            addCriterion("friend_last_time in", values, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeNotIn(List<Date> values) {
            addCriterion("friend_last_time not in", values, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeBetween(Date value1, Date value2) {
            addCriterion("friend_last_time between", value1, value2, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("friend_last_time not between", value1, value2, "friendLastTime");
            return (Criteria) this;
        }

        public Criteria andFriendExtIsNull() {
            addCriterion("friend_ext is null");
            return (Criteria) this;
        }

        public Criteria andFriendExtIsNotNull() {
            addCriterion("friend_ext is not null");
            return (Criteria) this;
        }

        public Criteria andFriendExtEqualTo(String value) {
            addCriterion("friend_ext =", value, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtNotEqualTo(String value) {
            addCriterion("friend_ext <>", value, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtGreaterThan(String value) {
            addCriterion("friend_ext >", value, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtGreaterThanOrEqualTo(String value) {
            addCriterion("friend_ext >=", value, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtLessThan(String value) {
            addCriterion("friend_ext <", value, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtLessThanOrEqualTo(String value) {
            addCriterion("friend_ext <=", value, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtLike(String value) {
            addCriterion("friend_ext like", value, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtNotLike(String value) {
            addCriterion("friend_ext not like", value, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtIn(List<String> values) {
            addCriterion("friend_ext in", values, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtNotIn(List<String> values) {
            addCriterion("friend_ext not in", values, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtBetween(String value1, String value2) {
            addCriterion("friend_ext between", value1, value2, "friendExt");
            return (Criteria) this;
        }

        public Criteria andFriendExtNotBetween(String value1, String value2) {
            addCriterion("friend_ext not between", value1, value2, "friendExt");
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