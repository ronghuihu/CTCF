package com.tedu.controller;

import com.tedu.pojo.Comment;
import com.tedu.pojo.Cultural;
import com.tedu.pojo.User;
import com.tedu.service.CityCultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
@Controller
public class CityCultureController {

    @Autowired
    private CityCultureService cityCultureService;

    @RequestMapping("/toCulturyInfo")
    public String toCulturalInfo(String cultralId, Model model){
        //获取cultural对象，供前台回显
        Cultural cultural = cityCultureService.findCulturalById(cultralId);
        model.addAttribute("cultural",cultural);

        //获取评论list
        List<Comment> comments = cityCultureService.findCommentList();
        model.addAttribute("comments",comments);

        return "/before/culturalInfo/culturalInfo";
    }

    @RequestMapping("/submitTextarea")
    public String toSubmitTextarea(String text,Model model, HttpSession session){
        User user = (User) session.getAttribute("loginUser");
        Comment comment = new Comment();
        comment.setCommentContent(text);
        comment.setUser(user);
        cityCultureService.addComment(comment);

        return "redirect:/before/culturalInfo/toCulturyInfo";
    }



}
