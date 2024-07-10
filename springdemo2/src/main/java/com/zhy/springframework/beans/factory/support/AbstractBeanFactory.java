package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.BeansException;
import com.zhy.springframework.beans.BeanFactory;
import com.zhy.springframework.beans.factory.config.BeanDefinition;

/**
 * @Description TODO
 * @Classname AbstractBeanFactory
 * @Date 2024/7/9 16:58
 * @Created by Shinelon
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean=getSingleton(name);
        if(bean!=null){
            return bean;
        }
        BeanDefinition beanDefinition=getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    protected  abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws BeansException;
}
