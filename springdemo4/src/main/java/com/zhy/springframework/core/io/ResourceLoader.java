package com.zhy.springframework.core.io;

/**
 * @Description TODO 资源加载器
 * @Classname ResourceLoader
 * @Date 2024/7/11 11:49
 * @Created by Shinelon
 */
public interface ResourceLoader {
    String CLASSPATH_URL_PREFIX = "classpath:";
    Resource getResource(String location);
}
