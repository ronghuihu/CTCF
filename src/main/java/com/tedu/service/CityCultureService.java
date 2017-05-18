package com.tedu.service;

import com.tedu.pojo.Comment;
import com.tedu.pojo.Cultural;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public interface CityCultureService {
    public List<Cultural> findAll();
    public void saveCultural(Cultural cultural);
    public void updateCultural(Cultural cultural);
    public void deleteCultural(String culturalId);
    public List<Cultural> findCulturalByCityId(String cityId);
    public Cultural findCulturalById(String culturalId);
    public List<Comment> findCommentList();
    public void addComment(Comment comment);
}
