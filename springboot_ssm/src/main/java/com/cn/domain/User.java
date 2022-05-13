package com.cn.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String qq;
    private String address;
    private String email;
    private Date birthday;
}
















