package com.tedu.pojo;

/**
 * 评论类
 * Created by Administrator on 2017/6/2.
 */
public class Comment extends BaseEntity{
    private String commentID;
    private User user; //用户信息
    private String commentContent; //评论内容
    private Integer state;

    public String getCommentID() {
        return commentID;
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
