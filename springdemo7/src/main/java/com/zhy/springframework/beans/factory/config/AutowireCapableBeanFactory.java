package com.zhy.springframework.beans.factory.config;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.BeanFactory;

/**
 * @Description TODO
 * @Classname AutowireCapableBeanFactory
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
