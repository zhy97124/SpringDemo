package com.zhy.springframework.context;

import com.zhy.springframework.beans.BeansException;

/**
 * @Description TODO
 * @Classname ConfigurableApplicationContext
 * @Date 2024/7/12 22:58
 * @Created by Shinelon
 */
public interface ConfigurableApplicationContext extends ApplicationContext{
    //刷新容器
    void refresh() throws BeansException;
}
