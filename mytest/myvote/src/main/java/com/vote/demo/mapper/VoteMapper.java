package com.vote.demo.mapper;

import com.vote.demo.entity.Vote;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-23 10:28
 */
public interface VoteMapper extends Mapper<Vote> {
    @Select("select * from vote where pid=#{pid}")
    public Vote selectByPid(int pid);
}
