package com.vote.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-23 09:54
 */
@Data
@Table(name = "pigboy")
@NoArgsConstructor
public class PigBoy {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String name;
    private String realname;
    private String father;
    private String description;

    public PigBoy(Integer id) {
        this.id = id;
    }
}
