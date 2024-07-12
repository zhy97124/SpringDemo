package com.zhy.springframework.test.common;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.config.BeanPostProcessor;
import com.zhy.springframework.test.bean.UserService;

/**
 * @Description TODO
 * @Classname MyBeanPostProcessor
 * @Date 2024/7/12 22:59
 * @Created by Shinelon
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("userService".equals(beanName)){
            UserService userService=(UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
