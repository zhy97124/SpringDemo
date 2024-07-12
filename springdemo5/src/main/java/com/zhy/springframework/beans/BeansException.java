package com.zhy.springframework.beans;

/**
 * @Description TODO
 * @Classname BeansException
 * @Date 2024/7/9 16:55
 * @Created by Shinelon
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg){
        super(msg);
    }
    public BeansException(String msg,Throwable cause){
        super(msg,cause);
    }
}
