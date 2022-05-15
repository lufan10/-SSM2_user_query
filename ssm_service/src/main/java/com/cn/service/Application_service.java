package com.cn.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cn.service","com.cn.mapper"})
@MapperScan(basePackages = {"com.cn.mapper"})
public class Application_service {
    public static void main(String[] args) {
        SpringApplication.run(Application_service.class);
    }
}
