package com.jk.flux.controller;

import com.jk.aopmongdb.LogBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public List queryFluxList(LogBack logBack){

        Query query = new Query();
        if (logBack.getStartDate()!=null && !"".equals(logBack.getStartDate()) || logBack.getEndDate()!=null && !"".equals(logBack.getEndDate()) ){
           query.addCriteria(Criteria.where("thisDate").gt(logBack.getStartDate()).lt(logBack.getEndDate()));
        }
        List<LogBack> fluxList = mongoTemplate.find(query,LogBack.class);
        System.out.println(fluxList);
        return fluxList;
    }
    @RequestMapping("saveFluxList")
    @ResponseBody
    public void addFlux(LogBack logBack){

        mongoTemplate.save(logBack);
    }
    @RequestMapping("toAdd")
    public String toAdd(){

        return "flux/addFlux";
    }
    @RequestMapping("toShowFluxInfo")
    public String toShowFluxInfo(String id, Model model){
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        LogBack one = mongoTemplate.findOne(query, LogBack.class);
        model.addAttribute("one",one);
        return "flux/updFlux";
    }


    @RequestMapping("delFlux")
    @ResponseBody
    public void delFlux(String id){
        System.out.println(id);
        Query query = new Query();
        query.addCriteria(Criteria.where("id").in(id));
        mongoTemplate.findAllAndRemove(query,LogBack.class,"logBack");
    }
}
