package com.zhy.springframework.context;

import com.zhy.springframework.beans.BeansException;

/**
 * SPI接口可由大多数（如果不是全部）应用程序上下文实现。
 * 此外，还提供配置应用程序上下文的功能到应用程序上下文客户端方法中{@link ApplicationContext} 接口。
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();

}
