package com.jk.commodity.model;

import java.io.Serializable;

/**
 * @ClassName ProductOrigin
 * @Description
 * @Author
 * @Date 2019/11/20 14:12
 * @Version V1.0
 **/
public class ProductOrigin implements Serializable {
    private static final long serialVersionUID = 5562730406412052434L;
    private Integer productOrigin_id;
    private String productOrigin_name;

    public Integer getProductOrigin_id() {
        return productOrigin_id;
    }

    public void setProductOrigin_id(Integer productOrigin_id) {
        this.productOrigin_id = productOrigin_id;
    }

    public String getProductOrigin_name() {
        return productOrigin_name;
    }

    public void setProductOrigin_name(String productOrigin_name) {
        this.productOrigin_name = productOrigin_name;
    }
}
