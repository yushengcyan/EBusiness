package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.AdminInfo;
import com.EBusiness.dao.bo.AdminInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminInfoMapper {
    int countByExample(AdminInfoExample example);

    int deleteByExample(AdminInfoExample example);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    List<AdminInfo> selectByExample(AdminInfoExample example);

    int updateByExampleSelective(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    int updateByExample(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);
}