package com.tedu.mapper;

import com.tedu.pojo.Comment;
import com.tedu.pojo.Cultural;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public interface CityCultureMapper {
    /**
     * 查找所有文化信息
     * @return 所有文化信息的集合
     */
    public List<Cultural> findAll();

    /**
     * 新增文化元素
     * @param cultural
     */
    public void saveCultural(Cultural cultural);

    /**
     * 更新文化信息
     * @param cultural
     */
    public void updateCultural(Cultural cultural);

    /**
     * 删除文化信息
     * @param culturalId
     */
    public void deleteCultural(String culturalId);

    /**
     * 根据城市ID查找文化元素
     * @param cityId
     * @return 该城市下的所有文化元素集合
     */
    public List<Cultural> findCulturalByCityId(String cityId);

    /**
     * 根据文化ID查找文化信息
     * @param culturalId
     * @return 文化元素信息
     */
    public Cultural findCulturalById(String culturalId);


    /**
     *根据城市id查询对应的文化list
     * @param cityId
     * @return 文化对象集合
     */
    public List<Cultural> findCulturalListByCityId(String cityId);
}
