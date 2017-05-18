package com.tedu.controller;

import com.tedu.pojo.Module;
import com.tedu.service.ModuleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
@Controller
@RequestMapping("/sysadmin/module")
public class ModuleController {

    @Resource
    private ModuleService moduleService;

    @RequestMapping("/list")
    public String toList(Model model){
        List<Module> modelList = moduleService.findAll();
        model.addAttribute("moduleList" ,modelList);
        return "/sysadmin/module/jModuleList";
    }

    @RequestMapping("/delete")
    public String toList(@RequestParam(value = "moduleId", required = true) String[] moduleIds){
        moduleService.deleteModules(moduleIds);
        return "redirect:/sysadmin/module/list";
    }

    @RequestMapping("/tocreate")
    public String tocreate(Model model){
        List<Module> moduleList = moduleService.findAll();
        model.addAttribute("moduleList", moduleList);
        return "/sysadmin/module/jModuleCreate";
    }

    @RequestMapping("/save")
    public String saveModule(Module module){
        moduleService.saveModule(module);
        return "redirect:/sysadmin/module/list";
    }


    @RequestMapping("/toupdate")
    public String toupdate(String moduleId, Model model){
        Module module = moduleService.findOne(moduleId);
        model.addAttribute("module", module);
        List<Module> moduleList = moduleService.findAll();
        model.addAttribute("moduleList", moduleList);
        return "/sysadmin/module/jModuleUpdate";
    }



    @RequestMapping("/update")
    public String updateModule(Module module){
        moduleService.deleteModules(module.getModuleId());
        moduleService.saveModule(module);
        return "redirect:/sysadmin/module/list";
    }

    @RequestMapping("/toview")
    public String toview(String moduleId, Model model){
        Module module = moduleService.findOne(moduleId);
        model.addAttribute("module", module);
//        List<Module> moduleList = moduleService.findAll();
//        model.addAttribute("list", moduleList);
        return "/sysadmin/module/jModuleView";
    }



    @RequestMapping("/stop")
    public String toStop(@RequestParam(value="moduleId", required = true) String[] moduleIds) {
        if (moduleIds != null) {
            int state = 0;
            moduleService.toUpdateState(moduleIds, state);
        }
        return "redirect:/sysadmin/module/list";
    }
    @RequestMapping("/start")
    public String toStart(@RequestParam(value = "moduleId", required = true)String[] moduleIds) {
        int state = 1;
        moduleService.toUpdateState(moduleIds, state);
        return "redirect:/sysadmin/module/list";
    }
}
