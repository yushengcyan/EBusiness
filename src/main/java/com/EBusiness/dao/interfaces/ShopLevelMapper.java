package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.ShopLevel;
import com.EBusiness.dao.bo.ShopLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopLevelMapper {
    int countByExample(ShopLevelExample example);

    int deleteByExample(ShopLevelExample example);

    int insert(ShopLevel record);

    int insertSelective(ShopLevel record);

    List<ShopLevel> selectByExample(ShopLevelExample example);

    int updateByExampleSelective(@Param("record") ShopLevel record, @Param("example") ShopLevelExample example);

    int updateByExample(@Param("record") ShopLevel record, @Param("example") ShopLevelExample example);
}