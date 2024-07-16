package com.zhy.springframework.core.convert.support;

import com.zhy.springframework.core.convert.converter.ConverterRegistry;

/**
 * @Description TODO 实现类型转换服务
 * @Classname DefaultConversionService
 * @Date 2024/7/16 13:09
 * @Created by Shinelon
 */
public class DefaultConversionService extends GenericConversionService{

    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        // 添加各类类型转换工厂
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }

}