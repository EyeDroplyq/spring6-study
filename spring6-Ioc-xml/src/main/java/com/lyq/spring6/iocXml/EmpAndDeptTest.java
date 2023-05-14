package com.lyq.spring6.iocXml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: lyq
 * @createDate: 8/5/2023
 * @version: 1.0
 */
public class EmpAndDeptTest {
    @Test
    public void testEmpAndDept(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("EmpAndDept.xml");
        Emp emp = applicationContext.getBean("emp", Emp.class);
        emp.work();
    }
}
