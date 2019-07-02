package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.ArticleUp;
import com.EBusiness.dao.bo.ArticleUpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleUpMapper {
    int countByExample(ArticleUpExample example);

    int deleteByExample(ArticleUpExample example);

    int insert(ArticleUp record);

    int insertSelective(ArticleUp record);

    List<ArticleUp> selectByExample(ArticleUpExample example);

    int updateByExampleSelective(@Param("record") ArticleUp record, @Param("example") ArticleUpExample example);

    int updateByExample(@Param("record") ArticleUp record, @Param("example") ArticleUpExample example);
}