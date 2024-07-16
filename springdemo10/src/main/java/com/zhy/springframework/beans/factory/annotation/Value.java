package com.zhy.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 *字段或方法/构造函数参数级别的注解
 * 表示受影响参数的默认值表达式。
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    /**
     * The actual value expression: e.g. "#{systemProperties.myProp}".
     */
    String value();

}
