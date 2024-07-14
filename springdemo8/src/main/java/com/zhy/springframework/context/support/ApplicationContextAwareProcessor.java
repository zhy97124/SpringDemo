package com.zhy.springframework.context.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.config.BeanPostProcessor;
import com.zhy.springframework.context.ApplicationContext;
import com.zhy.springframework.context.ApplicationContextAware;

/**
 * @Description TODO 获取ApplicationContext
 * @Classname ApplicationContextAwareProcessor
 * @Date 2024/7/14 9:58
 * @Created by Shinelon
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {
    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
