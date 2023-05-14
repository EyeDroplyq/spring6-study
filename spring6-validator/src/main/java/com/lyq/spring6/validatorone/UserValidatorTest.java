package com.lyq.spring6.validatorone;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
public class UserValidatorTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("lucy");
        user.setAge(100);
        DataBinder dataBinder = new DataBinder(user);
        dataBinder.setValidator(new UserValidator());
        dataBinder.validate();
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult.getAllErrors());

    }
}
