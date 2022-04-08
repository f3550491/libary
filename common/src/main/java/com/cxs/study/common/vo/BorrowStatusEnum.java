package com.cxs.study.common.vo;

/**
 * @className: BorrowStatusEnum
 * @description: TODO 类描述
 * @author: chengxs
 * @date: 2022/4/3
 **/
public enum BorrowStatusEnum {
    INBORROW(0, "INBORROW", "借阅中"),
    ENDBORROW(1, "ENDBORROW", "已归还"),
    LOSE(2, "LOSE", "丢失");

    private int status;
    private String type;
    private String explain;

    private BorrowStatusEnum(int status, String type, String explain){
        this.status = status;
        this.type = type;
        this.explain = explain;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}
