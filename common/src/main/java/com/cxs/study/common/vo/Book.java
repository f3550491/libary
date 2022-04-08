package com.cxs.study.common.vo;

import java.io.Serializable;

/**
 * @className: Book
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/4/3
 **/
public class Book implements Serializable {

    private Long id;
    private String name;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
