package com.jk.cmsuser.service;

import com.jk.cmsuser.mapper.CmsMapper;
import com.jk.cmsuser.model.CmsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CmsServiceImpl
 * @Deacription TODO
 * @Author 原国庆
 * @Date 2019/11/22 21:30
 * @Version 1.0
 **/
@Service
public class CmsServiceImpl implements CmsService {

    @Autowired
    private CmsMapper cmsMapper;

    @Override
    public Map queryCms() {
        List<CmsUser> list = cmsMapper.queryCms();
        Map<String , Object> map = new HashMap<>();
        List<Object> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        for (int i=0;i<list.size();i++){
            list1.add(list.get(i).getCmsUserDate().toLocaleString().substring(0,10));
            list2.add(list.get(i).getCount());
        }
        map.put("categories",list1);
        map.put("data",list2);
        System.out.println(map);
        return map;
    }

    @Override
    public List queryNewCmsUser() {
        return cmsMapper.queryNewCmsUser();
    }
}
