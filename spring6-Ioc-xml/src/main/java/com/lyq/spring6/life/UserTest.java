package com.lyq.spring6.life;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: lyq
 * @createDate: 9/5/2023
 * @version: 1.0
 */
public class UserTest {
    @Test
    public void testUser(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("6. 初始化完成对象了，可以使用了");
        applicationContext.close();
    }
}
