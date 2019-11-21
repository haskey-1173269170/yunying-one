package com.jk.commodity.controller;

import com.jk.commodity.model.*;
import com.jk.commodity.service.CommodityService;
import com.jk.image.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CommodityController
 * @Description
 * @Author
 * @Date 2019/11/19 19:26
 * @Version V1.0
 **/
@Controller
@RequestMapping("commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @RequestMapping("queryCommodity")
    @ResponseBody
    public Map<String,Object> queryCommodity(Integer page, Integer rows, Commodity commodity){
        return commodityService.queryCommodity(page,rows,commodity);
    }

    @RequestMapping("soldOut")
    @ResponseBody
    public void soldOut(Integer id){
        commodityService.soldOut(id);
    }

    @RequestMapping("queryNotSoldCommodity")
    @ResponseBody
    public Map<String,Object> queryNotSoldCommodity(Integer page,Integer rows,Commodity commodity){
        return commodityService.queryNotSoldCommodity(page,rows,commodity);
    }
    @RequestMapping("putaway")
    @ResponseBody
    public void putaway(Integer id){
        commodityService.putaway(id);
    }
    @RequestMapping("deleteAll")
    @ResponseBody
    public void deleteAll(String ids){
        commodityService.deleteAll(ids);
    }

    @RequestMapping("particulars")
    @ResponseBody
    public Map<String,Object> particulars(Integer id){
        List<Image> particulars = commodityService.particulars(id);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("rows",particulars);
        return map;
    }

    @RequestMapping("zengCount")
    @ResponseBody
    public void  zengCount(Image image){
        commodityService.zengCount(image);
    }
    @RequestMapping("jianCount")
    @ResponseBody
    public void  jianCount(Image image){
        commodityService.jianCount(image);
    }
    @RequestMapping("queryCpu")
    @ResponseBody
    public List<ProductCPU> queryCpu(){
        return commodityService.queryCpu();
    }
    @RequestMapping("queryOrigin")
    @ResponseBody
    public List<ProductOrigin> queryOrigin(){
        return commodityService.queryOrigin();
    }
    @RequestMapping("querySystem")
    @ResponseBody
    public List<Operatingsystem> querySystem(){
        return commodityService.querySystem();
    }
    @RequestMapping("queryType")
    @ResponseBody
    public List<Type> queryType(){
        return commodityService.queryType();
    }
    @RequestMapping("queryBrand")
    @ResponseBody
    public List<Productbrand> queryBrand(Integer id){
        return commodityService.queryBrand(id);
    }
    @RequestMapping("queryVersion")
    @ResponseBody
    public List<Productversion> queryVersion(){
        return commodityService.queryVersion();
    }

    @RequestMapping("queryColor")
    @ResponseBody
    public List<Image> queryColor(){
        return commodityService.queryColor();
    }

    @RequestMapping("addCommodity")
    @ResponseBody
    public void addCommodity(Commodity commodity){
        commodityService.addCommodity(commodity);
    }
    @RequestMapping("xiangQing")
    @ResponseBody
    public Commodity xiangQing(Integer id){
        return commodityService.xiangQing(id);
    }

    @RequestMapping("toshow")
    public String toshow(){
        return "commodity/show";
    }
    @RequestMapping("tonotSold")
    public String tonotSold(){
        return "commodity/notSold";
    }
    @RequestMapping("toParticulars")
    public String toParticulars(){
        return "commodity/particulars";
    }
    @RequestMapping("tozengCount")
    public String tozengCount(){
        return "commodity/zeng";
    }
    @RequestMapping("tojianCount")
    public String tojianCount(){
        return "commodity/jian";
    }
    @RequestMapping("toaddcommodity")
    public String toaddcommodity(){
        return "commodity/addCommodity";
    }
    @RequestMapping("toXiangQing")
    public String toXiangQing(){
        return "commodity/xiangQing";
    }
}
