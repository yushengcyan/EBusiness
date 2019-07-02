package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.UserLogInfo;
import com.EBusiness.dao.bo.UserLogInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLogInfoMapper {
    int countByExample(UserLogInfoExample example);

    int deleteByExample(UserLogInfoExample example);

    int insert(UserLogInfo record);

    int insertSelective(UserLogInfo record);

    List<UserLogInfo> selectByExample(UserLogInfoExample example);

    int updateByExampleSelective(@Param("record") UserLogInfo record, @Param("example") UserLogInfoExample example);

    int updateByExample(@Param("record") UserLogInfo record, @Param("example") UserLogInfoExample example);
}