package com.lyq.spring6.validatorTwo;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @description: Java原生的校验器
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
@Component
public class Validation1 {

    @Autowired
    private Validator validator;

    //定义校验规则
    public boolean validatorOne(User user){
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        if (validate.size()>0){
            return true;
        }else{
            return false;
        }
    }
}
