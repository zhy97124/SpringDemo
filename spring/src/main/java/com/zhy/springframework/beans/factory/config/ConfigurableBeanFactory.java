package com.zhy.springframework.beans.factory.config;

import com.zhy.springframework.beans.factory.HierarchicalBeanFactory;
import com.zhy.springframework.core.convert.ConversionService;
import com.zhy.springframework.util.StringValueResolver;
import com.zhy.springframework.beans.factory.BeanFactory;
import org.jetbrains.annotations.Nullable;

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
     * 为嵌入值(如注释属性)添加字符串解析器。
     * @param valueResolver 用于嵌入值的字符串解析器
     */
    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    /**
     * 解析给定的内嵌值，例如注释属性。
     * @param value 要解析的值
     * @return (可能是原始值)
     */
    String resolveEmbeddedValue(String value);

    void setConversionService(ConversionService conversionService);


    @Nullable
    ConversionService getConversionService();
}
