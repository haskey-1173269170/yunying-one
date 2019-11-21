package com.jk.image.model;

import java.io.Serializable;

/**
 * @ClassName Image
 * @Description
 * @Author
 * @Date 2019/11/20 9:27
 * @Version V1.0
 **/
public class Image implements Serializable {
    private static final long serialVersionUID = -5443092214096642933L;

    private Integer productColor_id;

    private String productColor_name;

    private String productColor_img;

    private Integer productColor_count;


    private Integer productColor_price;
    private Integer productColor_versionprice;
    private String versionName;

    public Integer getProductColor_count() {
        return productColor_count;
    }

    public void setProductColor_count(Integer productColor_count) {
        this.productColor_count = productColor_count;
    }

    public Integer getProductColor_id() {
        return productColor_id;
    }

    public void setProductColor_id(Integer productColor_id) {
        this.productColor_id = productColor_id;
    }

    public String getProductColor_name() {
        return productColor_name;
    }

    public void setProductColor_name(String productColor_name) {
        this.productColor_name = productColor_name;
    }

    public String getProductColor_img() {
        return productColor_img;
    }

    public void setProductColor_img(String productColor_img) {
        this.productColor_img = productColor_img;
    }

    public Integer getProductColor_price() {
        return productColor_price;
    }

    public void setProductColor_price(Integer productColor_price) {
        this.productColor_price = productColor_price;
    }

    public Integer getProductColor_versionprice() {
        return productColor_versionprice;
    }

    public void setProductColor_versionprice(Integer productColor_versionprice) {
        this.productColor_versionprice = productColor_versionprice;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }
}
