package com.zhy.springframework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description TODO 读取文件
 * @Classname FileSystemResource
 * @Date 2024/7/11 11:44
 * @Created by Shinelon
 */
public class FileSystemResource implements Resource{
    private final File file;

    private  final String path;

    public FileSystemResource(File file){
        this.file=file;
        this.path=file.getPath();
    }

    public FileSystemResource(String path) {
        this.file = new File(path);//根据路径创建文件
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    public final String getPath(){
        return this.path;
    }
}
