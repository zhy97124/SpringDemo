package com.zhy.springframework.core.io;

import cn.hutool.core.lang.Assert;
import com.zhy.springframework.beans.BeansException;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description TODO
 * @Classname DefaultResourceLoader
 * @Date 2024/7/11 11:44
 * @Created by Shinelon
 */
public class DefaultResourceLoader implements ResourceLoader {

    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "Location must not be null");
        if (location.startsWith(CLASSPATH_URL_PREFIX)) {
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        }
        else {
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e) {
                return new FileSystemResource(location);
            }
        }
    }

}