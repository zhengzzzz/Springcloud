package com.qianfeng.springcloud.pojo;

import java.util.Date;

public class user {

    private Long id;
    private Date date;


    public user() {
    }

    public user(Long id) {
        this.date = new Date();
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
