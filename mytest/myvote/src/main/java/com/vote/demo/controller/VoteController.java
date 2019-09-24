package com.vote.demo.controller;

import com.vote.demo.entity.User;
import com.vote.demo.exception.UserException;
import com.vote.demo.exception.msg.UserMessage;
import com.vote.demo.servcie.UserService;
import com.vote.demo.servcie.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-23 09:33
 */
@Controller
@RequestMapping("vote")
public class VoteController {
    @Autowired
    private UserService userService;
    @Autowired
    private VoteService voteService;

    @PostMapping("{id}")
    public String vote(@PathVariable("id") int id, int[] pigBoyIds){
        User user = userService.getUser(id);
        if (user == null)
            throw new UserException(UserMessage.USER_IS_NULL);
        for (int pid : pigBoyIds) {
            voteService.vote(pid);
        }
        return "show";
    }
}
