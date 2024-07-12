package com.zhy.springframework.beans.factory.config;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.BeanFactory;

/**
 * @Description TODO
 * @Classname AutowireCapableBeanFactory
 * @Date 2024/7/11 11:41
 * @Created by Shinelon
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
    //执行BeanPostProcessors 接口实现类的 postProcessBeforeInitialization方法
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    //执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
