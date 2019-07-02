package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.ShopBaseInfo;
import com.EBusiness.dao.bo.ShopBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopBaseInfoMapper {
    int countByExample(ShopBaseInfoExample example);

    int deleteByExample(ShopBaseInfoExample example);

    int insert(ShopBaseInfo record);

    int insertSelective(ShopBaseInfo record);

    List<ShopBaseInfo> selectByExample(ShopBaseInfoExample example);

    int updateByExampleSelective(@Param("record") ShopBaseInfo record, @Param("example") ShopBaseInfoExample example);

    int updateByExample(@Param("record") ShopBaseInfo record, @Param("example") ShopBaseInfoExample example);

    //    获取目前已有帐号的最大值
    List<String> getAccount();
}