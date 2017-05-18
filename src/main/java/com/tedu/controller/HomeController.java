package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/6/3.
 */
@Controller
public class HomeController {

    //转向个人首页
    @RequestMapping("/page")
    public String toPage(){
        return "/home/fmain";
    }

    //转向tilte标题栏页面
    @RequestMapping("/title")
    public String title(){
        return "/home/title";
    }

    //转向map
    @RequestMapping("/map")
    public String tomap(){
        return "/before/map/map";
    }

    //转向浙江
    @RequestMapping("/zhejiang")
    public String toProvince(){
        return "/before/map/zhejiang";
    }



    @RequestMapping("/{moduleName}/Left")
    public String sysadminLeft(@PathVariable String moduleName){
        return "/"+moduleName+"/left";
    }

    @RequestMapping("/{moduleName}/Main")
    public String sysadminMain(@PathVariable String moduleName){
        return "/"+moduleName+"/main";
    }

    /**
     * 跳转到map.jsp
     */
    @RequestMapping("tomap")
    public String toMap(){
            return "/before/map/map";
    }
}
