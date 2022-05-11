package com.cn.service;

import com.cn.domain.LoginUser;
import com.cn.domain.User;
import com.cn.mapper.UserMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 继承并实现UserService接口类的findAll()方法
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        List<User> all = userMapper.findAll();
        return all;
    }
    @Override
    public  User find(int id) {
        User user = userMapper.find(id);
        return user;
    }
    @Override
    public LoginUser login(LoginUser loginUser) {
        LoginUser user = userMapper.login(loginUser);
        return user;
    }
    @Override
    public List<User> findByNameAndAddressAndEmail(String name, String address, String email) {
        List<User> byNameAndAddressAndEmail = userMapper.findByNameAndAddressAndEmail(name,address,email);
        return byNameAndAddressAndEmail;
    }
    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
    @Override
    public void delete(int  id) {
        userMapper.delete(id);

    }
    @Override
    public void deleteSelect(int[] ids) {
        //判断数组对象被为空和长度大于0
        if (ids!=null&&ids.length>0){
            for (int id : ids) {
                userMapper.delete(id);
            }
        }
    }
    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}
