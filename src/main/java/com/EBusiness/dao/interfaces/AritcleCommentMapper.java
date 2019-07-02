package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.AritcleComment;
import com.EBusiness.dao.bo.AritcleCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AritcleCommentMapper {
    int countByExample(AritcleCommentExample example);

    int deleteByExample(AritcleCommentExample example);

    int insert(AritcleComment record);

    int insertSelective(AritcleComment record);

    List<AritcleComment> selectByExample(AritcleCommentExample example);

    int updateByExampleSelective(@Param("record") AritcleComment record, @Param("example") AritcleCommentExample example);

    int updateByExample(@Param("record") AritcleComment record, @Param("example") AritcleCommentExample example);
}