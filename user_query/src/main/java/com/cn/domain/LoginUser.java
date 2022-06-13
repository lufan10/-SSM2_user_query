package com.cn.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录
 */
@Data
public class LoginUser implements Serializable {
    private Integer id;
    private String username;
    private String password;
}






