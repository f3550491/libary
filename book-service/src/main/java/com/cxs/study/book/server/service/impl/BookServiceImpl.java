package com.cxs.study.book.server.service.impl;

import com.cxs.study.book.server.mapper.BookMapper;
import com.cxs.study.book.server.service.BookService;
import com.cxs.study.common.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: TestServiceImpl
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/3/30
 **/
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book selectById(Long id) {
        return bookMapper.selectById(id);
    }
}
