package com.zhy.springframework.aop;

/**
 * 所有由切点驱动的顾问的超级接口。
 * 这几乎涵盖了除介绍顾问之外的所有顾问，
 * 方法级匹配不适用。
 */
public interface PointcutAdvisor extends Advisor {

    /**
     * Get the Pointcut that drives this advisor.
     */
    Pointcut getPointcut();

}
