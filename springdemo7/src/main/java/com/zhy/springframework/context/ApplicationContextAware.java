package com.zhy.springframework.context;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.Aware;

/**
 * @Description TODO 感知到所属的ApplicationContextAware
 * @Classname ApplicationContextAware
 * @Date 2024/7/14 9:58
 * @Created by Shinelon
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}