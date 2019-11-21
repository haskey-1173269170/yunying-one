package com.jk.commodity.model;

import java.io.Serializable;

/**
 * @ClassName VersionColor
 * @Description
 * @Author
 * @Date 2019/11/20 21:36
 * @Version V1.0
 **/
public class VersionColor implements Serializable {
    private static final long serialVersionUID = 554405758741848050L;
    private Integer id;
    private Integer productVersionid;
    private Integer productColorid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductVersionid() {
        return productVersionid;
    }

    public void setProductVersionid(Integer productVersionid) {
        this.productVersionid = productVersionid;
    }

    public Integer getProductColorid() {
        return productColorid;
    }

    public void setProductColorid(Integer productColorid) {
        this.productColorid = productColorid;
    }
}
