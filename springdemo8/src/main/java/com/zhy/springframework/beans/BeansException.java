package com.zhy.springframework.beans;

/**
 * @Description TODO
 * @Classname BeansException
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}