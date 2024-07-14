package com.zhy.springframework.beans.factory;

/**
 * @Description TODO
 * @Classname DisposableBean
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
