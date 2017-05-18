package com.tedu.mapper;

import com.tedu.pojo.Province;

import java.util.List;

/**
 * Created by Administrator on 2017/6/3.
 */
public interface ProvinceMapper {
    /**
     * 查找所有省份
     * @return 所有省份的集合
     */
    public List<Province> findAll();

    /**
     * 新增省
     * @param 省的信息
     */
    public void saveProvince(Province province);

    /**
     * 修改省的信息
     * @param 省份信息
     */
    public void updateProvince(Province province);

    /**
     * 删除省份
     * @param 省Id
     */
    public void deleteProvince(String provinceId);

    /**
     * 根据省ID查找省份信息
     * @param 省Id
     * @return 省份信息
     */
    public Province findProvinceById(String provinceId);
}
