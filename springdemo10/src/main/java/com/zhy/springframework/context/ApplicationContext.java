package com.zhy.springframework.context;

import com.zhy.springframework.beans.factory.HierarchicalBeanFactory;
import com.zhy.springframework.beans.factory.ListableBeanFactory;
import com.zhy.springframework.core.io.ResourceLoader;

/**
 * Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 * <p>
 * 应用上下文
 * <p>
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
