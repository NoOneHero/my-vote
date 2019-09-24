package com.vote.demo.servcie;

import com.vote.demo.entity.PigBoy;
import com.vote.demo.entity.Vote;
import com.vote.demo.mapper.VoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-23 10:39
 */
@Service
public class VoteService {
    @Autowired(required = false)
    private VoteMapper voteMapper;
    public void vote(int pid){
        Vote vote = voteMapper.selectByPid(pid);
        if (vote == null){
            vote = new Vote();
            vote.setPid(pid);
            vote.setPoll(1);
            voteMapper.insert(vote);
        }else{
            Integer old = vote.getPoll();
            vote.setPoll(old + 1);
            voteMapper.updateByPrimaryKey(vote);
        }
    }
}
