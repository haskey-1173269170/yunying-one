package com.jk.adv.model;

import java.io.Serializable;

/**
 * @version 1.0
 * @ClassName Adv
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/21 11:44
 **/
public class Adv implements Serializable {


    private static final long serialVersionUID = -4608671991831813646L;

    private String advid;
    private String advname;
    private String advimg;
    private String advstatus;
    private String advdate;
    private String advinfo;
    private String advurl;

    private String mindate;
    private String maxdate;

    public String getMindate() {
        return mindate;
    }

    public void setMindate(String mindate) {
        this.mindate = mindate;
    }

    public String getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(String maxdate) {
        this.maxdate = maxdate;
    }

    public String getAdvid() {
        return advid;
    }

    public void setAdvid(String advid) {
        this.advid = advid;
    }

    public String getAdvname() {
        return advname;
    }

    public void setAdvname(String advname) {
        this.advname = advname;
    }

    public String getAdvimg() {
        return advimg;
    }

    public void setAdvimg(String advimg) {
        this.advimg = advimg;
    }

    public String getAdvstatus() {
        return advstatus;
    }

    public void setAdvstatus(String advstatus) {
        this.advstatus = advstatus;
    }

    public String getAdvdate() {
        return advdate;
    }

    public void setAdvdate(String advdate) {
        this.advdate = advdate;
    }

    public String getAdvinfo() {
        return advinfo;
    }

    public void setAdvinfo(String advinfo) {
        this.advinfo = advinfo;
    }

    public String getAdvurl() {
        return advurl;
    }

    public void setAdvurl(String advurl) {
        this.advurl = advurl;
    }
}
