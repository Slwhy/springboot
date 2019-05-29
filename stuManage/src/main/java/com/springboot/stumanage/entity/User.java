package com.springboot.stumanage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

////@Entity 是一个必选的注解，声明这个类对应了一个数据库表
////@Table(name = "user") 是一个可选的注解。
//// 声明了数据库实体对应的表信息。包括表名称、索引信息等。
//// 这里声明这个实体类对应的表名是 user。如果没有指定，则表名和实体的名称保持一致。

@Entity
//@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    public Integer getTab() {
        return tab;
    }

    public void setTab(Integer tab) {
        this.tab = tab;
    }

    //标记，0为root用户，1为老师，2为学生
    private Integer tab;

    @Column(length = 32)
    private String username;

    @Column(length = 64)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}




