package com.tedu.pojo;

import java.util.List;

/**
 * 城市
 * Created by Administrator on 2017/6/2.
 */
public class City {
    private String cityId;
    private String cityName;
    private Province province; //所在省份
    private String remark; //省份说明

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
