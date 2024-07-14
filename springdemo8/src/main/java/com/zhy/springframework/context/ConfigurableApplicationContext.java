package com.zhy.springframework.context;

import com.zhy.springframework.beans.BeansException;

/**
 * @Description TODO
 * @Classname ConfigurableApplicationContext
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();

}
