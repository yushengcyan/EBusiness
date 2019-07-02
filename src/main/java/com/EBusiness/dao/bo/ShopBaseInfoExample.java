package com.EBusiness.dao.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopBaseInfoExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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

        public Criteria andShopUserAccountIsNull() {
            addCriterion("shop_user_account is null");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountIsNotNull() {
            addCriterion("shop_user_account is not null");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountEqualTo(String value) {
            addCriterion("shop_user_account =", value, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountNotEqualTo(String value) {
            addCriterion("shop_user_account <>", value, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountGreaterThan(String value) {
            addCriterion("shop_user_account >", value, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("shop_user_account >=", value, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountLessThan(String value) {
            addCriterion("shop_user_account <", value, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountLessThanOrEqualTo(String value) {
            addCriterion("shop_user_account <=", value, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountLike(String value) {
            addCriterion("shop_user_account like", value, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountNotLike(String value) {
            addCriterion("shop_user_account not like", value, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountIn(List<String> values) {
            addCriterion("shop_user_account in", values, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountNotIn(List<String> values) {
            addCriterion("shop_user_account not in", values, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountBetween(String value1, String value2) {
            addCriterion("shop_user_account between", value1, value2, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopUserAccountNotBetween(String value1, String value2) {
            addCriterion("shop_user_account not between", value1, value2, "shopUserAccount");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameIsNull() {
            addCriterion("shop_user_name is null");
            return (Criteria) this;
        }

        public Criteria andShopUserNameIsNotNull() {
            addCriterion("shop_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopUserNameEqualTo(String value) {
            addCriterion("shop_user_name =", value, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameNotEqualTo(String value) {
            addCriterion("shop_user_name <>", value, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameGreaterThan(String value) {
            addCriterion("shop_user_name >", value, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_user_name >=", value, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameLessThan(String value) {
            addCriterion("shop_user_name <", value, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameLessThanOrEqualTo(String value) {
            addCriterion("shop_user_name <=", value, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameLike(String value) {
            addCriterion("shop_user_name like", value, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameNotLike(String value) {
            addCriterion("shop_user_name not like", value, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameIn(List<String> values) {
            addCriterion("shop_user_name in", values, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameNotIn(List<String> values) {
            addCriterion("shop_user_name not in", values, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameBetween(String value1, String value2) {
            addCriterion("shop_user_name between", value1, value2, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopUserNameNotBetween(String value1, String value2) {
            addCriterion("shop_user_name not between", value1, value2, "shopUserName");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNull() {
            addCriterion("shop_level is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNotNull() {
            addCriterion("shop_level is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelEqualTo(Integer value) {
            addCriterion("shop_level =", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotEqualTo(Integer value) {
            addCriterion("shop_level <>", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThan(Integer value) {
            addCriterion("shop_level >", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_level >=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThan(Integer value) {
            addCriterion("shop_level <", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThanOrEqualTo(Integer value) {
            addCriterion("shop_level <=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelIn(List<Integer> values) {
            addCriterion("shop_level in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotIn(List<Integer> values) {
            addCriterion("shop_level not in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelBetween(Integer value1, Integer value2) {
            addCriterion("shop_level between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_level not between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopMoneyIsNull() {
            addCriterion("shop_money is null");
            return (Criteria) this;
        }

        public Criteria andShopMoneyIsNotNull() {
            addCriterion("shop_money is not null");
            return (Criteria) this;
        }

        public Criteria andShopMoneyEqualTo(BigDecimal value) {
            addCriterion("shop_money =", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyNotEqualTo(BigDecimal value) {
            addCriterion("shop_money <>", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyGreaterThan(BigDecimal value) {
            addCriterion("shop_money >", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_money >=", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyLessThan(BigDecimal value) {
            addCriterion("shop_money <", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_money <=", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyIn(List<BigDecimal> values) {
            addCriterion("shop_money in", values, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyNotIn(List<BigDecimal> values) {
            addCriterion("shop_money not in", values, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_money between", value1, value2, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_money not between", value1, value2, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopNumberIsNull() {
            addCriterion("shop_number is null");
            return (Criteria) this;
        }

        public Criteria andShopNumberIsNotNull() {
            addCriterion("shop_number is not null");
            return (Criteria) this;
        }

        public Criteria andShopNumberEqualTo(Integer value) {
            addCriterion("shop_number =", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotEqualTo(Integer value) {
            addCriterion("shop_number <>", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThan(Integer value) {
            addCriterion("shop_number >", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_number >=", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThan(Integer value) {
            addCriterion("shop_number <", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThanOrEqualTo(Integer value) {
            addCriterion("shop_number <=", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberIn(List<Integer> values) {
            addCriterion("shop_number in", values, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotIn(List<Integer> values) {
            addCriterion("shop_number not in", values, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberBetween(Integer value1, Integer value2) {
            addCriterion("shop_number between", value1, value2, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_number not between", value1, value2, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("shop_address is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("shop_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("shop_address =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("shop_address <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("shop_address >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_address >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("shop_address <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_address <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("shop_address like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("shop_address not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("shop_address in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("shop_address not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("shop_address between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("shop_address not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNull() {
            addCriterion("shop_status is null");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNotNull() {
            addCriterion("shop_status is not null");
            return (Criteria) this;
        }

        public Criteria andShopStatusEqualTo(Integer value) {
            addCriterion("shop_status =", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotEqualTo(Integer value) {
            addCriterion("shop_status <>", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThan(Integer value) {
            addCriterion("shop_status >", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_status >=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThan(Integer value) {
            addCriterion("shop_status <", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThanOrEqualTo(Integer value) {
            addCriterion("shop_status <=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusIn(List<Integer> values) {
            addCriterion("shop_status in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotIn(List<Integer> values) {
            addCriterion("shop_status not in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusBetween(Integer value1, Integer value2) {
            addCriterion("shop_status between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_status not between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeIsNull() {
            addCriterion("shop_start_time is null");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeIsNotNull() {
            addCriterion("shop_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("shop_start_time =", value, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("shop_start_time <>", value, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("shop_start_time >", value, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shop_start_time >=", value, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("shop_start_time <", value, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shop_start_time <=", value, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("shop_start_time in", values, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("shop_start_time not in", values, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shop_start_time between", value1, value2, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shop_start_time not between", value1, value2, "shopStartTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeIsNull() {
            addCriterion("shop_end_time is null");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeIsNotNull() {
            addCriterion("shop_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("shop_end_time =", value, "shopEndTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("shop_end_time <>", value, "shopEndTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("shop_end_time >", value, "shopEndTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shop_end_time >=", value, "shopEndTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("shop_end_time <", value, "shopEndTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shop_end_time <=", value, "shopEndTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("shop_end_time in", values, "shopEndTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("shop_end_time not in", values, "shopEndTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shop_end_time between", value1, value2, "shopEndTime");
            return (Criteria) this;
        }

        public Criteria andShopEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shop_end_time not between", value1, value2, "shopEndTime");
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