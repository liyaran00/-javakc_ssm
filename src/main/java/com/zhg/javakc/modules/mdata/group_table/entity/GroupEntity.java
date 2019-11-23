package com.zhg.javakc.modules.mdata.group_table.entity;

import com.zhg.javakc.base.entity.BaseEntity;

public class GroupEntity extends BaseEntity<GroupEntity> {
     private  String orgId;// 主键ID
    private  String orgName;//组织名称
    private  String  orgNano;//组织简介
    private   String orgPid;//父类ID
    private   String orgGroupId;//价格组ID
    private   String  orgOpen;//是否默认打开
    private   String  orgOrder;//顺序
    private   String orgLevel;//组织级别

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgNano() {
        return orgNano;
    }

    public void setOrgNano(String orgNano) {
        this.orgNano = orgNano;
    }

    public String getOrgPid() {
        return orgPid;
    }

    public void setOrgPid(String orgPid) {
        this.orgPid = orgPid;
    }

    public String getOrgGroupId() {
        return orgGroupId;
    }

    public void setOrgGroupId(String orgGroupId) {
        this.orgGroupId = orgGroupId;
    }

    public String getOrgOpen() {
        return orgOpen;
    }

    public void setOrgOpen(String orgOpen) {
        this.orgOpen = orgOpen;
    }

    public String getOrgOrder() {
        return orgOrder;
    }

    public void setOrgOrder(String orgOrder) {
        this.orgOrder = orgOrder;
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }
}
