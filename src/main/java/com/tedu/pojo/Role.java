package com.tedu.pojo;

/**
 * 角色
 * Created by Administrator on 2017/6/2.
 */
public class Role extends SecBaseEntity {
    private String roleId;
    private String roleName;
    private String remark; //角色相关说明

    private Boolean checked;//设置zTreeJSON的初始选中状态
    public String getId(){ return roleId; }
    public String getName(){ return roleName; }
    public Boolean getChecked(){
        return checked;
    }

    public void setChecked(Boolean checked){
        this.checked = checked;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
