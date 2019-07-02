package com.EBusiness.dao.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andUserOrdeIdIsNull() {
            addCriterion("user_orde_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdIsNotNull() {
            addCriterion("user_orde_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdEqualTo(Integer value) {
            addCriterion("user_orde_id =", value, "userOrdeId");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdNotEqualTo(Integer value) {
            addCriterion("user_orde_id <>", value, "userOrdeId");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdGreaterThan(Integer value) {
            addCriterion("user_orde_id >", value, "userOrdeId");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_orde_id >=", value, "userOrdeId");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdLessThan(Integer value) {
            addCriterion("user_orde_id <", value, "userOrdeId");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_orde_id <=", value, "userOrdeId");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdIn(List<Integer> values) {
            addCriterion("user_orde_id in", values, "userOrdeId");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdNotIn(List<Integer> values) {
            addCriterion("user_orde_id not in", values, "userOrdeId");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdBetween(Integer value1, Integer value2) {
            addCriterion("user_orde_id between", value1, value2, "userOrdeId");
            return (Criteria) this;
        }

        public Criteria andUserOrdeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_orde_id not between", value1, value2, "userOrdeId");
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

        public Criteria andMerchantAccountIsNull() {
            addCriterion("merchant_account is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountIsNotNull() {
            addCriterion("merchant_account is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountEqualTo(String value) {
            addCriterion("merchant_account =", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountNotEqualTo(String value) {
            addCriterion("merchant_account <>", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountGreaterThan(String value) {
            addCriterion("merchant_account >", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_account >=", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountLessThan(String value) {
            addCriterion("merchant_account <", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountLessThanOrEqualTo(String value) {
            addCriterion("merchant_account <=", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountLike(String value) {
            addCriterion("merchant_account like", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountNotLike(String value) {
            addCriterion("merchant_account not like", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountIn(List<String> values) {
            addCriterion("merchant_account in", values, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountNotIn(List<String> values) {
            addCriterion("merchant_account not in", values, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountBetween(String value1, String value2) {
            addCriterion("merchant_account between", value1, value2, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountNotBetween(String value1, String value2) {
            addCriterion("merchant_account not between", value1, value2, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressIsNull() {
            addCriterion("merchant_address is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressIsNotNull() {
            addCriterion("merchant_address is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressEqualTo(String value) {
            addCriterion("merchant_address =", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressNotEqualTo(String value) {
            addCriterion("merchant_address <>", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressGreaterThan(String value) {
            addCriterion("merchant_address >", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_address >=", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressLessThan(String value) {
            addCriterion("merchant_address <", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressLessThanOrEqualTo(String value) {
            addCriterion("merchant_address <=", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressLike(String value) {
            addCriterion("merchant_address like", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressNotLike(String value) {
            addCriterion("merchant_address not like", value, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressIn(List<String> values) {
            addCriterion("merchant_address in", values, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressNotIn(List<String> values) {
            addCriterion("merchant_address not in", values, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressBetween(String value1, String value2) {
            addCriterion("merchant_address between", value1, value2, "merchantAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantAddressNotBetween(String value1, String value2) {
            addCriterion("merchant_address not between", value1, value2, "merchantAddress");
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

        public Criteria andCommodityIdEqualTo(String value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(String value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(String value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(String value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLike(String value) {
            addCriterion("commodity_id like", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotLike(String value) {
            addCriterion("commodity_id not like", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<String> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<String> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(String value1, String value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(String value1, String value2) {
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

        public Criteria andCommodityNumberIsNull() {
            addCriterion("commodity_number is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberIsNotNull() {
            addCriterion("commodity_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberEqualTo(Integer value) {
            addCriterion("commodity_number =", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberNotEqualTo(Integer value) {
            addCriterion("commodity_number <>", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberGreaterThan(Integer value) {
            addCriterion("commodity_number >", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_number >=", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberLessThan(Integer value) {
            addCriterion("commodity_number <", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_number <=", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberIn(List<Integer> values) {
            addCriterion("commodity_number in", values, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberNotIn(List<Integer> values) {
            addCriterion("commodity_number not in", values, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberBetween(Integer value1, Integer value2) {
            addCriterion("commodity_number between", value1, value2, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_number not between", value1, value2, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(BigDecimal value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(BigDecimal value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(BigDecimal value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(BigDecimal value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(BigDecimal value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<BigDecimal> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<BigDecimal> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberIsNull() {
            addCriterion("user_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberIsNotNull() {
            addCriterion("user_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberEqualTo(String value) {
            addCriterion("user_phone_number =", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotEqualTo(String value) {
            addCriterion("user_phone_number <>", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberGreaterThan(String value) {
            addCriterion("user_phone_number >", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone_number >=", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberLessThan(String value) {
            addCriterion("user_phone_number <", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("user_phone_number <=", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberLike(String value) {
            addCriterion("user_phone_number like", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotLike(String value) {
            addCriterion("user_phone_number not like", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberIn(List<String> values) {
            addCriterion("user_phone_number in", values, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotIn(List<String> values) {
            addCriterion("user_phone_number not in", values, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberBetween(String value1, String value2) {
            addCriterion("user_phone_number between", value1, value2, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("user_phone_number not between", value1, value2, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeIsNull() {
            addCriterion("order_trade_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeIsNotNull() {
            addCriterion("order_trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeEqualTo(Date value) {
            addCriterion("order_trade_time =", value, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeNotEqualTo(Date value) {
            addCriterion("order_trade_time <>", value, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeGreaterThan(Date value) {
            addCriterion("order_trade_time >", value, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_trade_time >=", value, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeLessThan(Date value) {
            addCriterion("order_trade_time <", value, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_trade_time <=", value, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeIn(List<Date> values) {
            addCriterion("order_trade_time in", values, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeNotIn(List<Date> values) {
            addCriterion("order_trade_time not in", values, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeBetween(Date value1, Date value2) {
            addCriterion("order_trade_time between", value1, value2, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_trade_time not between", value1, value2, "orderTradeTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIsNull() {
            addCriterion("order_start_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIsNotNull() {
            addCriterion("order_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeEqualTo(Date value) {
            addCriterion("order_start_time =", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotEqualTo(Date value) {
            addCriterion("order_start_time <>", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeGreaterThan(Date value) {
            addCriterion("order_start_time >", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_start_time >=", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeLessThan(Date value) {
            addCriterion("order_start_time <", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_start_time <=", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIn(List<Date> values) {
            addCriterion("order_start_time in", values, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotIn(List<Date> values) {
            addCriterion("order_start_time not in", values, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeBetween(Date value1, Date value2) {
            addCriterion("order_start_time between", value1, value2, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_start_time not between", value1, value2, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIsNull() {
            addCriterion("order_end_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIsNotNull() {
            addCriterion("order_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeEqualTo(Date value) {
            addCriterion("order_end_time =", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotEqualTo(Date value) {
            addCriterion("order_end_time <>", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeGreaterThan(Date value) {
            addCriterion("order_end_time >", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_end_time >=", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeLessThan(Date value) {
            addCriterion("order_end_time <", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_end_time <=", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIn(List<Date> values) {
            addCriterion("order_end_time in", values, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotIn(List<Date> values) {
            addCriterion("order_end_time not in", values, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeBetween(Date value1, Date value2) {
            addCriterion("order_end_time between", value1, value2, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_end_time not between", value1, value2, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderExtIsNull() {
            addCriterion("order_ext is null");
            return (Criteria) this;
        }

        public Criteria andOrderExtIsNotNull() {
            addCriterion("order_ext is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExtEqualTo(String value) {
            addCriterion("order_ext =", value, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtNotEqualTo(String value) {
            addCriterion("order_ext <>", value, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtGreaterThan(String value) {
            addCriterion("order_ext >", value, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtGreaterThanOrEqualTo(String value) {
            addCriterion("order_ext >=", value, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtLessThan(String value) {
            addCriterion("order_ext <", value, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtLessThanOrEqualTo(String value) {
            addCriterion("order_ext <=", value, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtLike(String value) {
            addCriterion("order_ext like", value, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtNotLike(String value) {
            addCriterion("order_ext not like", value, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtIn(List<String> values) {
            addCriterion("order_ext in", values, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtNotIn(List<String> values) {
            addCriterion("order_ext not in", values, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtBetween(String value1, String value2) {
            addCriterion("order_ext between", value1, value2, "orderExt");
            return (Criteria) this;
        }

        public Criteria andOrderExtNotBetween(String value1, String value2) {
            addCriterion("order_ext not between", value1, value2, "orderExt");
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