package com.jk.flux.controller;

import com.jk.aopmongdb.LogBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version 1.0
 * @ClassName FluxController
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/25 16:50
 **/
@Controller
@RequestMapping("flux")
public class FluxController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("toFlux")
    public String toFlux(){
        return "flux/showflux";
    }
    //查询mongodb切面
    @RequestMapping("queryFluxList")
    @ResponseBody
    public List queryFluxList(){
        Query query = new Query();
        List<LogBack> fluxList = mongoTemplate.findAll(LogBack.class);
        return fluxList;
    }
}
