package com.jk.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @ClassName MoneyPageController
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/22 9:43
 **/
@Controller
@RequestMapping("money")
public class MoneyPageController {
    @RequestMapping("toShowMoney")
    public String toShowMoney(){
        return "money/showMoney";
    }
}
