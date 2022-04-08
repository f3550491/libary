package com.cxs.study.user.server.controller;

import com.cxs.study.common.vo.User;
import com.cxs.study.common.vo.basic.CommonResult;
import com.cxs.study.user.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;

/**
 * @className: TestWebController
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/3/31
 **/
@RestController
@RequestMapping("/user")
public class TestWebController {

    @Autowired
    private UserService testService;

    @RequestMapping("/find")
    public CommonResult<User> find(@QueryParam("id") Long id){
        CommonResult<User> result = new CommonResult<>(testService.findById(id));
        return result;
    }
}
