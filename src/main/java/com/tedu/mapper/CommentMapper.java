package com.tedu.mapper;

import com.tedu.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public interface CommentMapper {

    /**
     * 查询评论
     * @return 评论集合
     */
    public List<Comment> findCommentList();

    /**
     * 添加评论
     * @param comment
     */
    public void addComment(Comment comment);
}
