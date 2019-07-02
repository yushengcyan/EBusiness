package com.EBusiness.WebTest;

import com.EBusiness.BaseTest;
import com.EBusiness.controller.AdminManage;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
// 配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class controllerTest extends webApplicationContextTest{
   // @Autowired
//    private AdminManage adminManage;
    public void test(){

//        AdminManage adminManage = new AdminManage();
//        int i = 0;
//        i = adminManage.get();
//        System.out.println(i);
    }
}
