package com.lyq.spring6.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @description:
 * @author: lyq
 * @createDate: 12/5/2023
 * @version: 1.0
 */
//使用junit5以及spring test之后，可以通过@SpringJunitConig注解里面通过locations指定对应的配置文件位置
@SpringJUnitConfig(locations ="classpath:spring-config.xml" )
public class Junit5Test {
    @Autowired
    private User user;

    @Test
    public void testJunit5(){
        System.out.println(user);
        user.run();
    }
}
