package com.jk.order.model;


public class TOrderinfo {

  private long orderinfoid;
  private long orderinfooid;
  private long orderinfopid;
  private double orderinfocprice;
  private long number;
  private double allprice;

  private String productName;

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public long getOrderinfoid() {
    return orderinfoid;
  }

  public void setOrderinfoid(long orderinfoid) {
    this.orderinfoid = orderinfoid;
  }


  public long getOrderinfooid() {
    return orderinfooid;
  }

  public void setOrderinfooid(long orderinfooid) {
    this.orderinfooid = orderinfooid;
  }


  public long getOrderinfopid() {
    return orderinfopid;
  }

  public void setOrderinfopid(long orderinfopid) {
    this.orderinfopid = orderinfopid;
  }


  public double getOrderinfocprice() {
    return orderinfocprice;
  }

  public void setOrderinfocprice(double orderinfocprice) {
    this.orderinfocprice = orderinfocprice;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public double getAllprice() {
    return allprice;
  }

  public void setAllprice(double allprice) {
    this.allprice = allprice;
  }

}
