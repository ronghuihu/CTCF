package com.tedu.service.serviceImpl;

import com.tedu.mapper.CityCultureMapper;
import com.tedu.mapper.CommentMapper;
import com.tedu.pojo.Comment;
import com.tedu.pojo.Cultural;
import com.tedu.service.CityCultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/5/30.
 */
@Service
public class CityCultureServiceImpl implements CityCultureService{
    @Autowired
    private CityCultureMapper cityCultureMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Cultural> findAll() {
        return cityCultureMapper.findAll();
    }

    @Override
    public void saveCultural(Cultural cultural) {
        cityCultureMapper.saveCultural(cultural);
    }

    @Override
    public void updateCultural(Cultural cultural) {
        cityCultureMapper.updateCultural(cultural);
    }

    @Override
    public void deleteCultural(String culturalId) {
        cityCultureMapper.deleteCultural(culturalId);
    }

    @Override
    public List<Cultural> findCulturalByCityId(String cityId) {
        return cityCultureMapper.findCulturalByCityId(cityId);
    }

    @Override
    public Cultural findCulturalById(String culturalId) {
        return cityCultureMapper.findCulturalById(culturalId);
    }


    @Override
    public List<Comment> findCommentList() {
        return commentMapper.findCommentList();
    }

    @Override
    public void addComment(Comment comment) {
        String commentId = UUID.randomUUID().toString();
        comment.setCommentID(commentId);
        comment.setCreateTime(new Date());
        commentMapper.addComment(comment);
    }
}
