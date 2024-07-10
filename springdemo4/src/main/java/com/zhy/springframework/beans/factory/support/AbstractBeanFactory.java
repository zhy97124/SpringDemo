package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.BeansException;
import com.zhy.springframework.beans.BeanFactory;
import com.zhy.springframework.beans.factory.config.BeanDefinition;
import javafx.beans.binding.ObjectExpression;

/**
 * @Description TODO
 * @Classname AbstractBeanFactory
 * @Date 2024/7/9 16:58
 * @Created by Shinelon
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    protected  abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
