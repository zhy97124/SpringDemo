package com.zhy.springframework.context.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.config.BeanPostProcessor;
import com.zhy.springframework.context.ApplicationContext;
import com.zhy.springframework.context.ApplicationContextAware;


public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
