package com.tedu.controller;

import com.tedu.pojo.City;
import com.tedu.pojo.Cultural;
import com.tedu.pojo.Province;
import com.tedu.service.CityService;
import com.tedu.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * lsjdfldsjfl
 * Created by Administrator on 2017/5/30.
 */
@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private ProvinceService provinceService;

    @RequestMapping("areaculture/city/list")
    public String toList(Model model){
        List<City> cityList = cityService.findAll();
        model.addAttribute("cityList", cityList);
        return "areaculture/city/jCityList";
    }

    @RequestMapping("areaculture/city/tocreate")
    public String toCreate(Model model){
        List<Province> provinceList = provinceService.findAll();
        model.addAttribute("provinceList", provinceList);
        return "areaculture/city/jCityCreate";
    }

    @RequestMapping("areaculture/city/save")
    public String toSave(City city){
        cityService.saveCity(city);
        return "redirect:/areaculture/city/list";
    }

    @RequestMapping("areaculture/city/toupdate")
    public String toUpdate(String cityId, Model model){
        City city = cityService.findCityById(cityId);
        List<Province> provinceList = provinceService.findAll();
        model.addAttribute("city", city);
        model.addAttribute("provinceList", provinceList);
        return "areaculture/city/jCityUpdate";
    }

    @RequestMapping("areaculture/city/update")
    public String updateCity(City city){
        cityService.updateCity(city);
        return "redirect:/areaculture/city/list";
    }

    @RequestMapping("areaculture/city/delete")
    public String toDelete(String cityId){
        cityService.deleteCity(cityId);
        return "redirect:/areaculture/city/list";
    }

    @RequestMapping("areaculture/city/toview")
    public String toView(String cityId, Model model){
        City city = cityService.findCityById(cityId);
        model.addAttribute("city", city);
        return "/areaculture/city/jCityView";
    }

    @RequestMapping("/toCityCultureController")
    public String CityView(String cityName, Model model){
        List<Cultural> culturalList = cityService.findCityViewListByCityName(cityName);
        model.addAttribute("cityName",cityName);
        model.addAttribute("culturalList",culturalList);
        return "/before/modules/module";
    }
}
