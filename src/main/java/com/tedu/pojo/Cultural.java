package com.tedu.pojo;

/**
 * 文化元素
 * Created by Administrator on 2017/6/2.
 */
public class Cultural {
    private String culturalId;
    private City city;
    private String culturalName;
    private String imgUrl; //图片路径
    private String remark1; //文化描述
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;

    public String getCulturalId() {
        return culturalId;
    }

    public void setCulturalId(String culturalId) {
        this.culturalId = culturalId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getCulturalName() {
        return culturalName;
    }

    public void setCulturalName(String culturalName) {
        this.culturalName = culturalName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4;
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5;
    }

    @Override
    public String toString() {
        return "Cultural{" +
                "culturalId='" + culturalId + '\'' +
                ", city=" + city +
                ", culturalName='" + culturalName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", remark1='" + remark1 + '\'' +
                ", remark2='" + remark2 + '\'' +
                ", remark3='" + remark3 + '\'' +
                ", remark4='" + remark4 + '\'' +
                ", remark5='" + remark5 + '\'' +
                '}';
    }
}
