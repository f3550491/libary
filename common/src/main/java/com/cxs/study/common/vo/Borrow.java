package com.cxs.study.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @className: Borrow
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/4/3
 **/
public class Borrow implements Serializable {

    private Long id;
    private Long userId;
    private Long bookId;
    private Date startTime;
    private Date endTime;
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
