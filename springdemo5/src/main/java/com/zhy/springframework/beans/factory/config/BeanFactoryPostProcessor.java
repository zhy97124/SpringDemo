package com.zhy.springframework.beans.factory.config;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Description TODO
 * @Classname BeanFactoryPostProcessor
 * @Date 2024/7/12 22:55
 * @Created by Shinelon
 */
public interface BeanFactoryPostProcessor {

    //在所有的BeanDefinition加载完成后，实例化Bean对象之前，提供修改BeanDefinition属性的机制
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)throws BeansException;
}
