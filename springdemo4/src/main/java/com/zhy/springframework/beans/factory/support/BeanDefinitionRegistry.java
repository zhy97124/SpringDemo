package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.config.BeanDefinition;

/**
 * @Description TODO
 * @Classname BeanDefinitionRegistry
 * @Date 2024/7/9 16:58
 * @Created by Shinelon
 */
public interface BeanDefinitionRegistry {
    //向注册表中注册 BeanDefinition
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    //使用Bean名称查询BeanDefinition
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    //判断是否包含指定名称的BeanDefinition
    boolean containsBeanDefinition(String beanName);

    //返回注册表中所有的Bean名称
    String[] getBeanDefinitionNames();
}
