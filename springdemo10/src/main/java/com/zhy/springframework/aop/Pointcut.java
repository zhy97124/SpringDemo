package com.zhy.springframework.aop;

/**
 * 核心弹簧切入抽象
 * 切入点由 {@link ClassFilter} 和 {@link MethodMatcher} 组成。
 * 这些基本术语和 Pointcut 本身都可以组合起来构建组合
 */
public interface Pointcut {

    /**
     * Return the ClassFilter for this pointcut.
     *
     * @return the ClassFilter (never <code>null</code>)
     */
    ClassFilter getClassFilter();

    /**
     * Return the MethodMatcher for this pointcut.
     *
     * @return the MethodMatcher (never <code>null</code>)
     */
    MethodMatcher getMethodMatcher();

}
