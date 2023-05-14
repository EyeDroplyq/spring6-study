package com.lyq.spring6.springResource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
public class ClassPathResourceDemo {
    public static void loadClassPathResource(String path){
        ClassPathResource classPathResource = new ClassPathResource(path);
        String filename = classPathResource.getFilename();
        System.out.println(filename);
        String description = classPathResource.getDescription();
        System.out.println(description);
        try {
            InputStream inputStream = classPathResource.getInputStream();
            byte[] b=new byte[11];
            while(inputStream.read(b)!=-1){
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        loadClassPathResource("lyq.txt");
    }
}
