package com.lyq.spring6.tx.service;

import com.lyq.spring6.tx.dao.BookDao;
import com.lyq.spring6.tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 13/5/2023
 * @version: 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void buyBook(Integer userId, Integer bookId) {
        List<Integer> priceAndStockList = bookDao.getBookPriceAndStock(bookId);
        Integer price = priceAndStockList.get(0);
        Integer stock = priceAndStockList.get(1);
        if(stock>=1){
            bookDao.updateStock(bookId);
        }
        userDao.updateUserBlance(userId,price);
    }
}
