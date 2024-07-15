package com.zhy.springframework.util;

import com.zhy.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Simple strategy interface for resolving a String value.
 * Used by {@link ConfigurableBeanFactory}.
 * <p>
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);

}
