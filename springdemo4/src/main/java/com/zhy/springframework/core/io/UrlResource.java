package com.zhy.springframework.core.io;




import cn.hutool.core.lang.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Description TODO 通过http读取云服务的文件
 * @Classname UrlResource
 * @Date 2024/7/11 11:49
 * @Created by Shinelon
 */
public class UrlResource implements Resource {
    public final URL url;

    public UrlResource(URL url) {
        Assert.notNull(url,"URL must not be null");
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection con=this.url.openConnection();
        try{
            return con.getInputStream();
        }catch (IOException e){
            if(con instanceof HttpURLConnection){
                ((HttpURLConnection)con).disconnect();//关闭连接
            }
            throw e;
        }
    }
}
