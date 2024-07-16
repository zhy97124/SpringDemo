package com.zhy.springframework.util;

import com.zhy.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * 用于解析 String 值的简单策略接口。
 * 由 {@link ConfigurableBeanFactory} 使用。
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);

}
