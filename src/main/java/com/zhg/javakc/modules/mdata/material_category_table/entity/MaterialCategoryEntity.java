package com.zhg.javakc.modules.mdata.material_category_table.entity;

import com.zhg.javakc.base.entity.BaseEntity;

public class MaterialCategoryEntity extends BaseEntity<MaterialCategoryEntity> {

    private String categoryId;
    private String categoryName;
    private String categoryNano;
    private String categoryPid;
    private String categoryOpen;
    private int categoryOrder;
    private String categoryLevel;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryNano() {
        return categoryNano;
    }

    public void setCategoryNano(String categoryNano) {
        this.categoryNano = categoryNano;
    }

    public String getCategoryPid() {
        return categoryPid;
    }

    public void setCategoryPid(String categoryPid) {
        this.categoryPid = categoryPid;
    }

    public String getCategoryOpen() {
        return categoryOpen;
    }

    public void setCategoryOpen(String categoryOpen) {
        this.categoryOpen = categoryOpen;
    }

    public int getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(int categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public String getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(String categoryLevel) {
        this.categoryLevel = categoryLevel;
    }
}
