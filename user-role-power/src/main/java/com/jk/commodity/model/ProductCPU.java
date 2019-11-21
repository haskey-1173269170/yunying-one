package com.jk.commodity.model;

import java.io.Serializable;

/**
 * @ClassName ProductCPU
 * @Description
 * @Author
 * @Date 2019/11/20 13:57
 * @Version V1.0
 **/
public class ProductCPU implements Serializable {
    private static final long serialVersionUID = -8622265983649991561L;

    private Integer productCpu_id;
    private String productCpu_name;

    public Integer getProductCpu_id() {
        return productCpu_id;
    }

    public void setProductCpu_id(Integer productCpu_id) {
        this.productCpu_id = productCpu_id;
    }

    public String getProductCpu_name() {
        return productCpu_name;
    }

    public void setProductCpu_name(String productCpu_name) {
        this.productCpu_name = productCpu_name;
    }
}
