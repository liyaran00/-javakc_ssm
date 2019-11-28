package com.zhg.javakc.modules.mdata.material.entity;

import com.zhg.javakc.base.entity.BaseEntity;

import java.sql.Blob;
import java.util.Date;

public class MaterialEntity extends BaseEntity<MaterialEntity> {

    private String materialId;
    private String categoryName;
    private String materialName;
    private String materialStandard;
    private String materialNano;
    private String materialDesc;
    private Blob materialPhoto;
    private String materialHascode;
    private String materialType;
    private String materialIscontract;
    private String materialGroup;
    private String materialTaxRate;
    private String materialBaseUnit;
    private String materialProUnit;
    private String materialNetWeight;
    private String materialGrossWeight;
    private String materialVolumeUnit;
    private int materialVolumeH;
    private int materialVolumeW;
    private int materialVolumeL;
    private int materialDateNum;
    private String materialState;
    private Date materialUpdateDate;
    private String creator;


    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialStandard() {
        return materialStandard;
    }

    public void setMaterialStandard(String materialStandard) {
        this.materialStandard = materialStandard;
    }

    public String getMaterialNano() {
        return materialNano;
    }

    public void setMaterialNano(String materialNano) {
        this.materialNano = materialNano;
    }

    public String getMaterialDesc() {
        return materialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        this.materialDesc = materialDesc;
    }

    public Blob getMaterialPhoto() {
        return materialPhoto;
    }

    public void setMaterialPhoto(Blob materialPhoto) {
        this.materialPhoto = materialPhoto;
    }

    public String getMaterialHascode() {
        return materialHascode;
    }

    public void setMaterialHascode(String materialHascode) {
        this.materialHascode = materialHascode;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialIscontract() {
        return materialIscontract;
    }

    public void setMaterialIscontract(String materialIscontract) {
        this.materialIscontract = materialIscontract;
    }

    public String getMaterialGroup() {
        return materialGroup;
    }

    public void setMaterialGroup(String materialGroup) {
        this.materialGroup = materialGroup;
    }

    public String getMaterialTaxRate() {
        return materialTaxRate;
    }

    public void setMaterialTaxRate(String materialTaxRate) {
        this.materialTaxRate = materialTaxRate;
    }

    public String getMaterialBaseUnit() {
        return materialBaseUnit;
    }

    public void setMaterialBaseUnit(String materialBaseUnit) {
        this.materialBaseUnit = materialBaseUnit;
    }

    public String getMaterialProUnit() {
        return materialProUnit;
    }

    public void setMaterialProUnit(String materialProUnit) {
        this.materialProUnit = materialProUnit;
    }

    public String getMaterialNetWeight() {
        return materialNetWeight;
    }

    public void setMaterialNetWeight(String materialNetWeight) {
        this.materialNetWeight = materialNetWeight;
    }

    public String getMaterialGrossWeight() {
        return materialGrossWeight;
    }

    public void setMaterialGrossWeight(String materialGrossWeight) {
        this.materialGrossWeight = materialGrossWeight;
    }

    public String getMaterialVolumeUnit() {
        return materialVolumeUnit;
    }

    public void setMaterialVolumeUnit(String materialVolumeUnit) {
        this.materialVolumeUnit = materialVolumeUnit;
    }

    public int getMaterialVolumeH() {
        return materialVolumeH;
    }

    public void setMaterialVolumeH(int materialVolumeH) {
        this.materialVolumeH = materialVolumeH;
    }

    public int getMaterialVolumeW() {
        return materialVolumeW;
    }

    public void setMaterialVolumeW(int materialVolumeW) {
        this.materialVolumeW = materialVolumeW;
    }

    public int getMaterialVolumeL() {
        return materialVolumeL;
    }

    public void setMaterialVolumeL(int materialVolumeL) {
        this.materialVolumeL = materialVolumeL;
    }

    public int getMaterialDateNum() {
        return materialDateNum;
    }

    public void setMaterialDateNum(int materialDateNum) {
        this.materialDateNum = materialDateNum;
    }

    public String getMaterialState() {
        return materialState;
    }

    public void setMaterialState(String materialState) {
        this.materialState = materialState;
    }

    public Date getMaterialUpdateDate() {
        return materialUpdateDate;
    }

    public void setMaterialUpdateDate(Date materialUpdateDate) {
        this.materialUpdateDate = materialUpdateDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
