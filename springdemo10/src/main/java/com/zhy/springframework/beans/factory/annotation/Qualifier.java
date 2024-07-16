package com.zhy.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * 自动接线时的候选 bean。它也可以用来注释其他
 * 自定义注释，然后可以用作限定符。
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";

}
