package com.zhy.springframework.beans.factory;

import com.zhy.springframework.beans.BeansException;

import java.util.Map;

/**
 * 由 Bean 工厂实现的 {@link BeanFactory} 接口的扩展
 * 可以枚举其所有 Bean 实例，而不是尝试 Bean 查找
 * 根据客户要求逐一命名。BeanFactory 实现
 * 预加载所有 Bean 定义（例如基于 XML 的工厂）可能实现此接口。
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
