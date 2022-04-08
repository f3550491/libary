package com.cxs.study.user.server.service;

import com.cxs.study.common.vo.User;
import com.cxs.study.user.server.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @className: UserServiceTest
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/4/5
 **/
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectById(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
        System.out.println(user.getId()+"--"+user.getName());
    }
}
