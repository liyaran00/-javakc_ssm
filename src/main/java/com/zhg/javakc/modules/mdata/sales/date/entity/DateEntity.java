package com.zhg.javakc.modules.mdata.sales.date.entity;

import com.zhg.javakc.base.entity.BaseEntity;

import java.util.Date;

/**
 * @author wang
 * @date 2019.11.25
 */


public class DateEntity extends BaseEntity<DateEntity> {
    private String salesPriceDateId;
    private Integer salesPrice;
    private Date salesPriceSdate;
    private Date salesPriceEdate;
    private String spHistoryId;

    public String getSalesPriceDateId() {
        return salesPriceDateId;
    }

    public void setSalesPriceDateId(String salesPriceDateId) {
        this.salesPriceDateId = salesPriceDateId;
    }

    public Integer getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Date getSalesPriceSdate() {
        return salesPriceSdate;
    }

    public void setSalesPriceSdate(Date salesPriceSdate) {
        this.salesPriceSdate = salesPriceSdate;
    }

    public Date getSalesPriceEdate() {
        return salesPriceEdate;
    }

    public void setSalesPriceEdate(Date salesPriceEdate) {
        this.salesPriceEdate = salesPriceEdate;
    }

    public String getSpHistoryId() {
        return spHistoryId;
    }

    public void setSpHistoryId(String spHistoryId) {
        this.spHistoryId = spHistoryId;
    }
}
