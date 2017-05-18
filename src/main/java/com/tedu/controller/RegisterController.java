package com.tedu.controller;

import com.tedu.pojo.User;
import com.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户注册controller
 * Created by Administrator on 2017/5/30.
 */
@Controller
public class RegisterController {
    @Autowired
    private UserService userService;
    @RequestMapping("/toregist")
    public String toLogin(){
        return "\\before\\regist\\regist";
    }

    @RequestMapping("/regist")
    public String regist(@Validated User user, BindingResult bindingResult, Model model) {
        System.out.println(user);
        if (bindingResult.hasErrors()) {
            String msg = bindingResult.getFieldError().getDefaultMessage();
            model.addAttribute("msg", msg);
            return "forward:/toregist";
        }
        if (!user.getPassword().equals(user.getPassword2())) {
            model.addAttribute("msg", "两次密码不一致");
            return "forward:/toregist";
        }
        String cardRex = "^[0-9]{17}[0-9|xX]{1}$";
        if(!user.getCardNo().matches(cardRex)){
            model.addAttribute("msg", "身份证号码格式不正确");
            return "forward:/toregist";
        }
        String phoneRex = "\\d{11}";
        if(!user.getTelephone().matches(phoneRex)){
            model.addAttribute("msg", "电话号码格式不正确");
            return "forward:/toregist";
        }
        String emailRex = "\\w+@\\w+(\\.\\w+)+";
        if(!user.getEmail().matches(emailRex)){
            model.addAttribute("msg", "邮箱格式不正确");
            return "forward:/toregist";
        }
        userService.addUser(user);

        return "注册成功！";
    }
}
