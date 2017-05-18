package com.tedu.service;

import com.tedu.pojo.Role;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public interface RoleService {

    public List<Role> findAll();

    void deleteRoles(String[] roleIds);

    void save(Role role);

    Role findOne(String roleId);

    void update(Role role);

    void saveRoleModule(String[] moduleIds, String roleId);
}
