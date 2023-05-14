package com.lyq.spring6.springResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
public class ResourceLoaderDemo {
    public static void main(String[] args) throws IOException {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
//        Resource resource = applicationContext.getResource("lyq.txt");
//        System.out.println(resource.getFilename());
//        ApplicationContext applicationContext=new FileSystemXmlApplicationContext();
//        Resource re = applicationContext.getResource("lyq.txt");
//        System.out.println(re.getFilename());
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        //虽然我们new的是classPathResource但是我们通过在path中使用了一个http请求，得到了一个urlResource
        Resource resource = applicationContext.getResource("http://www.baidu.com");
        System.out.println(resource.getURI());
    }
}
