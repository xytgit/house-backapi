package com.team.house.housebackapi.util;

public class HouseCondition extends PageParameter {
    private String title;

    private Long minPrice;

    private Long maxPrice;

    private Integer streetId;

    private Integer districtId;

    private Integer typeId;

    private Integer minFloorage;

    private Integer maxFloorage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Long minPrice) {
        this.minPrice = minPrice;
    }

    public Long getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getMinFloorage() {
        return minFloorage;
    }

    public void setMinFloorage(Integer minFloorage) {
        this.minFloorage = minFloorage;
    }

    public Integer getMaxFloorage() {
        return maxFloorage;
    }

    public void setMaxFloorage(Integer maxFloorage) {
        this.maxFloorage = maxFloorage;
    }
}
