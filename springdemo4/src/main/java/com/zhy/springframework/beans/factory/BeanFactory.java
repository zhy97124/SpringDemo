package com.zhy.springframework.beans.factory;

import com.zhy.springframework.beans.BeansException;

/**
 * @Description TODO 注册bean
 * @Classname BeanFactroy
 * @Date 2024/7/9 16:35
 * @Created by Shinelon
 */
public interface BeanFactory {

    Object getBean(String name)throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
