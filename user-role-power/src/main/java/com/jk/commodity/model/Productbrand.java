package com.jk.commodity.model;

import java.io.Serializable;

/**
 * @ClassName Productbrand
 * @Description
 * @Author
 * @Date 2019/11/20 14:46
 * @Version V1.0
 **/
public class Productbrand implements Serializable {
    private static final long serialVersionUID = 9213690020858090100L;
    private Integer productBrand_id;
    private String productBrand_name;
    private Integer productBrand_typeId;

    public Integer getProductBrand_id() {
        return productBrand_id;
    }

    public void setProductBrand_id(Integer productBrand_id) {
        this.productBrand_id = productBrand_id;
    }

    public String getProductBrand_name() {
        return productBrand_name;
    }

    public void setProductBrand_name(String productBrand_name) {
        this.productBrand_name = productBrand_name;
    }

    public Integer getProductBrand_typeId() {
        return productBrand_typeId;
    }

    public void setProductBrand_typeId(Integer productBrand_typeId) {
        this.productBrand_typeId = productBrand_typeId;
    }
}
