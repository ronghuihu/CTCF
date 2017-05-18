package com.tedu.pojo;

/**
 * Created by Administrator on 2017/6/2.
 */
public class SecBaseEntity extends BaseEntity{
    private User createBy; //创建人
    private User updateBy; //更新人

    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        this.createBy = createBy;
    }

    public User getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(User updateBy) {
        this.updateBy = updateBy;
    }
}
