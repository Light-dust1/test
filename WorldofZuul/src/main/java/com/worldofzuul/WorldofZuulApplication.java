package com.worldofzuul;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.worldofzuul.mapper")
public class WorldofZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorldofZuulApplication.class, args);
    }

}
