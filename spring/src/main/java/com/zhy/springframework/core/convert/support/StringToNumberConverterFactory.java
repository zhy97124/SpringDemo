package com.zhy.springframework.core.convert.support;

import com.sun.istack.internal.Nullable;
import com.zhy.springframework.core.convert.converter.Converter;
import com.zhy.springframework.core.convert.converter.ConverterFactory;
import com.zhy.springframework.util.NumberUtils;

/**
 * @Description TODO Converts from a String any JDK-standard Number implementation.
 * @Classname StringToNumberConverterFactory
 * @Date 2024/7/16 13:13
 * @Created by Shinelon
 */
public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }

}
