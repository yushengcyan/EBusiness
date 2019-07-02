package com.EBusiness;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
配置Spring和jUtil整合,jUti启动时加载SpringIOC容器,Spring-test,jUtil
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉jUtil Spring 配置文件
@ContextConfiguration({"classpath:applicationContext.xml","classpath:springMVC.xml"})
public class BaseTest {

}
