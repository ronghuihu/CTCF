package com.tedu.service;

import com.tedu.pojo.Country;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public interface CountryService {
    public List<Country> findAll();
    public void saveCountry(Country country);
    public void updateCountry(Country country);
    public void deleteCountry(String countryId);
    public Country findCountryById(String countryId);
}
