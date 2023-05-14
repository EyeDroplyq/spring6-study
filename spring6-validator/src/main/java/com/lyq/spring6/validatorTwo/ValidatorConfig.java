package com.lyq.spring6.validatorTwo;

import jakarta.validation.Validation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
//基于注解的数据校验
@Configuration
@ComponentScan("com.lyq.spring6.validatorTwo")
public class ValidatorConfig {
    @Bean
    public LocalValidatorFactoryBean getLocalValidatorFactoryBean(){
        return new LocalValidatorFactoryBean();
    }
}
