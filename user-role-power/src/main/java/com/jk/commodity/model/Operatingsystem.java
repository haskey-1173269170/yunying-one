package com.jk.commodity.model;

import java.io.Serializable;

/**
 * @ClassName Operatingsystem
 * @Description
 * @Author
 * @Date 2019/11/20 14:25
 * @Version V1.0
 **/
public class Operatingsystem implements Serializable {
    private static final long serialVersionUID = 3837594983066879850L;
    private Integer operatingSystem_id;
    private String operatingSystem_name;

    public Integer getOperatingSystem_id() {
        return operatingSystem_id;
    }

    public void setOperatingSystem_id(Integer operatingSystem_id) {
        this.operatingSystem_id = operatingSystem_id;
    }

    public String getOperatingSystem_name() {
        return operatingSystem_name;
    }

    public void setOperatingSystem_name(String operatingSystem_name) {
        this.operatingSystem_name = operatingSystem_name;
    }
}
