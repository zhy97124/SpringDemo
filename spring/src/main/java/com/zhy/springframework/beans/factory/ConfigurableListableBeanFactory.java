package com.zhy.springframework.beans.factory;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.zhy.springframework.beans.factory.config.BeanDefinition;
import com.zhy.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * 由大多数可列出的 Bean 工厂实现的配置接口。
 * 除了 {@link ConfigurableBeanFactory} 之外，它还提供了以下功能
 * 分析和修改 Bean 定义，并预先实例化单例。
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
