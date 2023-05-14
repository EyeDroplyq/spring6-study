package com.lyq.spring6.tx;

import com.lyq.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @description:
 * @author: lyq
 * @createDate: 13/5/2023
 * @version: 1.0
 */
@SpringJUnitConfig(locations = "classpath:spring-config.xml")
public class TxTest {
    @Autowired
    private BookController bookController;
    @Test
    public void buy(){
        bookController.buyBook(1,1);
    }
}
