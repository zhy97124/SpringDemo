package com.zhy.springframework.test;

import com.zhy.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhy.springframework.test.bean.UserService;
import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;
//感知接口对应的具体实现(BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware)
public class ApiTest {

    @Test
    public void test_prototype(){
        //初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        //获取Bean对象调用方法
        UserService userService1=applicationContext.getBean("userService",UserService.class);
        UserService userService2=applicationContext.getBean("userService",UserService.class);

        //配置scope="prototype/singleton"
        System.out.println(userService1);
        System.out.println(userService2);

        //打印十六进制哈希
        System.out.println(userService1 + " 十六进制哈希：" + Integer.toHexString(userService1.hashCode()));
        System.out.println(ClassLayout.parseInstance(userService1).toPrintable());
    }
    @Test
    public void test_factory_bean() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 调用代理方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}
