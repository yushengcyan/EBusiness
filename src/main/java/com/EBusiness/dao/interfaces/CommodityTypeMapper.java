package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.CommodityType;
import com.EBusiness.dao.bo.CommodityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityTypeMapper {
    int countByExample(CommodityTypeExample example);

    int deleteByExample(CommodityTypeExample example);

    int insert(CommodityType record);

    int insertSelective(CommodityType record);

    List<CommodityType> selectByExample(CommodityTypeExample example);

    int updateByExampleSelective(@Param("record") CommodityType record, @Param("example") CommodityTypeExample example);

    int updateByExample(@Param("record") CommodityType record, @Param("example") CommodityTypeExample example);
}