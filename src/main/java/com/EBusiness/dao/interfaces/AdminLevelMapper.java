package com.EBusiness.dao.interfaces;

import com.EBusiness.dao.bo.AdminLevel;
import com.EBusiness.dao.bo.AdminLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminLevelMapper {
    int countByExample(AdminLevelExample example);

    int deleteByExample(AdminLevelExample example);

    int insert(AdminLevel record);

    int insertSelective(AdminLevel record);

    List<AdminLevel> selectByExample(AdminLevelExample example);

    int updateByExampleSelective(@Param("record") AdminLevel record, @Param("example") AdminLevelExample example);

    int updateByExample(@Param("record") AdminLevel record, @Param("example") AdminLevelExample example);
}