package com.cn.controller;

import com.cn.domain.User;
import com.cn.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = Application_controller.class)
public class ControllerTest {
    @Resource
    private UserService userService;
    @Test
    void findAll(){
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
