package com.zhy.springframework.context;

import com.zhy.springframework.beans.factory.HierarchicalBeanFactory;
import com.zhy.springframework.beans.factory.ListableBeanFactory;
import com.zhy.springframework.core.io.ResourceLoader;

/**
 * 应用上下文g
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
