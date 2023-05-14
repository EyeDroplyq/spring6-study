package com.lyq.spring6.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: lyq
 * @createDate: 12/5/2023
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class Junit4Test {
    @Autowired
    @Qualifier("user2")
    private User user;
    @Test
    public void testJunit4(){
        System.out.println(user);
        user.run();
    }
}
