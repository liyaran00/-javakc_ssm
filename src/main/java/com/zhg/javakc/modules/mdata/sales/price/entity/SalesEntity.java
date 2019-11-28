package com.zhg.javakc.modules.mdata.sales.price.entity;

import com.zhg.javakc.base.entity.BaseEntity;

import java.util.Date;

/**
 * @author Lee
 * @version v1.0
 * @date 2019/11/19 14:59
 */
public class SalesEntity extends BaseEntity<SalesEntity> {

    private String salesPriceId;
    private String orgId;
    private String clientName;
    private String chargeUnit;
    private String materialId;
    private String spHistroyId;
    private int salesPriceState;
    private String creator;
    private Date createDate;


    public String getSalesPriceId() {
        return salesPriceId;
    }

    public void setSalesPriceId(String salesPriceId) {
        this.salesPriceId = salesPriceId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getSpHistroyId() {
        return spHistroyId;
    }

    public void setSpHistroyId(String spHistroyId) {
        this.spHistroyId = spHistroyId;
    }

    public int getSalesPriceState() {
        return salesPriceState;
    }

    public void setSalesPriceState(int salesPriceState) {
        this.salesPriceState = salesPriceState;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
