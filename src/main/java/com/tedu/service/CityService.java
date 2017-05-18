package com.tedu.service;

import com.tedu.pojo.City;
import com.tedu.pojo.Cultural;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public interface CityService {
    List<Cultural> findCityViewListByCityName(String cityName);

    public List<City> findAll();

    public City findCityById(String cityId);

    public void saveCity(City city);

    public void updateCity(City city);

    public void deleteCity(String cityId);
}
