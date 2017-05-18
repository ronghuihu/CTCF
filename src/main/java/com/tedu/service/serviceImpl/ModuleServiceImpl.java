package com.tedu.service.serviceImpl;

import com.tedu.mapper.ModuleMapper;
import com.tedu.pojo.Module;
import com.tedu.service.ModuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/5/30.
 */
@Service
public class ModuleServiceImpl implements ModuleService{

    @Resource
    private ModuleMapper moduleMapper;
    public List<Module> findAll() {
        return moduleMapper.findAll();
    }

    public void deleteModules(String[] moduleIds) {
        moduleMapper.deleteModules(moduleIds);
    }

    public void saveModule(Module module) {
        module.setModuleId(UUID.randomUUID().toString());
        module.setState(1);
        moduleMapper.saveModule(module);
    }

    public void updateModule(String moduleId) {

    }

    public Module findOne(String moduleId) {
        return moduleMapper.findOne(moduleId);
    }

    public void toUpdateState(String[] moduleIds, int state) {
        moduleMapper.updateState(moduleIds, state);
    }

    public List<String> findRoleModuleListByRoleId(String roleId) {
        return moduleMapper.findRoleModuleListByRoleId(roleId);
    }

}
