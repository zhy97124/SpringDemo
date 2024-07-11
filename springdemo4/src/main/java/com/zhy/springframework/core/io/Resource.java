package com.zhy.springframework.core.io;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description TODO
 * @Classname Resource
 * @Date 2024/7/11 11:45
 * @Created by Shinelon
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
