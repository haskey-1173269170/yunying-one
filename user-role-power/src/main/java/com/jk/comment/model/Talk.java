package com.jk.comment.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Talk implements Serializable {


    private static final long serialVersionUID = -6580170885266930033L;

    private Integer talkid;
    private String talkinfo;
    private Integer talkuserid;
    private Integer talkproductid;
    private Integer talktype;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date talktime;

    private String startDate;

    private String endDate;


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getTalkid() {
        return talkid;
    }

    public void setTalkid(Integer talkid) {
        this.talkid = talkid;
    }

    public String getTalkinfo() {
        return talkinfo;
    }

    public void setTalkinfo(String talkinfo) {
        this.talkinfo = talkinfo;
    }

    public Integer getTalkuserid() {
        return talkuserid;
    }

    public void setTalkuserid(Integer talkuserid) {
        this.talkuserid = talkuserid;
    }

    public Integer getTalkproductid() {
        return talkproductid;
    }

    public void setTalkproductid(Integer talkproductid) {
        this.talkproductid = talkproductid;
    }

    public Integer getTalktype() {
        return talktype;
    }

    public void setTalktype(Integer talktype) {
        this.talktype = talktype;
    }

    public Date getTalktime() {
        return talktime;
    }

    public void setTalktime(Date talktime) {
        this.talktime = talktime;
    }
}
