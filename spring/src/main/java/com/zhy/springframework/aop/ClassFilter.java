package com.zhy.springframework.aop;

/**
 * 限制切入点或引入与一组给定目标类的匹配的筛选器。
 */
public interface ClassFilter {

    /**
     * Should the pointcut apply to the given interface or target class?
     * @param clazz the candidate target class
     * @return whether the advice should apply to the given target class
     */
    boolean matches(Class<?> clazz);

}
