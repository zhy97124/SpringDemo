package com.zhy.springframework.beans.factory.config;

import com.zhy.springframework.beans.BeansException;

import java.beans.Beans;

/**
 * @Description TODO
 * @Classname BeanPostProcessor
 * @Date 2024/7/12 22:55
 * @Created by Shinelon
 */
public interface BeanPostProcessor {
    //Bean对象执行初始化方法之前，执行此方法
    Object postProcessBeforeInitialization(Object bean,String beanName)throws BeansException;
    //Bean对象执行初始化方法之后，执行此方法
    Object postProcessAfterInitialization(Object bean,String beanName)throws BeansException;
}
