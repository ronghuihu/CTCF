package com.tedu.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tedu.pojo.Role;
import com.tedu.pojo.User;
import com.tedu.service.RoleService;
import com.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * Created by LYJ on 2017/3/19.
 */
@Controller
@RequestMapping("/sysadmin/user/")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    //用户列表
    @RequestMapping("list")
    public String toList(Model model){
        model.addAttribute("userList",userService.findAll());
        return "/sysadmin/user/jUserList";
    }

    //停用用户
    @RequestMapping("stop")
    public String toStop(@RequestParam(value="userId",required = true) String[] userIds){
        Integer state = 0;
        userService.changeState(state,userIds);
        return "redirect:/sysadmin/user/list.action";
    }

    //启用用户
    @RequestMapping("start")
    public String toStart(@RequestParam(value="userId",required = true) String[] userIds){
        Integer state = 1;
        userService.changeState(state,userIds);
        return "redirect:/sysadmin/user/list.action";
    }

    //删除用户
    @RequestMapping("delete")
    public String delete(@RequestParam(required = true) String userId){
        userService.deleteUserByUserId(userId);
        return "redirect:/sysadmin/user/list.action";
    }

    //为用户新增准备数据
    @RequestMapping("toCreate")
    public String toCreate(){
        return "sysadmin/user/jUserCreate";
    }

    //新增用户
    @RequestMapping("save")
    public String create(User user){
        userService.saveUser(user);
        return "redirect:/sysadmin/user/list.action";
    }

    //为用户更新准备数据
    @RequestMapping("toUpdate")
    public String toUpdate(@RequestParam(required = true) String userId,Model model){
        model.addAttribute("user",userService.findUserByUserId(userId));
        return "sysadmin/user/jUserUpdate";
    }

    //更新用户
    @RequestMapping("update")
    public String update(User user){
        userService.updateUser(user);
        return "redirect:/sysadmin/user/list.action";
    }

    //查看用户
    @RequestMapping("view")
    public String toView(@RequestParam(required = true) String userId,Model model){
        model.addAttribute("user",userService.findUserByUserId(userId));
        return "/sysadmin/user/jUserView";
    }

    //查看用户角色
    @RequestMapping("userRole")
    public String userRole(@RequestParam(required = true) String userId,Model model) throws JsonProcessingException{
        List<String> userRoleList = userService.findRoleIdByUserId(userId);
        List<Role> roleList = roleService.findAll();
        //将用户拥有的角色设置为默认选中
        for(Role role:roleList){
            if(userRoleList.contains(role.getRoleId())){
                role.setChecked(true);
            }
        }
        String zTreeJSON = new ObjectMapper().writeValueAsString(roleList);

        model.addAttribute("roleList",roleList);
        model.addAttribute("zTreeJSON",zTreeJSON);
        model.addAttribute("userId",userId);
        return "/sysadmin/user/jUserRole";
    }

    //保存用户拥有角色
    @RequestMapping("saveUserRole")
    public String saveUserRole(@RequestParam(required = true) String[] roleIds,String userId){
        userService.saveUserRole(roleIds,userId);
        return "redirect:/sysadmin/user/userRole.action";
    }
}

