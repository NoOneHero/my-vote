package com.vote.demo.entity;

import lombok.Data;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-22 16:58
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private int age;
}
