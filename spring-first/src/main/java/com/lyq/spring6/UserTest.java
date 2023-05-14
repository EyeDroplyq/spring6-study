package com.lyq.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: lyq
 * @createDate: 7/5/2023
 * @version: 1.0
 */
public class UserTest {
    private  Logger logger = LoggerFactory.getLogger(UserTest.class);
    @Test
    public void test(){
        logger.info("hello world");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println("1:"+user);
        System.out.print("2:");
        user.add();
    }
}
