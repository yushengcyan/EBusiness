package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.ShopTrolley;
import com.EBusiness.dao.bo.ShopTrolleyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopTrolleyMapper {
    int countByExample(ShopTrolleyExample example);

    int deleteByExample(ShopTrolleyExample example);

    int insert(ShopTrolley record);

    int insertSelective(ShopTrolley record);

    List<ShopTrolley> selectByExample(ShopTrolleyExample example);

    int updateByExampleSelective(@Param("record") ShopTrolley record, @Param("example") ShopTrolleyExample example);

    int updateByExample(@Param("record") ShopTrolley record, @Param("example") ShopTrolleyExample example);
}