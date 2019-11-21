package com.jk.adv.controller;

import com.jk.adv.model.Adv;
import com.jk.adv.service.AdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version 1.0
 * @ClassName AdvController
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/21 11:31
 **/
@Controller
@RequestMapping("adv")
public class AdvController {

    @Autowired
    private AdvService advService;

    @RequestMapping("queryAdv")
    @ResponseBody
    public List<Adv> queryAdv(Adv adv){
        return  advService.queryAdv(adv);
    }
    @RequestMapping("deleteAdvById")
    @ResponseBody
    public void deleteAdvById(String id){
        advService.deleteAdvById(id);
    }
    @RequestMapping("addAdv")
    @ResponseBody
    public void addAdv(Adv adv){
        advService.addAdv(adv);
    }

    @RequestMapping("updateStatus")
    @ResponseBody
    public void updateStatus(Integer info,String advid){
        advService.updateStatus(info,advid);
    }
}
