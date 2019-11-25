package com.jk.cmsuser.controller;

import com.jk.cmsuser.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName CmsController
 * @Deacription TODO
 * @Author 原国庆
 * @Date 2019/11/22 21:27
 * @Version 1.0
 **/
@Controller
@RequestMapping("cms")
public class CmsController {
    @Autowired
    private CmsService cmsService;

    @RequestMapping("queryCms")
    @ResponseBody
    public Map queryCms(){
        return cmsService.queryCms();
    }

    @RequestMapping("queryNewCmsUser")
    @ResponseBody
    public List queryNewCmsUser(){
        return cmsService.queryNewCmsUser();
    }

}
