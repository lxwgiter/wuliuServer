package com.hsy.lxw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hsy.lxw.mapper")
public class LxwApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxwApplication.class, args);
    }

}
