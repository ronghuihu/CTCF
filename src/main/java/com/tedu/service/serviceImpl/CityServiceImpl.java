package com.tedu.service.serviceImpl;

import com.tedu.mapper.CityCultureMapper;
import com.tedu.mapper.CityMapper;
import com.tedu.pojo.City;
import com.tedu.pojo.Cultural;
import com.tedu.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/5/30.
 */
@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private CityCultureMapper cityCultureMapper;

    @Override
    public List<Cultural> findCityViewListByCityName(String cityName) {
        String cityId = cityMapper.findCityIdByCityName(cityName);
        return cityCultureMapper.findCulturalListByCityId(cityId);
    }

    @Override
    public List<City> findAll() {
        return cityMapper.findAll();
    }

    @Override
    public City findCityById(String cityId) {
        return cityMapper.findCityById(cityId);
    }

    @Override
    public void saveCity(City city) {
        String cityId = UUID.randomUUID().toString();
        city.setCityId(cityId);
        cityMapper.saveCity(city);
    }

    @Override
    public void updateCity(City city) {
        cityMapper.updateCity(city);
    }

    @Override
    public void deleteCity(String cityId) {
        cityMapper.deleteCity(cityId);
    }
}
