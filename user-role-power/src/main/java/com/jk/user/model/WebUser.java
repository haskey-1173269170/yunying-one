package com.jk.user.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 11:54
 * @Version 1.0
 **/
public class WebUser implements Serializable {
    private static final long serialVersionUID = 1312645660085085448L;
    private Integer userid;
    private String userName;
    private String name;
    private String userPwd;
    private String userImg;
    private Integer userSex;
    private Integer age;
    private Integer areaId;
    private Integer shenId;
    private String shengname;
    private Integer shiId;
    private String shiname;
    private String quname;
    private Integer userArea;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    private String area;

    private String rname;

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getShenId() {
        return shenId;
    }

    public void setShenId(Integer shenId) {
        this.shenId = shenId;
    }

    public Integer getShiId() {
        return shiId;
    }

    public void setShiId(Integer shiId) {
        this.shiId = shiId;
    }

    public String getShengname() {
        return shengname;
    }

    public void setShengname(String shengname) {
        this.shengname = shengname;
    }

    public String getShiname() {
        return shiname;
    }

    public void setShiname(String shiname) {
        this.shiname = shiname;
    }

    public String getQuname() {
        return quname;
    }

    public void setQuname(String quname) {
        this.quname = quname;
    }

    public Integer getUserArea() {
        return userArea;
    }

    public void setUserArea(Integer userArea) {
        this.userArea = userArea;
    }
}
