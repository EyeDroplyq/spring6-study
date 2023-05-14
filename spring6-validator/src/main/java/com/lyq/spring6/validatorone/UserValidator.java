package com.lyq.spring6.validatorone;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
//实现spring中的validator接口，来定义校验规则
public class UserValidator implements Validator {
    //这个方法用来判断对哪个类型进行数据校验
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    //定义校验规则
    @Override
    public void validate(Object target, Errors errors) {
        //如果name属性为空的话，校验失败
        ValidationUtils.rejectIfEmpty(errors,"name","name is null");
        User user=(User) target;
        if(user.getAge()<0){
            errors.rejectValue("age","age<0");
        }else if(user.getAge()>200){
            errors.rejectValue("age","age>200");
        }
    }
}
