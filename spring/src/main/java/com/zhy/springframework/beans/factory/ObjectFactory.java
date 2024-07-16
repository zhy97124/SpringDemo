package com.zhy.springframework.beans.factory;

import com.zhy.springframework.beans.BeansException;

/**
 * @Description TODO
 * @Classname ObjectFactory
 * @Date 2024/7/16 12:30
 * @Created by Shinelon
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}