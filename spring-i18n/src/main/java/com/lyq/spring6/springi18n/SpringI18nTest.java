package com.lyq.spring6.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
public class SpringI18nTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Object[] objs=new Object[]{"张三"};
        String message = applicationContext.getMessage("welcome", null, new Locale("zh","CN"));
        System.out.println(message);
    }
}
