package com.cxs.study.book.server.controller;

import com.cxs.study.book.server.service.BookService;
import com.cxs.study.common.vo.Book;
import com.cxs.study.common.vo.basic.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @className: TestController
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/3/30
 **/
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService testService;

    @RequestMapping("/find")
    public CommonResult<Book> find(@RequestParam("id") Long id){
        return new CommonResult<>(testService.selectById(id));
    }
}
