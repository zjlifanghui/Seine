package com.lfh.seine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lfh.seine.web.user.mapper")
public class SeineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeineApplication.class, args);
    }

}
