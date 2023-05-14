package com.lyq.spring6.tx.dao;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 13/5/2023
 * @version: 1.0
 */
public interface BookDao {
    List<Integer> getBookPriceAndStock(Integer bookId);

    void updateStock(Integer bookId);
}
