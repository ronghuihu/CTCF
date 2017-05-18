package com.tedu.service;

import com.tedu.pojo.Province;

import java.util.List;

/**
 * Created by Administrator on 2017/6/3.
 */
public interface ProvinceService {
    public List<Province> findAll();
    public void saveProvince(Province province);
    public void updateProvince(Province province);
    public void deleteProvince(String provinceId);
    public Province findProvinceById(String provinceId);
}
