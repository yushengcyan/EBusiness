package com.EBusiness.dao.bo;

import com.EBusiness.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class CommodityBaseInfo {
    private Integer commodityId;

    private String commodityName;

    private Integer commodityTypeId;

    private Date commodityStartTime;

    private Date commodityEndTime;

    private Integer commodityStatus;

    private String commodityImg;

    private BigDecimal commodityPrice;

    private String commodityDesc;

    private Double commoditySize;

    private String commodityColor;

    private String commodityExt1;

    private String commodityExt2;

    private String commodityExt3;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(Integer commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

//    public String getCommodityStartTime() throws Exception{
//        String startTime = new String();
//        if (commodityStartTime!=null) {
//            startTime = DateUtil.getDateString(commodityStartTime, "yyyy-MM-dd HH:mm:ss");
//        }else{
//            startTime="";
//        }
//        return startTime;
//    }
//    public void setCommodityStartTime(String commodityStartTime) throws Exception{
//        Date startTime = new Date();
//        startTime = DateUtil.str2Date(commodityStartTime);
//        this.commodityStartTime = startTime;
//    }
//    public String getCommodityEndTime() throws Exception{
//        String time = new String();
//        if (commodityEndTime!=null) {
//            time = DateUtil.getDateString(commodityEndTime, "yyyy-MM-dd HH:mm:ss");
//        }else {
//            time="";
//        }
//        return time;
//    }
//    public void setCommodityEndTime(String commodityEndTime) throws Exception{
//        Date time = new Date();
//        time = DateUtil.str2Date(commodityEndTime);
//        this.commodityEndTime = time;
//    }

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public String getCommodityImg() {
        return commodityImg;
    }

    public void setCommodityImg(String commodityImg) {
        this.commodityImg = commodityImg;
    }

    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityDesc() {
        return commodityDesc;
    }

    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }

    public Double getCommoditySize() {
        return commoditySize;
    }

    public void setCommoditySize(Double commoditySize) {
        this.commoditySize = commoditySize;
    }

    public String getCommodityColor() {
        return commodityColor;
    }

    public void setCommodityColor(String commodityColor) {
        this.commodityColor = commodityColor;
    }

    public String getCommodityExt1() {
        return commodityExt1;
    }

    public void setCommodityExt1(String commodityExt1) {
        this.commodityExt1 = commodityExt1;
    }

    public String getCommodityExt2() {
        return commodityExt2;
    }

    public void setCommodityExt2(String commodityExt2) {
        this.commodityExt2 = commodityExt2;
    }

    public String getCommodityExt3() {
        return commodityExt3;
    }

    public Date getCommodityStartTime() {
        return commodityStartTime;
    }

    public void setCommodityStartTime(Date commodityStartTime) {
        this.commodityStartTime = commodityStartTime;
    }

    public Date getCommodityEndTime() {
        return commodityEndTime;
    }

    public void setCommodityEndTime(Date commodityEndTime) {
        this.commodityEndTime = commodityEndTime;
    }

    public void setCommodityExt3(String commodityExt3) {
        this.commodityExt3 = commodityExt3;
    }
}