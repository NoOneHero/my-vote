package com.vote.demo.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-23 09:55
 */
@Data
@Table(name = "vote")
public class Vote {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private Integer pid;
    private Integer poll;  //选票数
}
