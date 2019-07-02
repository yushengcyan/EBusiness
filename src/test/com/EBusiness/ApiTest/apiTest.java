package com.EBusiness.ApiTest;

import com.EBusiness.BaseTest;
import com.EBusiness.dao.bo.AdminInfo;
import com.EBusiness.dao.interfaces.AdminInfoMapper;
import com.EBusiness.dao.interfaces.UserLogInfoMapper;
import com.EBusiness.services.Impl.BackStageManageSVImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class apiTest extends BaseTest{
    @Autowired
    private UserLogInfoMapper infoMapper;
    @Autowired
    private AdminInfoMapper adminInfoMapper;
    @Test
    public void test(){
//        UserLogInfo userLogInfo = new UserLogInfo();
//        userLogInfo.setUserAccount("444s4");
//        userLogInfo.setUserPassword("123465");
//        userLogInfo.setUserPhoneNum("123456");
//        int i = infoMapper.insert(userLogInfo);
//        UserLogInfoExample example = new UserLogInfoExample();
//        UserLogInfoExample.Criteria criteria = example.createCriteria();
//        criteria.andUserPasswordEqualTo("123465");
//        List<UserLogInfo> userLogInfos = infoMapper.selectByExample(example);
//        System.out.println(userLogInfos.get(0).getUserAccount()+"\t"+userLogInfos.get(0).getUserPassword());
//        System.out.println(i);
//        int i = 0;
//        AdminManage adminManage = new AdminManage();
//        i = adminManage.get();
//        System.out.println(i);

        BackStageManageSVImpl sv = new BackStageManageSVImpl();
        AdminInfo adminInfo = new AdminInfo();
        adminInfo.setAdminAccount("root2");
        adminInfo.setAdminPassword("123456");
        AdminInfo i = new AdminInfo();
//        i = adminInfoMapper.insert(adminInfo);
        i = sv.LogOnAdmin(adminInfo);
        System.out.println(i);
    }
}
