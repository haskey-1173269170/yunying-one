package com.jk.money.controller;

import com.jk.money.service.MoneyService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName MoneyController
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/22 9:34
 **/
@Controller
@RequestMapping("money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;

    @RequestMapping("querynewordercount")
    @ResponseBody
    public Integer querynewordercount(){
       return  moneyService.querynewordercount();
    }
    @RequestMapping("queryoverordercount")
    @ResponseBody
    public Integer queryoverordercount(){
       return  moneyService.queryoverordercount();
    }
    @RequestMapping("queryfailordercount")
    @ResponseBody
    public Integer queryfailordercount(){
       return  moneyService.queryfailordercount();
    }
    @RequestMapping("querynewregusercount")
    @ResponseBody
    public Integer querynewregusercount(){
       return  moneyService.querynewregusercount();
    }

    @RequestMapping("queryDiagram")
    @ResponseBody
    public List<Map<String,Object>> queryDiagram(){
        return moneyService.queryDiagram();
    }

    @RequestMapping("queryCommdityAnaysis")
    @ResponseBody
    public List<Map<String,Object>> queryCommdityAnaysis(){
        return moneyService.queryCommdityAnaysis();
    }

}
