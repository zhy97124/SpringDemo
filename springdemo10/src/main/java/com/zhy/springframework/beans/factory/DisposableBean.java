package com.zhy.springframework.beans.factory;

/**
 * 接口由想要释放资源的 Bean 实现
 * 关于销毁。BeanFactory 应该调用 destroy方法，如果它释放了缓存的单例。应用程序上下文
 * 应该在关闭时处理其所有单例。
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
