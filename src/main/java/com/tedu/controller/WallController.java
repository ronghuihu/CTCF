package com.tedu.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tedu.pojo.User;
import com.tedu.pojo.Wall;
import com.tedu.service.WallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/6/3.
 */
@Controller
public class WallController {
    @Autowired
    private WallService wallService;
    @Autowired
    private Wall wall;

    @RequestMapping("/toWall")
    public String toWall(Model model) throws JsonProcessingException {
        List<Wall> wallContentList = wallService.findAll();
        String wallContent= new ObjectMapper().writeValueAsString(wallContentList).toString();
        model.addAttribute("wallContent",wallContent);
        return "\\before\\messageBoard\\messageBoard";
    }

    @RequestMapping("/saveMessage")
    public String saveMessage(String wallContent, HttpSession session){
        User user = (User)session.getAttribute("loginUser");
        wall.setUser(user);
        wall.setWallContent(wallContent);
        wallService.saveWallContent(wall);
        return "";
    }

    @RequestMapping("/findUserMessage")
    public String findUserMessage(HttpSession session,Model model) throws JsonProcessingException {
        User user = (User)session.getAttribute("loginUser");
        List<Wall> wallContentList = wallService.findMessageByuser(user);
        String wallContent= new ObjectMapper().writeValueAsString(wallContentList).toString();
        model.addAttribute("wallContent",wallContent);
        return "\\before\\messageBoard\\myBoard";
    }

    @RequestMapping("/closeMessage")
    public void closeMessage(String wallId){
        wall.setWallId(wallId);
        wallService.updateMessageByWallId(wall);
    }

}
