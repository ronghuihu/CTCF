package com.tedu.service.serviceImpl;

import com.tedu.mapper.WallMapper;
import com.tedu.pojo.User;
import com.tedu.pojo.Wall;
import com.tedu.service.WallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/3.
 */
@Service
public class WallServiceImpl implements WallService {
    @Autowired
    private WallMapper wallMapper;
    @Override
    public List<Wall> findAll() {
        return wallMapper.findAll();
    }

    @Override
    public void updateMessageByWallId(Wall wall) {
        wall.setUpdateTime(new Date());
        wall.setState(0);
        wallMapper.updateMessage(wall);
    }

    @Override
    public List<Wall> findMessageByuser(User user) {
        return wallMapper.findMessageByuser(user);
    }

    @Override
    public void saveWallContent(Wall wall) {
        wall.setWallId(UUID.randomUUID().toString());
        wall.setState(1);
        wall.setCreateTime(new Date());
        System.out.println(wall);
        wallMapper.saveWallContent(wall);
    }
}
