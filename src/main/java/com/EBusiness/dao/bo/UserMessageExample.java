package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMessageExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountIsNull() {
            addCriterion("messaging_user_account is null");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountIsNotNull() {
            addCriterion("messaging_user_account is not null");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountEqualTo(String value) {
            addCriterion("messaging_user_account =", value, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountNotEqualTo(String value) {
            addCriterion("messaging_user_account <>", value, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountGreaterThan(String value) {
            addCriterion("messaging_user_account >", value, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("messaging_user_account >=", value, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountLessThan(String value) {
            addCriterion("messaging_user_account <", value, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountLessThanOrEqualTo(String value) {
            addCriterion("messaging_user_account <=", value, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountLike(String value) {
            addCriterion("messaging_user_account like", value, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountNotLike(String value) {
            addCriterion("messaging_user_account not like", value, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountIn(List<String> values) {
            addCriterion("messaging_user_account in", values, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountNotIn(List<String> values) {
            addCriterion("messaging_user_account not in", values, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountBetween(String value1, String value2) {
            addCriterion("messaging_user_account between", value1, value2, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagingUserAccountNotBetween(String value1, String value2) {
            addCriterion("messaging_user_account not between", value1, value2, "messagingUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountIsNull() {
            addCriterion("messaged_user_account is null");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountIsNotNull() {
            addCriterion("messaged_user_account is not null");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountEqualTo(String value) {
            addCriterion("messaged_user_account =", value, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountNotEqualTo(String value) {
            addCriterion("messaged_user_account <>", value, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountGreaterThan(String value) {
            addCriterion("messaged_user_account >", value, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("messaged_user_account >=", value, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountLessThan(String value) {
            addCriterion("messaged_user_account <", value, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountLessThanOrEqualTo(String value) {
            addCriterion("messaged_user_account <=", value, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountLike(String value) {
            addCriterion("messaged_user_account like", value, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountNotLike(String value) {
            addCriterion("messaged_user_account not like", value, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountIn(List<String> values) {
            addCriterion("messaged_user_account in", values, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountNotIn(List<String> values) {
            addCriterion("messaged_user_account not in", values, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountBetween(String value1, String value2) {
            addCriterion("messaged_user_account between", value1, value2, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessagedUserAccountNotBetween(String value1, String value2) {
            addCriterion("messaged_user_account not between", value1, value2, "messagedUserAccount");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIsNull() {
            addCriterion("message_status is null");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIsNotNull() {
            addCriterion("message_status is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStatusEqualTo(Integer value) {
            addCriterion("message_status =", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotEqualTo(Integer value) {
            addCriterion("message_status <>", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusGreaterThan(Integer value) {
            addCriterion("message_status >", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_status >=", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLessThan(Integer value) {
            addCriterion("message_status <", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLessThanOrEqualTo(Integer value) {
            addCriterion("message_status <=", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIn(List<Integer> values) {
            addCriterion("message_status in", values, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotIn(List<Integer> values) {
            addCriterion("message_status not in", values, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusBetween(Integer value1, Integer value2) {
            addCriterion("message_status between", value1, value2, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("message_status not between", value1, value2, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeIsNull() {
            addCriterion("message_send_time is null");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeIsNotNull() {
            addCriterion("message_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeEqualTo(Date value) {
            addCriterion("message_send_time =", value, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeNotEqualTo(Date value) {
            addCriterion("message_send_time <>", value, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeGreaterThan(Date value) {
            addCriterion("message_send_time >", value, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("message_send_time >=", value, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeLessThan(Date value) {
            addCriterion("message_send_time <", value, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("message_send_time <=", value, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeIn(List<Date> values) {
            addCriterion("message_send_time in", values, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeNotIn(List<Date> values) {
            addCriterion("message_send_time not in", values, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeBetween(Date value1, Date value2) {
            addCriterion("message_send_time between", value1, value2, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("message_send_time not between", value1, value2, "messageSendTime");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNull() {
            addCriterion("message_content is null");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNotNull() {
            addCriterion("message_content is not null");
            return (Criteria) this;
        }

        public Criteria andMessageContentEqualTo(String value) {
            addCriterion("message_content =", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotEqualTo(String value) {
            addCriterion("message_content <>", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThan(String value) {
            addCriterion("message_content >", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("message_content >=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThan(String value) {
            addCriterion("message_content <", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThanOrEqualTo(String value) {
            addCriterion("message_content <=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLike(String value) {
            addCriterion("message_content like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotLike(String value) {
            addCriterion("message_content not like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentIn(List<String> values) {
            addCriterion("message_content in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotIn(List<String> values) {
            addCriterion("message_content not in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentBetween(String value1, String value2) {
            addCriterion("message_content between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotBetween(String value1, String value2) {
            addCriterion("message_content not between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageExtIsNull() {
            addCriterion("message_ext is null");
            return (Criteria) this;
        }

        public Criteria andMessageExtIsNotNull() {
            addCriterion("message_ext is not null");
            return (Criteria) this;
        }

        public Criteria andMessageExtEqualTo(String value) {
            addCriterion("message_ext =", value, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtNotEqualTo(String value) {
            addCriterion("message_ext <>", value, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtGreaterThan(String value) {
            addCriterion("message_ext >", value, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtGreaterThanOrEqualTo(String value) {
            addCriterion("message_ext >=", value, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtLessThan(String value) {
            addCriterion("message_ext <", value, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtLessThanOrEqualTo(String value) {
            addCriterion("message_ext <=", value, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtLike(String value) {
            addCriterion("message_ext like", value, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtNotLike(String value) {
            addCriterion("message_ext not like", value, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtIn(List<String> values) {
            addCriterion("message_ext in", values, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtNotIn(List<String> values) {
            addCriterion("message_ext not in", values, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtBetween(String value1, String value2) {
            addCriterion("message_ext between", value1, value2, "messageExt");
            return (Criteria) this;
        }

        public Criteria andMessageExtNotBetween(String value1, String value2) {
            addCriterion("message_ext not between", value1, value2, "messageExt");
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