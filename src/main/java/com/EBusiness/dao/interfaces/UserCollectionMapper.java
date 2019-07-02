package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.UserCollection;
import com.EBusiness.dao.bo.UserCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCollectionMapper {
    int countByExample(UserCollectionExample example);

    int deleteByExample(UserCollectionExample example);

    int insert(UserCollection record);

    int insertSelective(UserCollection record);

    List<UserCollection> selectByExample(UserCollectionExample example);

    int updateByExampleSelective(@Param("record") UserCollection record, @Param("example") UserCollectionExample example);

    int updateByExample(@Param("record") UserCollection record, @Param("example") UserCollectionExample example);
}