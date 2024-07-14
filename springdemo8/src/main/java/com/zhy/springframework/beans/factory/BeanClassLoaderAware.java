package com.zhy.springframework.beans.factory;

/**
 * @Description TODO 感知到所属的 ClassLoader
 * @Classname BeanClassLoaderAware
 * @Date 2024/7/14 9:56
 * @Created by Shinelon
 */
public interface BeanClassLoaderAware extends Aware {
    void setBeanClassLoader(ClassLoader classLoader);

}
