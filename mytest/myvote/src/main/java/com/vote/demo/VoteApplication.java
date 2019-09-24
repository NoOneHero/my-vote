package com.vote.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-22 16:42
 */
@SpringBootApplication
@MapperScan("com.vote.demo.mapper")
public class VoteApplication {
    public static void main(String[] args) {
        SpringApplication.run(VoteApplication.class,args);
    }
}
