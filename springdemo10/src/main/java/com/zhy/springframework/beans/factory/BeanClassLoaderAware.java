package com.zhy.springframework.beans.factory;

/**
 *允许 Bean 识别 Bean 的回调
 *{@link ClassLoader 类加载器};也就是说，类加载器由
 *将 Bean 工厂呈现给 Bean 类。
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);

}


    