package com.jk.commodity.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Commodity
 * @Description
 * @Author
 * @Date 2019/11/19 19:26
 * @Version V1.0
 **/
public class Commodity implements Serializable {
    private static final long serialVersionUID = 3710566741481066951L;

    private Integer productId;

    private String productName;

    private String productIntroduction;

    private Integer productState;

    private Integer commodityPrice;

    private Integer productVersionid;

    private String productVersionname;

    private Integer productColorId;

    private String productColorName;

    private Integer productCpuId;

    private String productCpuname;

    private Double productWeight;

    private Integer productOriginId;

    private String productOriginname;

    private String homeScreenSize;

    private Integer whetherTheHot;

    private String numberOfCameras;

    private String operatingSystem;

    private String operatingSystemName;

    private String hotspot;

    private String gamePerformance;

    private String aspectRatio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date upAndDownTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date timeToMarket;

    private String theNetModel;

    private String resolutionRatio;

    private String theStandbyTime;

    private String commoditySales;

    private String charger;

    private String wirelessCharging;

    private String packing;

    private Integer productBrand;

    private String productBrandname;

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

    public String getProductColorName() {
        return productColorName;
    }

    public void setProductColorName(String productColorName) {
        this.productColorName = productColorName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductIntroduction() {
        return productIntroduction;
    }

    public void setProductIntroduction(String productIntroduction) {
        this.productIntroduction = productIntroduction;
    }

    public Integer getProductState() {
        return productState;
    }

    public void setProductState(Integer productState) {
        this.productState = productState;
    }

    public Integer getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Integer commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getProductVersionid() {
        return productVersionid;
    }

    public void setProductVersionid(Integer productVersionid) {
        this.productVersionid = productVersionid;
    }

    public String getProductVersionname() {
        return productVersionname;
    }

    public void setProductVersionname(String productVersionname) {
        this.productVersionname = productVersionname;
    }

    public Integer getProductColorId() {
        return productColorId;
    }

    public void setProductColorId(Integer productColorId) {
        this.productColorId = productColorId;
    }

    public Integer getProductCpuId() {
        return productCpuId;
    }

    public void setProductCpuId(Integer productCpuId) {
        this.productCpuId = productCpuId;
    }

    public String getProductCpuname() {
        return productCpuname;
    }

    public void setProductCpuname(String productCpuname) {
        this.productCpuname = productCpuname;
    }

    public Double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(Double productWeight) {
        this.productWeight = productWeight;
    }

    public Integer getProductOriginId() {
        return productOriginId;
    }

    public void setProductOriginId(Integer productOriginId) {
        this.productOriginId = productOriginId;
    }

    public String getProductOriginname() {
        return productOriginname;
    }

    public void setProductOriginname(String productOriginname) {
        this.productOriginname = productOriginname;
    }

    public String getHomeScreenSize() {
        return homeScreenSize;
    }

    public void setHomeScreenSize(String homeScreenSize) {
        this.homeScreenSize = homeScreenSize;
    }

    public Integer getWhetherTheHot() {
        return whetherTheHot;
    }

    public void setWhetherTheHot(Integer whetherTheHot) {
        this.whetherTheHot = whetherTheHot;
    }

    public String getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(String numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getHotspot() {
        return hotspot;
    }

    public void setHotspot(String hotspot) {
        this.hotspot = hotspot;
    }

    public String getGamePerformance() {
        return gamePerformance;
    }

    public void setGamePerformance(String gamePerformance) {
        this.gamePerformance = gamePerformance;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public Date getUpAndDownTime() {
        return upAndDownTime;
    }

    public void setUpAndDownTime(Date upAndDownTime) {
        this.upAndDownTime = upAndDownTime;
    }

    public Date getTimeToMarket() {
        return timeToMarket;
    }

    public void setTimeToMarket(Date timeToMarket) {
        this.timeToMarket = timeToMarket;
    }

    public String getTheNetModel() {
        return theNetModel;
    }

    public void setTheNetModel(String theNetModel) {
        this.theNetModel = theNetModel;
    }

    public String getResolutionRatio() {
        return resolutionRatio;
    }

    public void setResolutionRatio(String resolutionRatio) {
        this.resolutionRatio = resolutionRatio;
    }

    public String getTheStandbyTime() {
        return theStandbyTime;
    }

    public void setTheStandbyTime(String theStandbyTime) {
        this.theStandbyTime = theStandbyTime;
    }

    public String getCommoditySales() {
        return commoditySales;
    }

    public void setCommoditySales(String commoditySales) {
        this.commoditySales = commoditySales;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getWirelessCharging() {
        return wirelessCharging;
    }

    public void setWirelessCharging(String wirelessCharging) {
        this.wirelessCharging = wirelessCharging;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public Integer getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(Integer productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductBrandname() {
        return productBrandname;
    }

    public void setProductBrandname(String productBrandname) {
        this.productBrandname = productBrandname;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productIntroduction='" + productIntroduction + '\'' +
                ", productState=" + productState +
                ", commodityPrice=" + commodityPrice +
                ", productVersionid=" + productVersionid +
                ", productVersionname='" + productVersionname + '\'' +
                ", productColorId=" + productColorId +
                ", productCpuId=" + productCpuId +
                ", productCpuname='" + productCpuname + '\'' +
                ", productWeight=" + productWeight +
                ", productOriginId=" + productOriginId +
                ", productOriginname='" + productOriginname + '\'' +
                ", homeScreenSize='" + homeScreenSize + '\'' +
                ", whetherTheHot=" + whetherTheHot +
                ", numberOfCameras='" + numberOfCameras + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", hotspot='" + hotspot + '\'' +
                ", gamePerformance='" + gamePerformance + '\'' +
                ", aspectRatio='" + aspectRatio + '\'' +
                ", upAndDownTime=" + upAndDownTime +
                ", timeToMarket=" + timeToMarket +
                ", theNetModel='" + theNetModel + '\'' +
                ", resolutionRatio='" + resolutionRatio + '\'' +
                ", theStandbyTime='" + theStandbyTime + '\'' +
                ", commoditySales='" + commoditySales + '\'' +
                ", charger='" + charger + '\'' +
                ", wirelessCharging='" + wirelessCharging + '\'' +
                ", packing='" + packing + '\'' +
                ", productBrand=" + productBrand +
                ", productBrandname='" + productBrandname + '\'' +
                '}';
    }
}
