package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.ProductImg;
import com.EBusiness.dao.bo.ProductImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductImgMapper {
    int countByExample(ProductImgExample example);

    int deleteByExample(ProductImgExample example);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    List<ProductImg> selectByExample(ProductImgExample example);

    int updateByExampleSelective(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    int updateByExample(@Param("record") ProductImg record, @Param("example") ProductImgExample example);
}