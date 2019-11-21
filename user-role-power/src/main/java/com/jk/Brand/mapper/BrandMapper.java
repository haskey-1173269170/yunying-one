package com.jk.Brand.mapper;

import com.jk.commodity.model.Productbrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName BrandMapper
 * @Description
 * @Author
 * @Date 2019/11/21 15:55
 * @Version V1.0
 **/
public interface BrandMapper {
    List<Productbrand> queryList();

    void updateBrand(@Param("id") Integer id, @Param("productBrand_name") String productBrand_name);

    void deleteBrand(@Param("id") Integer id);

    void addBrand(@Param("type") Integer type, @Param("productBrand_name") String productBrand_name);
}
