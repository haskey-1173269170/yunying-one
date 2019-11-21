package com.jk.adv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @ClassName PageController
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/21 11:56
 **/
@Controller
@RequestMapping("advPage")
public class AdvPageController {

    @RequestMapping("toShowAdv")
    public String toShowAdv(){
        return "adv/showAdv";
    }
    @RequestMapping("toAddAdv")
    public String toAddAdv(){
        return "adv/addAdv";
    }
}
