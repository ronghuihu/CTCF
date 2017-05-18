package com.tedu.pojo;

/**
 * 省份
 * Created by Administrator on 2017/6/2.
 */
public class Province {
    private String provinceId;
    private String provinceName;
    private String remark; //省份描述

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Province{" +
                "provinceId='" + provinceId + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
