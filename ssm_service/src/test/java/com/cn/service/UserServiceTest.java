package com.cn.service;

import com.cn.domain.User;
import com.cn.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = Application_service.class)
public class UserServiceTest {
    @Resource
    private UserMapper userMapper;
    @Test
    void findAll(){
        List<User> userList = userMapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
