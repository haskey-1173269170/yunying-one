package com.jk.commodity.model;

import java.io.Serializable;

/**
 * @ClassName CommodityColor
 * @Description
 * @Author
 * @Date 2019/11/21 10:30
 * @Version V1.0
 **/
public class CommodityColor implements Serializable {
    private static final long serialVersionUID = -5370676905266537056L;
    private Integer id;
    private Integer commodityid;
    private Integer productColorid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getProductColorid() {
        return productColorid;
    }

    public void setProductColorid(Integer productColorid) {
        this.productColorid = productColorid;
    }
}
