package com.zhy.springframework.beans.factory.config;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 *
 * 允许自定义修改 BeanDefinition 属性信息
 *

 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
