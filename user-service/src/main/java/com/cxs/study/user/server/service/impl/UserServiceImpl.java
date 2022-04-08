package com.cxs.study.user.server.service.impl;

import com.cxs.study.common.vo.Borrow;
import com.cxs.study.common.vo.User;
import com.cxs.study.user.server.mapper.UserMapper;
import com.cxs.study.user.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @className: TestServiceFallbackImpl
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/4/2
 **/
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userMapper.selectById(id);
    }
}
