package com.tedu.controller;

import com.tedu.pojo.Province;
import com.tedu.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/6/3.
 */
@Controller
@RequestMapping("areaculture/province/")
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;

    @RequestMapping("list")
    public String toList(Model model){
        List<Province> provinceList = provinceService.findAll();
        model.addAttribute("provinceList", provinceList);
        return "areaculture/province/jProvinceList";
    }

    @RequestMapping("tocreate")
    public String toCreate(Model model){
        return "areaculture/province/jProvinceCreate";
    }

    @RequestMapping("save")
    public String toSave(Province province){
        provinceService.saveProvince(province);
        return "redirect:/areaculture/province/list";
    }

    @RequestMapping("delete")
    public String toDelete(String provinceId){
        provinceService.deleteProvince(provinceId);
        return "redirect:/areaculture/province/list";
    }

    @RequestMapping("toupdate")
    public String toUpdate(String provinceId, Model model){
        Province province = provinceService.findProvinceById(provinceId);
        model.addAttribute("province", province);
        return "/areaculture/province/jProvinceUpdate";
    }

    @RequestMapping("update")
    public String updateProvince(Province province){
        provinceService.updateProvince(province);
        return "redirect:/areaculture/province/list";
    }

    @RequestMapping("toview")
    public String toView(String provinceId, Model model){
        Province province = provinceService.findProvinceById(provinceId);
        model.addAttribute("province", province);
        return "/areaculture/province/jProvinceView";
    }
}
