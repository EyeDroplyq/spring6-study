package com.lyq.spring6.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 13/5/2023
 * @version: 1.0
 */
@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Integer> getBookPriceAndStock(Integer bookId) {
        String sql01="select price from t_book where book_id=?";
        String sql02="select stock from t_book where book_id=?";
        Integer price = jdbcTemplate.queryForObject(sql01, Integer.class, bookId);
        Integer stock = jdbcTemplate.queryForObject(sql02, Integer.class, bookId);
        List<Integer> res=new LinkedList<>();
        res.add(price);
        res.add(stock);
        return res;
    }

    @Override
    public void updateStock(Integer bookId) {
        String sql="update t_book set stock=stock-1 where book_id=?";
        jdbcTemplate.update(sql,bookId);
    }

}
