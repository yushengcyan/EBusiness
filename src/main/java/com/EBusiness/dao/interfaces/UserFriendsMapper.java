package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.UserFriends;
import com.EBusiness.dao.bo.UserFriendsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFriendsMapper {
    int countByExample(UserFriendsExample example);

    int deleteByExample(UserFriendsExample example);

    int insert(UserFriends record);

    int insertSelective(UserFriends record);

    List<UserFriends> selectByExample(UserFriendsExample example);

    int updateByExampleSelective(@Param("record") UserFriends record, @Param("example") UserFriendsExample example);

    int updateByExample(@Param("record") UserFriends record, @Param("example") UserFriendsExample example);
}