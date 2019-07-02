package com.EBusiness.WebTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@ContextConfiguration({"classpath:applicationContext.xml","classpath:springMVC.xml"})
public class webApplicationContextTest {
    @Autowired
    private WebAppConfiguration webApplicationContext;
}
