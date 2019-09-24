package com.vote.demo.controller;

import com.vote.demo.entity.PigBoy;
import com.vote.demo.servcie.PigBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-23 09:58
 */
@Controller
public class IndexController {
    @Autowired
    private PigBoyService pigBoyService;

    @GetMapping("index")
    public String index(Model model){
        List<PigBoy> pigBoyList = pigBoyService.findAll();
        model.addAttribute("pigBoys",pigBoyList);
        return "index";
    }
}
