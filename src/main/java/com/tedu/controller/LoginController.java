package com.tedu.controller;

import com.tedu.pojo.User;
import com.tedu.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/5/30.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/tologin")
    public String tologin(HttpServletRequest request, HttpSession session){
        String path = request.getHeader("referer");
        int index = path.lastIndexOf("/");
        path = path.substring(index);
        session.setAttribute("path",path);
        return "\\before\\login\\login";
    }


    @RequestMapping("/login")
    public String login(String userName, String password, Model model, HttpSession session, HttpServletRequest request){
        if(StringUtils.isEmpty(userName)||StringUtils.isEmpty(password)){
            model.addAttribute("msg","用户名或密码不能为空");
            return "forward:/tologin";
        }


        //以Shiro的方式进行登陆操作

        //形成用户名和密码的令牌
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);

        //创建Subject对象      就是一个"user"
        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(token); //表示用户要进行登陆认证

            //获取真实的用户信息
            User user = (User) subject.getPrincipal();

            //获取session将用户信息保存到session域中
            subject.getSession().setAttribute("loginUser", user);

            String path = (String)session.getAttribute("path");
            session.removeAttribute("path");
            return "redirect:"+path;

        } catch (AuthenticationException e) {
            e.printStackTrace();  //目的如果一旦报异常可以通过控制台进行展现
            model.addAttribute("errorInfo", "用户名或密码错误");
            return "forward:/tologin";
        }

    }



    @RequestMapping("/logout")
    public String logout(HttpSession session, HttpServletRequest request){
        session.removeAttribute("loginUser");
        String path = request.getHeader("referer");
        int index = path.lastIndexOf("/");
        path = path.substring(index);
        return "redirect:"+path;
    }


}
