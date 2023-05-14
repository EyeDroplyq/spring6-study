package com.lyq.spring6.validatorThree;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidatorConfig.class);
        MyValidation validation = context.getBean(MyValidation.class);
        User user = new User();
        user.setName("lucy ");
        user.setAge(23);
        String s = validation.UserValidation(user);
        System.out.println(s);
    }
}
