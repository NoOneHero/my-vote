package com.vote.demo.exception.handler;

import com.vote.demo.exception.UserException;
import com.vote.demo.exception.msg.UserMessage;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-22 21:57
 */
@ControllerAdvice
public class UserExceptionHandler {
    @ExceptionHandler(UserException.class)
    public String handleException(UserException e, Model model){
        UserMessage userMessage = e.getUserMessage();
        model.addAttribute("err",userMessage);
        return "err";
    }
}
