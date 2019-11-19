package com.jk.power.controller;


import com.jk.power.model.Power;
import com.jk.power.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName PowerContorller
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 13:48
 * @Version 1.0
 **/
@Controller
@RequestMapping("power")
public class PowerContorller {
    @Autowired
    private PowerService powerService;

    @RequestMapping("initPower")
    @ResponseBody
    public List<Power> initPower() {
        return powerService.initPower();
    }
}
