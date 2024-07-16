package com.zhy.springframework.beans.factory.config;

import com.zhy.springframework.beans.factory.HierarchicalBeanFactory;
import com.zhy.springframework.util.StringValueResolver;
import com.zhy.springframework.beans.factory.BeanFactory;

/**
 * 大多数 Bean 工厂要实现的配置接口。提供除了 Bean 工厂之外，还配置了 Bean 工厂的设施
 * {@link BeanFactory} 中的客户端方法接口。
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

    /**
     * Add a String resolver for embedded values such as annotation attributes.
     * @param valueResolver the String resolver to apply to embedded values
     * @since 3.0
     */
    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    /**
     * Resolve the given embedded value, e.g. an annotation attribute.
     * @param value the value to resolve
     * @return the resolved value (may be the original value as-is)
     * @since 3.0
     */
    String resolveEmbeddedValue(String value);

}
