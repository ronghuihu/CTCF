package com.tedu.pojo;

import org.springframework.stereotype.Component;

/**
 * 留言墙
 * Created by Administrator on 2017/6/2.
 */
@Component
public class Wall extends BaseEntity{
    private String wallId;
    private String wallContent; //留言墙内容
    private User user; //用户信息
    private Integer state;

    public String getWallId() {
        return wallId;
    }

    public void setWallId(String wallId) {
        this.wallId = wallId;
    }

    public String getWallContent() {
        return wallContent;
    }

    public void setWallContent(String wallContent) {
        this.wallContent = wallContent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "wallId='" + wallId + '\'' +
                ", wallContent='" + wallContent + '\'' +
                ", user=" + user +
                ", state=" + state +
                '}';
    }
}
