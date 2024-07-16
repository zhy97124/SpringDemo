package com.zhy.springframework.core.convert.converter;

/**
 * @Description TODO 类型转换处理接口
 * @Classname Converter
 * @Date 2024/7/16 13:08
 * @Created by Shinelon
 */
public interface Converter<S, T>  {

    /** Convert the source object of type {@code S} to target type {@code T}. */
    T convert(S source);

}
