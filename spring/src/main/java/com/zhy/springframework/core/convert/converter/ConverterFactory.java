package com.zhy.springframework.core.convert.converter;

/**
 * @Description TODO 类型转换工厂
 * @Classname ConverterFactory
 * @Date 2024/7/16 13:08
 * @Created by Shinelon
 */
public interface ConverterFactory<S, R>{

    /**
     * Get the converter to convert from S to target type T, where T is also an instance of R.
     * @param <T> the target type
     * @param targetType the target type to convert to
     * @return a converter from S to T
     */
    <T extends R> Converter<S, T> getConverter(Class<T> targetType);

}