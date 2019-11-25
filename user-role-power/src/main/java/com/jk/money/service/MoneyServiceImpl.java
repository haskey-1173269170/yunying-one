package com.jk.money.service;

import com.jk.money.mapper.MoneyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName MoneyServiceImpl
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/22 9:36
 **/
@Service
public class MoneyServiceImpl implements MoneyService {
    @Autowired
    private MoneyMapper moneyMapper;

    @Override
    public Integer querynewordercount() {
        Integer querynewordercount = moneyMapper.querynewordercount();
        System.out.println(querynewordercount);
        return querynewordercount;
    }

    @Override
    public Integer queryoverordercount() {
        return moneyMapper.queryoverordercount();
    }

    @Override
    public Integer queryfailordercount() {
        return moneyMapper.queryfailordercount();
    }

    @Override
    public Integer querynewregusercount() {
        return moneyMapper.querynewregusercount();
    }

    @Override
    public List<Map<String,Object>> queryDiagram() {
        //查询数据库数据
        List<Map<String,Object>> map1 =moneyMapper.queryDiagram();
        //前台展示的返回的数据
        List<Map<String,Object>> map2 =new ArrayList<Map<String,Object>>();

        for (Map<String,Object> map:map1) {
            Map<String,Object> map3=new HashMap<>();
            map3.put("y",map.get("y"));
            map3.put("name",map.get("name"));
            map2.add(map3);
        }

        return map2;
    }

    @Override
    public List<Map<String, Object>> queryCommdityAnaysis() {
        //查询数据库数据
        List<Map<String,Object>> map1 =moneyMapper.queryCommdityAnaysis();
        //前台展示的返回的数据
        List<Map<String,Object>> map2 =new ArrayList<Map<String,Object>>();


            for (Map<String,Object> map:map1) {
                Map<String,Object> map3=new HashMap<>();
                List<Object> list = new ArrayList<>();
                list.add(map.get("cou"));
                map3.put("data",list);
                if(map.get("id").toString().equals("1")){
                    map3.put("name","手机");
                }else if(map.get("id").toString().equals("2")){
                    map3.put("name","电脑");
                }else if(map.get("id").toString().equals("3")){
                    map3.put("name","电视");
                }
                map2.add(map3);
            }

        return map2;
    }
}
