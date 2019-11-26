package com.zhg.javakc.modules.mdata.msrelation.entity;

import com.zhg.javakc.base.entity.BaseEntity;

/**
 * 物资-供应商关系
 * @author Lee
 * @version v1.0
 * @date 2019/11/26 11:31
 */
public class MSEntity extends BaseEntity<MSEntity> {
    private String orgId;
    private String supplierId;
    private String materialId;
    private String msTaxRate;
    private String toOrg;
//    采购价一对多
//    private PP pp;


    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMsTaxRate() {
        return msTaxRate;
    }

    public void setMsTaxRate(String msTaxRate) {
        this.msTaxRate = msTaxRate;
    }

    public String getToOrg() {
        return toOrg;
    }

    public void setToOrg(String toOrg) {
        this.toOrg = toOrg;
    }
}
