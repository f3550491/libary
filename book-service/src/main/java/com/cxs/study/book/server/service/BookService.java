package com.cxs.study.book.server.service;

import com.cxs.study.common.vo.Book;

/**
 * @className: TestService
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/3/30
 **/
public interface BookService {

    public Book selectById(Long id);
}
