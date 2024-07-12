package com.zhy.springframework.beans.factory;

import com.zhy.springframework.beans.BeansException;

import java.util.Map;

/**
 * @Description TODO
 * @Classname ListableBeanFactory
 * @Date 2024/7/11 11:43
 * @Created by Shinelon
 */
public interface ListableBeanFactory extends BeanFactory{
    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
