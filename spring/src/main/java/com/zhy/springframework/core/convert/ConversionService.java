package com.zhy.springframework.core.convert;

import com.sun.istack.internal.Nullable;

/**
 * @Description TODO 类型转换抽象接口
 * @Classname ConversionService
 * @Date 2024/7/16 13:09
 * @Created by Shinelon
 */
public interface ConversionService {

    /** Return {@code true} if objects of {@code sourceType} can be converted to the {@code targetType}. */
    boolean canConvert(@Nullable Class<?> sourceType, Class<?> targetType);

    /** Convert the given {@code source} to the specified {@code targetType}. */
    <T> T convert(Object source, Class<T> targetType);

}
