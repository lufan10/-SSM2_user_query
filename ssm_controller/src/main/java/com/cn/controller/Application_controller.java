package com.cn.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cn.service","com.cn.controller"})
@MapperScan(basePackages = {"com.cn.mapper"})
public class Application_controller {
    public static void main(String[] args) {
        SpringApplication.run(Application_controller.class);
    }
}
