package com.EBusiness.dao.bo;

public class ArticleType {
    private Integer articleTypeId;

    private String articleTypeName;

    private String articleTypeDesc;

    private String articleTypeExt;

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }

    public String getArticleTypeDesc() {
        return articleTypeDesc;
    }

    public void setArticleTypeDesc(String articleTypeDesc) {
        this.articleTypeDesc = articleTypeDesc;
    }

    public String getArticleTypeExt() {
        return articleTypeExt;
    }

    public void setArticleTypeExt(String articleTypeExt) {
        this.articleTypeExt = articleTypeExt;
    }
}