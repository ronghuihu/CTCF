package com.tedu.pojo;

/**
 * 国家
 * Created by Administrator on 2017/6/2.
 */
public class Country {
    private String countryId;
    private String countryName;
    private String remark; //国家描述

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId='" + countryId + '\'' +
                ", countryName='" + countryName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
