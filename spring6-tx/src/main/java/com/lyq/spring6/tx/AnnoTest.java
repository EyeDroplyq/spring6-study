package com.lyq.spring6.tx;

import com.lyq.spring6.tx.config.TxConfig;
import com.lyq.spring6.tx.controller.BookController;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: lyq
 * @createDate: 13/5/2023
 * @version: 1.0
 */

public class AnnoTest {
    @Resource
    private BookController bookController;
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        BookController controller = applicationContext.getBean(BookController.class);
        controller.buyBook(1,2);
    }
}
