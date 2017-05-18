package com.tedu.service.serviceImpl;

import com.tedu.mapper.CountryMapper;
import com.tedu.pojo.Country;
import com.tedu.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<Country> findAll() {
        return countryMapper.findAll();
    }

    @Override
    public void saveCountry(Country country) {
        countryMapper.saveCountry(country);
    }

    @Override
    public void updateCountry(Country country) {
        countryMapper.updateCountry(country);
    }

    @Override
    public void deleteCountry(String countryId) {
        countryMapper.deleteCountry(countryId);
    }

    @Override
    public Country findCountryById(String countryId) {
        return countryMapper.findCountryById(countryId);
    }
}
