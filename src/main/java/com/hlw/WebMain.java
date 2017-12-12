package com.hlw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hlw"})
@MapperScan(basePackages = "com.hlw.mapper")
public class WebMain {
    public static void main(String[] args) {
        SpringApplication.run(WebMain.class,args);
    }
}
