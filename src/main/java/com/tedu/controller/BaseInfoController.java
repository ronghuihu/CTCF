package com.tedu.controller;

/**
 * Created by Administrator on 2017/6/3.
 */

import com.tedu.pojo.User;
import com.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 展示个人首页
 */
@Controller
@RequestMapping("/home/userinfo/")
public class BaseInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping("userinfo")
    public String userInfo(Model model){
        String userId = "49247b83-7448-445f-89e1-188c2e7ddfb1";
        User user = userService.findUserByUserId(userId);
        model.addAttribute("user",user);
        return "/home/userinfo/userinfo";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(Model model){
        String userId = "49247b83-7448-445f-89e1-188c2e7ddfb1";
        User user = userService.findUserByUserId(userId);
        model.addAttribute("user",user);
        return "/home/userinfo/userinfoUpdate";
    }

    @RequestMapping("update")
    public String toUpdate(User user){
        userService.updateUser(user);
        return "redirect:/home/userinfo/userinfo.action";
    }
}
