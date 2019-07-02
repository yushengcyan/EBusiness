package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.ArticleType;
import com.EBusiness.dao.bo.ArticleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleTypeMapper {
    int countByExample(ArticleTypeExample example);

    int deleteByExample(ArticleTypeExample example);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    List<ArticleType> selectByExample(ArticleTypeExample example);

    int updateByExampleSelective(@Param("record") ArticleType record, @Param("example") ArticleTypeExample example);

    int updateByExample(@Param("record") ArticleType record, @Param("example") ArticleTypeExample example);
}