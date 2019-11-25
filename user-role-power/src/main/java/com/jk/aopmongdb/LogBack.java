package com.jk.aopmongdb;

import org.aspectj.lang.Signature;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @ClassName logBack
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/22 20:02
 * @Version 1.0
 **/
@Document
public class LogBack {
    @Id
    private String id;
    private String method;
    private String parmes;
    private String rvalue;
    private String exception;
    private String thisDate;

    public String getThisDate() {
        return thisDate;
    }

    public void setThisDate(String thisDate) {
        this.thisDate = thisDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParmes() {
        return parmes;
    }

    public void setParmes(String parmes) {
        this.parmes = parmes;
    }

    public String getRvalue() {
        return rvalue;
    }

    public void setRvalue(String rvalue) {
        this.rvalue = rvalue;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
