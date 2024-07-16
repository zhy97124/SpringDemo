package com.zhy.springframework.beans.factory;

/**
 * 由 {@link BeanFactory} 中使用的对象实现的接口
 * 本身就是工厂。如果一个 Bean 实现了这个接口，
 * 它被用作对象暴露的工厂，而不是直接作为 bean将自行公开的实例。
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();

}
