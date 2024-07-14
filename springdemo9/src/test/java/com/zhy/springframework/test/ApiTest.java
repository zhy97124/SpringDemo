package com.zhy.springframework.test;

import com.zhy.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhy.springframework.test.bean.UserService;
import com.zhy.springframework.test.event.CustomEvent;
import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;
//感知接口对应的具体实现(BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware)
public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }

}
