package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.CommodityComment;
import com.EBusiness.dao.bo.CommodityCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityCommentMapper {
    int countByExample(CommodityCommentExample example);

    int deleteByExample(CommodityCommentExample example);

    int insert(CommodityComment record);

    int insertSelective(CommodityComment record);

    List<CommodityComment> selectByExample(CommodityCommentExample example);

    int updateByExampleSelective(@Param("record") CommodityComment record, @Param("example") CommodityCommentExample example);

    int updateByExample(@Param("record") CommodityComment record, @Param("example") CommodityCommentExample example);
}