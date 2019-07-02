package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.ShopCommodity;
import com.EBusiness.dao.bo.ShopCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCommodityMapper {
    int countByExample(ShopCommodityExample example);

    int deleteByExample(ShopCommodityExample example);

    int insert(ShopCommodity record);

    int insertSelective(ShopCommodity record);

    List<ShopCommodity> selectByExample(ShopCommodityExample example);

    int updateByExampleSelective(@Param("record") ShopCommodity record, @Param("example") ShopCommodityExample example);

    int updateByExample(@Param("record") ShopCommodity record, @Param("example") ShopCommodityExample example);
}