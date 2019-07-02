package com.EBusiness.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBaseInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andUserPhoneNumIsNull() {
            addCriterion("user_phone_num is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumIsNotNull() {
            addCriterion("user_phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumEqualTo(String value) {
            addCriterion("user_phone_num =", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotEqualTo(String value) {
            addCriterion("user_phone_num <>", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumGreaterThan(String value) {
            addCriterion("user_phone_num >", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone_num >=", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumLessThan(String value) {
            addCriterion("user_phone_num <", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("user_phone_num <=", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumLike(String value) {
            addCriterion("user_phone_num like", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotLike(String value) {
            addCriterion("user_phone_num not like", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumIn(List<String> values) {
            addCriterion("user_phone_num in", values, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotIn(List<String> values) {
            addCriterion("user_phone_num not in", values, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumBetween(String value1, String value2) {
            addCriterion("user_phone_num between", value1, value2, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotBetween(String value1, String value2) {
            addCriterion("user_phone_num not between", value1, value2, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserSexyIsNull() {
            addCriterion("user_sexy is null");
            return (Criteria) this;
        }

        public Criteria andUserSexyIsNotNull() {
            addCriterion("user_sexy is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexyEqualTo(String value) {
            addCriterion("user_sexy =", value, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyNotEqualTo(String value) {
            addCriterion("user_sexy <>", value, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyGreaterThan(String value) {
            addCriterion("user_sexy >", value, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyGreaterThanOrEqualTo(String value) {
            addCriterion("user_sexy >=", value, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyLessThan(String value) {
            addCriterion("user_sexy <", value, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyLessThanOrEqualTo(String value) {
            addCriterion("user_sexy <=", value, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyLike(String value) {
            addCriterion("user_sexy like", value, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyNotLike(String value) {
            addCriterion("user_sexy not like", value, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyIn(List<String> values) {
            addCriterion("user_sexy in", values, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyNotIn(List<String> values) {
            addCriterion("user_sexy not in", values, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyBetween(String value1, String value2) {
            addCriterion("user_sexy between", value1, value2, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserSexyNotBetween(String value1, String value2) {
            addCriterion("user_sexy not between", value1, value2, "userSexy");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusIsNull() {
            addCriterion("user_account_status is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusIsNotNull() {
            addCriterion("user_account_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusEqualTo(String value) {
            addCriterion("user_account_status =", value, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusNotEqualTo(String value) {
            addCriterion("user_account_status <>", value, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusGreaterThan(String value) {
            addCriterion("user_account_status >", value, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusGreaterThanOrEqualTo(String value) {
            addCriterion("user_account_status >=", value, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusLessThan(String value) {
            addCriterion("user_account_status <", value, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusLessThanOrEqualTo(String value) {
            addCriterion("user_account_status <=", value, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusLike(String value) {
            addCriterion("user_account_status like", value, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusNotLike(String value) {
            addCriterion("user_account_status not like", value, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusIn(List<String> values) {
            addCriterion("user_account_status in", values, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusNotIn(List<String> values) {
            addCriterion("user_account_status not in", values, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusBetween(String value1, String value2) {
            addCriterion("user_account_status between", value1, value2, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserAccountStatusNotBetween(String value1, String value2) {
            addCriterion("user_account_status not between", value1, value2, "userAccountStatus");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIsNull() {
            addCriterion("user_integral is null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIsNotNull() {
            addCriterion("user_integral is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralEqualTo(Integer value) {
            addCriterion("user_integral =", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotEqualTo(Integer value) {
            addCriterion("user_integral <>", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThan(Integer value) {
            addCriterion("user_integral >", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_integral >=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThan(Integer value) {
            addCriterion("user_integral <", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("user_integral <=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIn(List<Integer> values) {
            addCriterion("user_integral in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotIn(List<Integer> values) {
            addCriterion("user_integral not in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralBetween(Integer value1, Integer value2) {
            addCriterion("user_integral between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("user_integral not between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeIsNull() {
            addCriterion("user_register_time is null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeIsNotNull() {
            addCriterion("user_register_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeEqualTo(Date value) {
            addCriterion("user_register_time =", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotEqualTo(Date value) {
            addCriterion("user_register_time <>", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeGreaterThan(Date value) {
            addCriterion("user_register_time >", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_register_time >=", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeLessThan(Date value) {
            addCriterion("user_register_time <", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_register_time <=", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeIn(List<Date> values) {
            addCriterion("user_register_time in", values, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotIn(List<Date> values) {
            addCriterion("user_register_time not in", values, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("user_register_time between", value1, value2, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_register_time not between", value1, value2, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1IsNull() {
            addCriterion("user_info_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1IsNotNull() {
            addCriterion("user_info_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1EqualTo(String value) {
            addCriterion("user_info_ext1 =", value, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1NotEqualTo(String value) {
            addCriterion("user_info_ext1 <>", value, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1GreaterThan(String value) {
            addCriterion("user_info_ext1 >", value, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1GreaterThanOrEqualTo(String value) {
            addCriterion("user_info_ext1 >=", value, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1LessThan(String value) {
            addCriterion("user_info_ext1 <", value, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1LessThanOrEqualTo(String value) {
            addCriterion("user_info_ext1 <=", value, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1Like(String value) {
            addCriterion("user_info_ext1 like", value, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1NotLike(String value) {
            addCriterion("user_info_ext1 not like", value, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1In(List<String> values) {
            addCriterion("user_info_ext1 in", values, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1NotIn(List<String> values) {
            addCriterion("user_info_ext1 not in", values, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1Between(String value1, String value2) {
            addCriterion("user_info_ext1 between", value1, value2, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt1NotBetween(String value1, String value2) {
            addCriterion("user_info_ext1 not between", value1, value2, "userInfoExt1");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2IsNull() {
            addCriterion("user_info_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2IsNotNull() {
            addCriterion("user_info_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2EqualTo(String value) {
            addCriterion("user_info_ext2 =", value, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2NotEqualTo(String value) {
            addCriterion("user_info_ext2 <>", value, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2GreaterThan(String value) {
            addCriterion("user_info_ext2 >", value, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2GreaterThanOrEqualTo(String value) {
            addCriterion("user_info_ext2 >=", value, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2LessThan(String value) {
            addCriterion("user_info_ext2 <", value, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2LessThanOrEqualTo(String value) {
            addCriterion("user_info_ext2 <=", value, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2Like(String value) {
            addCriterion("user_info_ext2 like", value, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2NotLike(String value) {
            addCriterion("user_info_ext2 not like", value, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2In(List<String> values) {
            addCriterion("user_info_ext2 in", values, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2NotIn(List<String> values) {
            addCriterion("user_info_ext2 not in", values, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2Between(String value1, String value2) {
            addCriterion("user_info_ext2 between", value1, value2, "userInfoExt2");
            return (Criteria) this;
        }

        public Criteria andUserInfoExt2NotBetween(String value1, String value2) {
            addCriterion("user_info_ext2 not between", value1, value2, "userInfoExt2");
            return (Criteria) this;
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