package com.lyq.spring6.validatorFour;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
public class CannotBlankValidator implements ConstraintValidator<CannotBlank,String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value.contains(" ")){
            System.out.println(context.getDefaultConstraintMessageTemplate());
            return true;
        }else{
            return false;
        }
    }
}
