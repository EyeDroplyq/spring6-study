package com.lyq.spring6.springResource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
public class UrlResourceDemo {
    public static void loadUrlResource(String path){
        UrlResource urlResource = null;
        try {
            urlResource = new UrlResource(path);
            URL url = urlResource.getURL();
            System.out.println("path:"+url.getPath()+",host:"+url.getHost());
            String filename = urlResource.getFilename();
            System.out.println("filename:"+filename);
            String description = urlResource.getDescription();
            System.out.println("description"+description);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String path="http://www.baidu.com";
        loadUrlResource(path);
    }
}
