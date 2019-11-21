package com.jk.commodity.model;

import java.io.Serializable;

/**
 * @ClassName Type
 * @Description
 * @Author
 * @Date 2019/11/20 14:43
 * @Version V1.0
 **/
public class Type implements Serializable {
    private static final long serialVersionUID = 7442733562971797209L;
    private Integer type_id;
    private String type_name;

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }
}
