package com.tedu.service;

import com.tedu.pojo.User;
import com.tedu.pojo.Wall;

import java.util.List;

/**
 * Created by Administrator on 2017/6/3.
 */
public interface WallService {
    public void saveWallContent(Wall wall);

    public List<Wall> findAll();

    public void updateMessageByWallId(Wall wall);

    public List<Wall> findMessageByuser(User user);
}
