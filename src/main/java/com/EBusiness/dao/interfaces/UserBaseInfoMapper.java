package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.UserBaseInfo;
import com.EBusiness.dao.bo.UserBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBaseInfoMapper {
    int countByExample(UserBaseInfoExample example);

    int deleteByExample(UserBaseInfoExample example);

    int insert(UserBaseInfo record);

    int insertSelective(UserBaseInfo record);

    List<UserBaseInfo> selectByExample(UserBaseInfoExample example);

    int updateByExampleSelective(@Param("record") UserBaseInfo record, @Param("example") UserBaseInfoExample example);

    int updateByExample(@Param("record") UserBaseInfo record, @Param("example") UserBaseInfoExample example);

    //获取用户总数
    int getCount(UserBaseInfo record);
}