package com.tedu.pojo;

/**
 * 模块
 * Created by Administrator on 2017/6/2.
 */
public class Module extends SecBaseEntity{
    private String moduleId;
    private Module parentModule; //父模块
    private String moduleName;
    private Integer ctype;
    private Integer state; //1启用0停用
    private String remark; //模块说明

    private boolean checked;

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean getChecked() {
        return checked;
    }

    public String getId() {
        return moduleId;
    }

    public void setId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getName() {
        return moduleName;
    }

    public void setName(String name) {
        this.moduleName = name;
    }

    public String getpId() {
        if (parentModule != null){
            return parentModule.getModuleId();
        }
        return "";
    }

    public void setpId(String moduleId) {
        this.parentModule.setModuleId(moduleId);
    }



    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public Module getParentModule() {
        return parentModule;
    }

    public void setParentModule(Module parentModule) {
        this.parentModule = parentModule;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
