package com.tedu.mapper;

import com.tedu.pojo.City;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public interface CityMapper {

    /**
     * 根据城市名查询城市id
     * @param cityName
     * @return 城市id
     */
    public String findCityIdByCityName(String cityName);

    public List<City> findAll();

    public City findCityById(String cityId);

    public void saveCity(City city);

    public void updateCity(City city);

    public void deleteCity(String cityId);
}
