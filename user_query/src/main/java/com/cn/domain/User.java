package com.cn.domain;
import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private int age;
    private String qq;
    private String address;
    private String email;

}
















