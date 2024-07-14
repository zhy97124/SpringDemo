package com.zhy.springframework.beans.factory;

import com.zhy.springframework.beans.BeansException;

/**
 * @Description TODO
 * @Classname BeanFactory
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
