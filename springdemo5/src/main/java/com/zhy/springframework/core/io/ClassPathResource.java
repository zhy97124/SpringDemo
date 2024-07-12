package com.zhy.springframework.core.io;

import cn.hutool.core.lang.Assert;
import com.zhy.springframework.utils.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description TODO 读取ClassPath下的文件
 * @Classname ClassPathResource
 * @Date 2024/7/11 11:44
 * @Created by Shinelon
 */
public class ClassPathResource implements Resource{
    private final String path;

    private ClassLoader classLoader;

    public ClassPathResource(String path) {
        this(path, (ClassLoader) null);
    }

    public ClassPathResource(String path,ClassLoader classLoader){
        Assert.notNull(path,"Path must not be null");
        this.path = path;
        this.classLoader = (classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader());
    }
    @Override
    public InputStream getInputStream() throws IOException {
        InputStream is=classLoader.getResourceAsStream(path);
        if(is==null){
            throw new FileNotFoundException(this.path+" cannot be opened because it does not exist");
        }
        return is;
    }
}
