package com.jk.Brand.controller;

import com.jk.Brand.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @ClassName BrandController
 * @Description
 * @Author
 * @Date 2019/11/21 15:55
 * @Version V1.0
 **/
@Controller
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;


    @RequestMapping("queryBrandList")
    @ResponseBody
    public Map<String,Object> queryBrandList(Integer page,Integer rows){
        return brandService.queryBrandList(page,rows);
    }
    @RequestMapping("updateBrand")
    @ResponseBody
    public void updateBrand(Integer id,String productBrand_name){
        brandService.updateBrand(id,productBrand_name);
    }
    @RequestMapping("deleteBrand")
    @ResponseBody
    public void deleteBrand(Integer id){
        brandService.deleteBrand(id);
    }
    @RequestMapping("addBrand")
    @ResponseBody
    public void addBrand(Integer type,String productBrand_name){
        brandService.addBrand(type,productBrand_name);
    }


    @RequestMapping("toqueryBrand")
    public String toBrand(){
        return "brand/show";
    }
    @RequestMapping("toupdate")
    public String toupdate(){
        return "brand/update";
    }
    @RequestMapping("toadd")
    public String toadd(){
        return "brand/add";
    }

}
