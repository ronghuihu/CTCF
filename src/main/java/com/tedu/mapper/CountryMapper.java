package com.tedu.mapper;

import com.tedu.pojo.Country;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public interface CountryMapper {
    /**
     * 查找所有国家
     * @return 国家信息的集合
     */
    public List<Country> findAll();

    /**
     * 新增国家
     * @param 国家信息
     */
    public void saveCountry(Country country);

    /**
     * 更新国家信息
     * @param 国家信息
     */
    public void updateCountry(Country country);

    /**
     * 删除国家
     * @param 国家ID
     */
    public void deleteCountry(String countryId);

    /**
     * 根据ＩＤ查找国家信息
     * @param 国家Id
     * @return　国家信息
     */
    public Country findCountryById(String countryId);
}
