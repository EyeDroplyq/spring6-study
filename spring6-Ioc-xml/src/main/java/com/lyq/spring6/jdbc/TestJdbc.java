package com.lyq.spring6.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: lyq
 * @createDate: 8/5/2023
 * @version: 1.0
 */
public class TestJdbc {

    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("JdbcConfig.xml");
        DruidDataSource druidDataSource = applicationContext.getBean("druidDataSource", DruidDataSource.class);
        System.out.println(druidDataSource.getUrl());
    }
}
