package com.EBusiness.dao.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityBaseInfoExample() {
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

        public Criteria andCommodityTypeIdIsNull() {
            addCriterion("commodity_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIsNotNull() {
            addCriterion("commodity_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdEqualTo(Integer value) {
            addCriterion("commodity_type_id =", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotEqualTo(Integer value) {
            addCriterion("commodity_type_id <>", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThan(Integer value) {
            addCriterion("commodity_type_id >", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_type_id >=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThan(Integer value) {
            addCriterion("commodity_type_id <", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_type_id <=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIn(List<Integer> values) {
            addCriterion("commodity_type_id in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotIn(List<Integer> values) {
            addCriterion("commodity_type_id not in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_type_id between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_type_id not between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeIsNull() {
            addCriterion("commodity_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeIsNotNull() {
            addCriterion("commodity_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeEqualTo(Date value) {
            addCriterion("commodity_start_time =", value, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeNotEqualTo(Date value) {
            addCriterion("commodity_start_time <>", value, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeGreaterThan(Date value) {
            addCriterion("commodity_start_time >", value, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commodity_start_time >=", value, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeLessThan(Date value) {
            addCriterion("commodity_start_time <", value, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("commodity_start_time <=", value, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeIn(List<Date> values) {
            addCriterion("commodity_start_time in", values, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeNotIn(List<Date> values) {
            addCriterion("commodity_start_time not in", values, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeBetween(Date value1, Date value2) {
            addCriterion("commodity_start_time between", value1, value2, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("commodity_start_time not between", value1, value2, "commodityStartTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeIsNull() {
            addCriterion("commodity_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeIsNotNull() {
            addCriterion("commodity_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeEqualTo(Date value) {
            addCriterion("commodity_end_time =", value, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeNotEqualTo(Date value) {
            addCriterion("commodity_end_time <>", value, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeGreaterThan(Date value) {
            addCriterion("commodity_end_time >", value, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commodity_end_time >=", value, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeLessThan(Date value) {
            addCriterion("commodity_end_time <", value, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("commodity_end_time <=", value, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeIn(List<Date> values) {
            addCriterion("commodity_end_time in", values, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeNotIn(List<Date> values) {
            addCriterion("commodity_end_time not in", values, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeBetween(Date value1, Date value2) {
            addCriterion("commodity_end_time between", value1, value2, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("commodity_end_time not between", value1, value2, "commodityEndTime");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIsNull() {
            addCriterion("commodity_status is null");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIsNotNull() {
            addCriterion("commodity_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusEqualTo(Integer value) {
            addCriterion("commodity_status =", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotEqualTo(Integer value) {
            addCriterion("commodity_status <>", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusGreaterThan(Integer value) {
            addCriterion("commodity_status >", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_status >=", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusLessThan(Integer value) {
            addCriterion("commodity_status <", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_status <=", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIn(List<Integer> values) {
            addCriterion("commodity_status in", values, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotIn(List<Integer> values) {
            addCriterion("commodity_status not in", values, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusBetween(Integer value1, Integer value2) {
            addCriterion("commodity_status between", value1, value2, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_status not between", value1, value2, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityImgIsNull() {
            addCriterion("commodity_img is null");
            return (Criteria) this;
        }

        public Criteria andCommodityImgIsNotNull() {
            addCriterion("commodity_img is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityImgEqualTo(String value) {
            addCriterion("commodity_img =", value, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgNotEqualTo(String value) {
            addCriterion("commodity_img <>", value, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgGreaterThan(String value) {
            addCriterion("commodity_img >", value, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_img >=", value, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgLessThan(String value) {
            addCriterion("commodity_img <", value, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgLessThanOrEqualTo(String value) {
            addCriterion("commodity_img <=", value, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgLike(String value) {
            addCriterion("commodity_img like", value, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgNotLike(String value) {
            addCriterion("commodity_img not like", value, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgIn(List<String> values) {
            addCriterion("commodity_img in", values, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgNotIn(List<String> values) {
            addCriterion("commodity_img not in", values, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgBetween(String value1, String value2) {
            addCriterion("commodity_img between", value1, value2, "commodityImg");
            return (Criteria) this;
        }

        public Criteria andCommodityImgNotBetween(String value1, String value2) {
            addCriterion("commodity_img not between", value1, value2, "commodityImg");
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

        public Criteria andCommodityDescIsNull() {
            addCriterion("commodity_desc is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIsNotNull() {
            addCriterion("commodity_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescEqualTo(String value) {
            addCriterion("commodity_desc =", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotEqualTo(String value) {
            addCriterion("commodity_desc <>", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescGreaterThan(String value) {
            addCriterion("commodity_desc >", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_desc >=", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLessThan(String value) {
            addCriterion("commodity_desc <", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLessThanOrEqualTo(String value) {
            addCriterion("commodity_desc <=", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLike(String value) {
            addCriterion("commodity_desc like", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotLike(String value) {
            addCriterion("commodity_desc not like", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIn(List<String> values) {
            addCriterion("commodity_desc in", values, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotIn(List<String> values) {
            addCriterion("commodity_desc not in", values, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescBetween(String value1, String value2) {
            addCriterion("commodity_desc between", value1, value2, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotBetween(String value1, String value2) {
            addCriterion("commodity_desc not between", value1, value2, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeIsNull() {
            addCriterion("commodity_size is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeIsNotNull() {
            addCriterion("commodity_size is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeEqualTo(Double value) {
            addCriterion("commodity_size =", value, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeNotEqualTo(Double value) {
            addCriterion("commodity_size <>", value, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeGreaterThan(Double value) {
            addCriterion("commodity_size >", value, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeGreaterThanOrEqualTo(Double value) {
            addCriterion("commodity_size >=", value, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeLessThan(Double value) {
            addCriterion("commodity_size <", value, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeLessThanOrEqualTo(Double value) {
            addCriterion("commodity_size <=", value, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeIn(List<Double> values) {
            addCriterion("commodity_size in", values, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeNotIn(List<Double> values) {
            addCriterion("commodity_size not in", values, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeBetween(Double value1, Double value2) {
            addCriterion("commodity_size between", value1, value2, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeNotBetween(Double value1, Double value2) {
            addCriterion("commodity_size not between", value1, value2, "commoditySize");
            return (Criteria) this;
        }

        public Criteria andCommodityColorIsNull() {
            addCriterion("commodity_color is null");
            return (Criteria) this;
        }

        public Criteria andCommodityColorIsNotNull() {
            addCriterion("commodity_color is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityColorEqualTo(String value) {
            addCriterion("commodity_color =", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorNotEqualTo(String value) {
            addCriterion("commodity_color <>", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorGreaterThan(String value) {
            addCriterion("commodity_color >", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_color >=", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorLessThan(String value) {
            addCriterion("commodity_color <", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorLessThanOrEqualTo(String value) {
            addCriterion("commodity_color <=", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorLike(String value) {
            addCriterion("commodity_color like", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorNotLike(String value) {
            addCriterion("commodity_color not like", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorIn(List<String> values) {
            addCriterion("commodity_color in", values, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorNotIn(List<String> values) {
            addCriterion("commodity_color not in", values, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorBetween(String value1, String value2) {
            addCriterion("commodity_color between", value1, value2, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorNotBetween(String value1, String value2) {
            addCriterion("commodity_color not between", value1, value2, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1IsNull() {
            addCriterion("commodity_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1IsNotNull() {
            addCriterion("commodity_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1EqualTo(String value) {
            addCriterion("commodity_ext1 =", value, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1NotEqualTo(String value) {
            addCriterion("commodity_ext1 <>", value, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1GreaterThan(String value) {
            addCriterion("commodity_ext1 >", value, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1GreaterThanOrEqualTo(String value) {
            addCriterion("commodity_ext1 >=", value, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1LessThan(String value) {
            addCriterion("commodity_ext1 <", value, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1LessThanOrEqualTo(String value) {
            addCriterion("commodity_ext1 <=", value, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1Like(String value) {
            addCriterion("commodity_ext1 like", value, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1NotLike(String value) {
            addCriterion("commodity_ext1 not like", value, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1In(List<String> values) {
            addCriterion("commodity_ext1 in", values, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1NotIn(List<String> values) {
            addCriterion("commodity_ext1 not in", values, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1Between(String value1, String value2) {
            addCriterion("commodity_ext1 between", value1, value2, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt1NotBetween(String value1, String value2) {
            addCriterion("commodity_ext1 not between", value1, value2, "commodityExt1");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2IsNull() {
            addCriterion("commodity_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2IsNotNull() {
            addCriterion("commodity_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2EqualTo(String value) {
            addCriterion("commodity_ext2 =", value, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2NotEqualTo(String value) {
            addCriterion("commodity_ext2 <>", value, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2GreaterThan(String value) {
            addCriterion("commodity_ext2 >", value, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2GreaterThanOrEqualTo(String value) {
            addCriterion("commodity_ext2 >=", value, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2LessThan(String value) {
            addCriterion("commodity_ext2 <", value, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2LessThanOrEqualTo(String value) {
            addCriterion("commodity_ext2 <=", value, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2Like(String value) {
            addCriterion("commodity_ext2 like", value, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2NotLike(String value) {
            addCriterion("commodity_ext2 not like", value, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2In(List<String> values) {
            addCriterion("commodity_ext2 in", values, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2NotIn(List<String> values) {
            addCriterion("commodity_ext2 not in", values, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2Between(String value1, String value2) {
            addCriterion("commodity_ext2 between", value1, value2, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt2NotBetween(String value1, String value2) {
            addCriterion("commodity_ext2 not between", value1, value2, "commodityExt2");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3IsNull() {
            addCriterion("commodity_ext3 is null");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3IsNotNull() {
            addCriterion("commodity_ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3EqualTo(String value) {
            addCriterion("commodity_ext3 =", value, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3NotEqualTo(String value) {
            addCriterion("commodity_ext3 <>", value, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3GreaterThan(String value) {
            addCriterion("commodity_ext3 >", value, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3GreaterThanOrEqualTo(String value) {
            addCriterion("commodity_ext3 >=", value, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3LessThan(String value) {
            addCriterion("commodity_ext3 <", value, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3LessThanOrEqualTo(String value) {
            addCriterion("commodity_ext3 <=", value, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3Like(String value) {
            addCriterion("commodity_ext3 like", value, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3NotLike(String value) {
            addCriterion("commodity_ext3 not like", value, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3In(List<String> values) {
            addCriterion("commodity_ext3 in", values, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3NotIn(List<String> values) {
            addCriterion("commodity_ext3 not in", values, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3Between(String value1, String value2) {
            addCriterion("commodity_ext3 between", value1, value2, "commodityExt3");
            return (Criteria) this;
        }

        public Criteria andCommodityExt3NotBetween(String value1, String value2) {
            addCriterion("commodity_ext3 not between", value1, value2, "commodityExt3");
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