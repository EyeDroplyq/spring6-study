package com.lyq.spring6.iocXml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: lyq
 * @createDate: 8/5/2023
 * @version: 1.0
 */
public class StudentAndTeacherTest {
    @Test
    public void studentAndTeacher(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("StudentAndTeacher.xml");
        Student student = applicationContext.getBean("student", Student.class);
        student.run();
    }
}
