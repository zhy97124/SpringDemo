package com.zhy.springframework.stereotype;

import java.lang.annotation.*;

/**
 * 指示带注释的类是“组件”。
 * 此类类被视为自动检测的候选类
 * 使用基于注释的配置和类路径扫描时。
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";

}
