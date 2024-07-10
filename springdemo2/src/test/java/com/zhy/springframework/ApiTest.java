package com.zhy.springframework;

import com.zhy.springframework.beans.BeanFactory;
import com.zhy.springframework.beans.factory.config.BeanDefinition;
import com.zhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zhy.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import com.zhy.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @Description TODO
 * @Classname ApiTest
 * @Date 2024/7/9 16:37
 * @Created by Shinelon
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        //4.第二次获取 bean
        UserService userService_singleton=(UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();
    }
}
