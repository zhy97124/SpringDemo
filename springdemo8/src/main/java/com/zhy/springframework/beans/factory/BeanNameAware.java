package com.zhy.springframework.beans.factory;

/**
 * @Description TODO 感知到所属的BeanName
 * @Classname BeanNameAware
 * @Date 2024/7/14 9:57
 * @Created by Shinelon
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}