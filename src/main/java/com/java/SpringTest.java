package com.java;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.java.mapper")
public class SpringTest {
    public static void main(String[] args) {
        SpringApplication.run(SpringTest.class, args);
    }
}
