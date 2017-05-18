package com.tedu.service.serviceImpl;

import com.tedu.mapper.ProvinceMapper;
import com.tedu.pojo.Province;
import com.tedu.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/3.
 */
@Service
public class ProvinceServiceImpl implements ProvinceService{
    @Autowired
    private ProvinceMapper provinceMapper;
    @Override
    public List<Province> findAll() {
        return provinceMapper.findAll();
    }

    @Override
    public void saveProvince(Province province) {
        String provinceId = UUID.randomUUID().toString();
        province.setProvinceId(provinceId);
        provinceMapper.saveProvince(province);
    }

    @Override
    public void updateProvince(Province province) {
        provinceMapper.updateProvince(province);
    }

    @Override
    public void deleteProvince(String provinceId) {
        provinceMapper.deleteProvince(provinceId);
    }

    @Override
    public Province findProvinceById(String provinceId) {
        return provinceMapper.findProvinceById(provinceId);
    }
}
