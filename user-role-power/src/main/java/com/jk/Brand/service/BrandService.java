package com.jk.Brand.service;

import java.util.Map;

/**
 * @ClassName BrandService
 * @Description
 * @Author
 * @Date 2019/11/21 15:55
 * @Version V1.0
 **/
public interface BrandService {
    Map<String, Object> queryBrandList(Integer page, Integer rows);

    void updateBrand(Integer id, String productBrand_name);

    void deleteBrand(Integer id);

    void addBrand(Integer type, String productBrand_name);
}
