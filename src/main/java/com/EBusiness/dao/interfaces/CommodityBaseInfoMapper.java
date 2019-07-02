package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.CommodityBaseInfo;
import com.EBusiness.dao.bo.CommodityBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityBaseInfoMapper {
    int countByExample(CommodityBaseInfoExample example);

    int deleteByExample(CommodityBaseInfoExample example);

    int insert(CommodityBaseInfo record);

    int insertSelective(CommodityBaseInfo record);

    List<CommodityBaseInfo> selectByExample(CommodityBaseInfoExample example);

    int updateByExampleSelective(@Param("record") CommodityBaseInfo record, @Param("example") CommodityBaseInfoExample example);

    int updateByExample(@Param("record") CommodityBaseInfo record, @Param("example") CommodityBaseInfoExample example);
}