package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.UserWallet;
import com.EBusiness.dao.bo.UserWalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWalletMapper {
    int countByExample(UserWalletExample example);

    int deleteByExample(UserWalletExample example);

    int insert(UserWallet record);

    int insertSelective(UserWallet record);

    List<UserWallet> selectByExample(UserWalletExample example);

    int updateByExampleSelective(@Param("record") UserWallet record, @Param("example") UserWalletExample example);

    int updateByExample(@Param("record") UserWallet record, @Param("example") UserWalletExample example);
}