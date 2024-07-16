package com.zhy.springframework.beans.factory;

/**
 * 由想要了解其 Bean 实现的接口豆类工厂中的豆类名称。请注意，通常不建议这样做
 * 一个对象依赖于它的 Bean 名称，因为这表示一个潜在的脆性依赖于外部配置，以及可能对 Spring API 的不必要依赖。
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}

