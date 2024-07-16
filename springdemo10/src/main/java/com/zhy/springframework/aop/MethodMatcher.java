package com.zhy.springframework.aop;

import java.lang.reflect.Method;

/**
 * 检查目标方法是否符合建议条件。
 */
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);
    
}
