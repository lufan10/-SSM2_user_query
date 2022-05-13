package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class UserController {
    @RequestMapping("/save")
    public String save(){
        System.out.println("save....");
        return "index";
    }
}
