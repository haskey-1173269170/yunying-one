package com.jk.cmsuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ToCmsController
 * @Deacription TODO
 * @Author 原国庆
 * @Date 2019/11/22 21:49
 * @Version 1.0
 **/
@Controller
@RequestMapping("toCms")
public class ToCmsController {

    @RequestMapping("customerAnalysis")
    public String  customerAnalysis(){
        return "cmsuser/customerAnalysis";
    }

    @RequestMapping("toNewCmsUser")
    public String toNewCmsUser(){
        return "cmsuser/newCmsUserDialog";
    }
}
