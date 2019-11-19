package com.jk.role.model;

import java.io.Serializable;

/**
 * @ClassName Role
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 11:54
 * @Version 1.0
 **/

public class Role implements Serializable {
    private static final long serialVersionUID = -3945541643498129872L;
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
