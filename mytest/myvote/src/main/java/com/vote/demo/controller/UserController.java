package com.vote.demo.controller;

import com.vote.demo.entity.User;
import com.vote.demo.exception.UserException;
import com.vote.demo.exception.msg.UserMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-22 16:50
 */
@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("doLogin")
    public String doLogin(User user, Model model, HttpServletRequest request){
        if (user == null)
            //为什么要抛出异常？用于捕获，返回异常信息
            //为什么要给异常传入枚举类？定义统一异常信息，便于复用
            throw new UserException(UserMessage.USER_CANNOT_BE_NULL);
        if (!user.getUsername().equals("root") || !user.getPassword().equals("123")){
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }
        //这里是模拟用户登录，需要设置id，后面投票要用到
        user.setId(1);
        request.getSession().setAttribute("user",user);
        return "redirect:/index";
    }

}
