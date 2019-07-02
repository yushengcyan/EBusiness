package com.EBusiness.dao.bo;

public class CommodityType {
    private Integer commodityTypeId;

    private String commodityTypeName;

    private String commodityTypeDesc;

    private String commodityTypeExt;

    public Integer getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(Integer commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName;
    }

    public String getCommodityTypeDesc() {
        return commodityTypeDesc;
    }

    public void setCommodityTypeDesc(String commodityTypeDesc) {
        this.commodityTypeDesc = commodityTypeDesc;
    }

    public String getCommodityTypeExt() {
        return commodityTypeExt;
    }

    public void setCommodityTypeExt(String commodityTypeExt) {
        this.commodityTypeExt = commodityTypeExt;
    }
}