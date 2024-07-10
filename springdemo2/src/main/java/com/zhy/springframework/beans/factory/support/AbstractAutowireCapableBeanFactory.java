package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.BeansException;
import com.zhy.springframework.beans.factory.config.BeanDefinition;

/**
 * @Description TODO
 * @Classname AbstractAutowireCapableBeanFactory
 * @Date 2024/7/9 16:57
 * @Created by Shinelon
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean=beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }
}
