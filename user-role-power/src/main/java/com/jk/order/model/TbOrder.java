package com.jk.order.model;


import java.io.Serializable;

public class TbOrder implements Serializable {


  private static final long serialVersionUID = -4189577579661158753L;

  private String orderid;
  private String payment;
  private String paytype;
  private String status;
  private String createtime;
  private String userid;
  private String recarea;
  private String recphone;
  private String receiver;
  private String username;

  private String mintime;
  private String maxtime;


  public String getOrderid() {
    return orderid;
  }

  public void setOrderid(String orderid) {
    this.orderid = orderid;
  }

  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }

  public String getPaytype() {
    return paytype;
  }

  public void setPaytype(String paytype) {
    this.paytype = paytype;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCreatetime() {
    return createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }

  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public String getRecarea() {
    return recarea;
  }

  public void setRecarea(String recarea) {
    this.recarea = recarea;
  }

  public String getRecphone() {
    return recphone;
  }

  public void setRecphone(String recphone) {
    this.recphone = recphone;
  }

  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getMintime() {
    return mintime;
  }

  public void setMintime(String mintime) {
    this.mintime = mintime;
  }

  public String getMaxtime() {
    return maxtime;
  }

  public void setMaxtime(String maxtime) {
    this.maxtime = maxtime;
  }
}
