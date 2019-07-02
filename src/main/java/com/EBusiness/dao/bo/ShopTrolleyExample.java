package com.EBusiness.dao.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopTrolleyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopTrolleyExample() {
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

        public Criteria andShopTrolleyIdIsNull() {
            addCriterion("shop_trolley_id is null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdIsNotNull() {
            addCriterion("shop_trolley_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdEqualTo(Integer value) {
            addCriterion("shop_trolley_id =", value, "shopTrolleyId");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdNotEqualTo(Integer value) {
            addCriterion("shop_trolley_id <>", value, "shopTrolleyId");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdGreaterThan(Integer value) {
            addCriterion("shop_trolley_id >", value, "shopTrolleyId");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_trolley_id >=", value, "shopTrolleyId");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdLessThan(Integer value) {
            addCriterion("shop_trolley_id <", value, "shopTrolleyId");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_trolley_id <=", value, "shopTrolleyId");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdIn(List<Integer> values) {
            addCriterion("shop_trolley_id in", values, "shopTrolleyId");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdNotIn(List<Integer> values) {
            addCriterion("shop_trolley_id not in", values, "shopTrolleyId");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_trolley_id between", value1, value2, "shopTrolleyId");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_trolley_id not between", value1, value2, "shopTrolleyId");
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

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Integer value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Integer value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Integer value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Integer value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Integer> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Integer> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
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

        public Criteria andCommodityNumIsNull() {
            addCriterion("commodity_num is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumIsNotNull() {
            addCriterion("commodity_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumEqualTo(Integer value) {
            addCriterion("commodity_num =", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotEqualTo(Integer value) {
            addCriterion("commodity_num <>", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumGreaterThan(Integer value) {
            addCriterion("commodity_num >", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_num >=", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumLessThan(Integer value) {
            addCriterion("commodity_num <", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_num <=", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumIn(List<Integer> values) {
            addCriterion("commodity_num in", values, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotIn(List<Integer> values) {
            addCriterion("commodity_num not in", values, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumBetween(Integer value1, Integer value2) {
            addCriterion("commodity_num between", value1, value2, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_num not between", value1, value2, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNull() {
            addCriterion("commodity_price is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNotNull() {
            addCriterion("commodity_price is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceEqualTo(BigDecimal value) {
            addCriterion("commodity_price =", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotEqualTo(BigDecimal value) {
            addCriterion("commodity_price <>", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThan(BigDecimal value) {
            addCriterion("commodity_price >", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price >=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThan(BigDecimal value) {
            addCriterion("commodity_price <", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price <=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIn(List<BigDecimal> values) {
            addCriterion("commodity_price in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotIn(List<BigDecimal> values) {
            addCriterion("commodity_price not in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price not between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusIsNull() {
            addCriterion("shop_trolley_status is null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusIsNotNull() {
            addCriterion("shop_trolley_status is not null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusEqualTo(Integer value) {
            addCriterion("shop_trolley_status =", value, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusNotEqualTo(Integer value) {
            addCriterion("shop_trolley_status <>", value, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusGreaterThan(Integer value) {
            addCriterion("shop_trolley_status >", value, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_trolley_status >=", value, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusLessThan(Integer value) {
            addCriterion("shop_trolley_status <", value, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("shop_trolley_status <=", value, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusIn(List<Integer> values) {
            addCriterion("shop_trolley_status in", values, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusNotIn(List<Integer> values) {
            addCriterion("shop_trolley_status not in", values, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusBetween(Integer value1, Integer value2) {
            addCriterion("shop_trolley_status between", value1, value2, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_trolley_status not between", value1, value2, "shopTrolleyStatus");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeIsNull() {
            addCriterion("shop_trolley_add_time is null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeIsNotNull() {
            addCriterion("shop_trolley_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeEqualTo(Date value) {
            addCriterion("shop_trolley_add_time =", value, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeNotEqualTo(Date value) {
            addCriterion("shop_trolley_add_time <>", value, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeGreaterThan(Date value) {
            addCriterion("shop_trolley_add_time >", value, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shop_trolley_add_time >=", value, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeLessThan(Date value) {
            addCriterion("shop_trolley_add_time <", value, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("shop_trolley_add_time <=", value, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeIn(List<Date> values) {
            addCriterion("shop_trolley_add_time in", values, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeNotIn(List<Date> values) {
            addCriterion("shop_trolley_add_time not in", values, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeBetween(Date value1, Date value2) {
            addCriterion("shop_trolley_add_time between", value1, value2, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("shop_trolley_add_time not between", value1, value2, "shopTrolleyAddTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeIsNull() {
            addCriterion("shop_trolley_last_time is null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeIsNotNull() {
            addCriterion("shop_trolley_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeEqualTo(Date value) {
            addCriterion("shop_trolley_last_time =", value, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeNotEqualTo(Date value) {
            addCriterion("shop_trolley_last_time <>", value, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeGreaterThan(Date value) {
            addCriterion("shop_trolley_last_time >", value, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shop_trolley_last_time >=", value, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeLessThan(Date value) {
            addCriterion("shop_trolley_last_time <", value, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("shop_trolley_last_time <=", value, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeIn(List<Date> values) {
            addCriterion("shop_trolley_last_time in", values, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeNotIn(List<Date> values) {
            addCriterion("shop_trolley_last_time not in", values, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeBetween(Date value1, Date value2) {
            addCriterion("shop_trolley_last_time between", value1, value2, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("shop_trolley_last_time not between", value1, value2, "shopTrolleyLastTime");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtIsNull() {
            addCriterion("shop_trolley_ext is null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtIsNotNull() {
            addCriterion("shop_trolley_ext is not null");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtEqualTo(String value) {
            addCriterion("shop_trolley_ext =", value, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtNotEqualTo(String value) {
            addCriterion("shop_trolley_ext <>", value, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtGreaterThan(String value) {
            addCriterion("shop_trolley_ext >", value, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtGreaterThanOrEqualTo(String value) {
            addCriterion("shop_trolley_ext >=", value, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtLessThan(String value) {
            addCriterion("shop_trolley_ext <", value, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtLessThanOrEqualTo(String value) {
            addCriterion("shop_trolley_ext <=", value, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtLike(String value) {
            addCriterion("shop_trolley_ext like", value, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtNotLike(String value) {
            addCriterion("shop_trolley_ext not like", value, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtIn(List<String> values) {
            addCriterion("shop_trolley_ext in", values, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtNotIn(List<String> values) {
            addCriterion("shop_trolley_ext not in", values, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtBetween(String value1, String value2) {
            addCriterion("shop_trolley_ext between", value1, value2, "shopTrolleyExt");
            return (Criteria) this;
        }

        public Criteria andShopTrolleyExtNotBetween(String value1, String value2) {
            addCriterion("shop_trolley_ext not between", value1, value2, "shopTrolleyExt");
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