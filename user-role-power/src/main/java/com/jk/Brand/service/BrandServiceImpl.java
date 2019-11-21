package com.jk.Brand.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.Brand.mapper.BrandMapper;
import com.jk.commodity.model.Productbrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BrandServiceImpl
 * @Description
 * @Author
 * @Date 2019/11/21 15:55
 * @Version V1.0
 **/
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Map<String, Object> queryBrandList(Integer page, Integer rows) {
        Page<Productbrand> objects = PageHelper.startPage(page, rows);
        List<Productbrand> list = brandMapper.queryList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total",objects.getTotal());
        map.put("rows",list);
        return map;
    }

    @Override
    public void updateBrand(Integer id, String productBrand_name) {
        brandMapper.updateBrand(id,productBrand_name);
    }

    @Override
    public void deleteBrand(Integer id) {
        brandMapper.deleteBrand(id);
    }

    @Override
    public void addBrand(Integer type, String productBrand_name) {
        brandMapper.addBrand(type,productBrand_name);
    }
}
