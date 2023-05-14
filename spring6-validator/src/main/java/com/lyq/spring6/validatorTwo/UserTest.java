package com.lyq.spring6.validatorTwo;

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
//        Validation1 validation1 = context.getBean(Validation1.class);
//        User user = new User();
//        user.setName("lucy");
//        user.setAge(232);
//        boolean res = validation1.validatorOne(user);
//        System.out.println(res);
        Validation2 validation2 = context.getBean(Validation2.class);
        User user = new User();
        user.setName("lucy");
        user.setAge(232);
        boolean res = validation2.validatorTwo(user);
        System.out.println(res);
    }
}
