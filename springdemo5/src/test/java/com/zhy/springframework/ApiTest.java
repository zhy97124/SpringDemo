package com.zhy.springframework;

import cn.hutool.core.io.IoUtil;
import com.zhy.springframework.beans.PropertyValue;
import com.zhy.springframework.beans.PropertyValues;
import com.zhy.springframework.beans.factory.config.BeanDefinition;
import com.zhy.springframework.beans.factory.config.BeanReference;
import com.zhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zhy.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.zhy.springframework.context.support.ClassPathXmlApplicationContext;
import com.zhy.springframework.core.io.DefaultResourceLoader;
import com.zhy.springframework.core.io.Resource;
import com.zhy.springframework.test.bean.UserDao;
import com.zhy.springframework.test.bean.UserService;
import com.zhy.springframework.test.common.MyBeanFactoryPostProcessor;
import com.zhy.springframework.test.common.MyBeanPostProcessor;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description TODO
 * @Classname ApiTest
 * @Date 2024/7/9 16:37
 * @Created by Shinelon
 */
public class ApiTest {
    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor() {
        //初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");
        //BeanDefinition 加载完成&Bean实例化之前，修改BeanDefinition的属性值
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        //bean实例化之后，修改bean属性信息
        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);
        //获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果： " + result);
    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }
}
