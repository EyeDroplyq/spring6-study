package com.lyq.spring6.validatorTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
@Component
public class Validation2 {
    @Autowired
    private Validator validator;

    public boolean validatorTwo(User user){
        BindException bindException = new BindException(user,user.getName());
        validator.validate(user,bindException);
        List<ObjectError> allErrors = bindException.getAllErrors();
        if(allErrors.size()>0){
            System.out.println(allErrors);
            return true;
        }else{
            return false;
        }
    }
}
