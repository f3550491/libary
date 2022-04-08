package com.cxs.study.user.server.service;

import com.cxs.study.common.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @className: TestServiceApis
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/3/30
 **/
public interface UserService {

    public User findById(Long id);
}
