package com.zhy.springframework.aop;

import com.zhy.springframework.util.ClassUtils;

/**
 * 被代理的目标对象
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    /**
     *返回由{@link TargetSource}返回的目标类型。
     */
    public Class<?>[] getTargetClass() {
        Class<?> clazz = this.target.getClass();
        clazz = ClassUtils.isCglibProxyClass(clazz) ? clazz.getSuperclass() : clazz;
        return clazz.getInterfaces();
    }

    /**
     *返回目标实例。紧接在AOP框架调用AOP方法调用的“目标”。
     */
    public Object getTarget() {
        return this.target;
    }

}
