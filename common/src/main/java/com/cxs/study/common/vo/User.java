package com.cxs.study.common.vo;

import java.io.Serializable;

/**
 * @className: User
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/4/3
 **/
public class User implements Serializable {
    private Long id;
    private String name;
    private String sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
