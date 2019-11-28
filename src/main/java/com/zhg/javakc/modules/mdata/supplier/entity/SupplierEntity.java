package com.zhg.javakc.modules.mdata.supplier.entity;

import com.zhg.javakc.base.entity.BaseEntity;

public class SupplierEntity extends BaseEntity<SupplierEntity> {

    private int supplierId;//供应商ID（7位）
    private String supplierType;//供应商类型
    private String orgId; //外键-组织表id
    private String supplierName;//供应商名称
    private String supplierClassify;//供应商分类
    private String supplierAcronym;//供应商简称
    private String supplierLinkman;//供应商联系人
    private String supplierLinkmanPhone;//供应商联系人电话
    private String supplierLinkmanEmail;//供应商联系人邮箱
    private String supplierMan;//供应商法人
    private String supplierManPhone;//供应商法人联系电话
    private String supplierAddress;//供应商地址
    private int supplierCoding;//社会统一信用代码
    private String supplierIsGateway;//启用门户
    private String supplierIsContract;//必须合同
    private String supplierState;//是否启用

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierClassify() {
        return supplierClassify;
    }

    public void setSupplierClassify(String supplierClassify) {
        this.supplierClassify = supplierClassify;
    }

    public String getSupplierAcronym() {
        return supplierAcronym;
    }

    public void setSupplierAcronym(String supplierAcronym) {
        this.supplierAcronym = supplierAcronym;
    }

    public String getSupplierLinkman() {
        return supplierLinkman;
    }

    public void setSupplierLinkman(String supplierLinkman) {
        this.supplierLinkman = supplierLinkman;
    }

    public String getSupplierLinkmanPhone() {
        return supplierLinkmanPhone;
    }

    public void setSupplierLinkmanPhone(String supplierLinkmanPhone) {
        this.supplierLinkmanPhone = supplierLinkmanPhone;
    }

    public String getSupplierLinkmanEmail() {
        return supplierLinkmanEmail;
    }

    public void setSupplierLinkmanEmail(String supplierLinkmanEmail) {
        this.supplierLinkmanEmail = supplierLinkmanEmail;
    }

    public String getSupplierMan() {
        return supplierMan;
    }

    public void setSupplierMan(String supplierMan) {
        this.supplierMan = supplierMan;
    }

    public String getSupplierManPhone() {
        return supplierManPhone;
    }

    public void setSupplierManPhone(String supplierManPhone) {
        this.supplierManPhone = supplierManPhone;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public int getSupplierCoding() {
        return supplierCoding;
    }

    public void setSupplierCoding(int supplierCoding) {
        this.supplierCoding = supplierCoding;
    }

    public String getSupplierIsGateway() {
        return supplierIsGateway;
    }

    public void setSupplierIsGateway(String supplierIsGateway) {
        this.supplierIsGateway = supplierIsGateway;
    }

    public String getSupplierIsContract() {
        return supplierIsContract;
    }

    public void setSupplierIsContract(String supplierIsContract) {
        this.supplierIsContract = supplierIsContract;
    }

    public String getSupplierState() {
        return supplierState;
    }

    public void setSupplierState(String supplierState) {
        this.supplierState = supplierState;
    }
}
