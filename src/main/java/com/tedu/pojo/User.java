package com.tedu.pojo;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 用户信息类
 * Created by Administrator on 2017/6/2.
 */
public class User extends BaseEntity{
    private String userId;
    @NotEmpty(message = "用户名不能为空")
    private String userName;
    @NotEmpty(message = "密码不能为空")
    private String password;
    @NotEmpty(message = "确认密码不能为空")
    private String password2;
    @NotEmpty(message = "真实姓名不能为空")
    private String realName; //真实姓名
    @NotEmpty(message = "身份证号码不能为空")
    private String cardNo;   //身份证
    @NotEmpty(message = "电话号码不能为空")
    private String telephone;
    @NotEmpty(message = "邮箱不能为空")
    private String email;
    private Integer state; //1启用0停用

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}
