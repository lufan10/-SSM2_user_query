package com.cn.service;
import com.cn.domain.LoginUser;
import com.cn.domain.User;

import java.util.List;

/**
 * 用户管理的业务接口
 */
public interface UserService {
    //DQL
    List<User> findAll();
    User find(int id);
    LoginUser login(LoginUser loginUser);
    List<User> findByNameAndAddressAndEmail(String name,String address,String email);
    //DML
    void insert(User user);
    void delete(int id);
    void deleteSelect(int[] ids);
    void update(User user);


}
