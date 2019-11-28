package com.zhg.javakc.modules.mdata.price.entity;

import com.zhg.javakc.base.entity.BaseEntity;

public class PriceEntity extends BaseEntity<PriceEntity> {
     private  String priceGroupId;// 主键ID
     private  String priceGroupName;//价格组织名称
     private  String  priceGroupCreator;//创建人

     public String getPriceGroupId() {
          return priceGroupId;
     }

     public void setPriceGroupId(String priceGroupId) {
          this.priceGroupId = priceGroupId;
     }

     public String getPriceGroupName() {
          return priceGroupName;
     }

     public void setPriceGroupName(String priceGroupName) {
          this.priceGroupName = priceGroupName;
     }

     public String getPriceGroupCreator() {
          return priceGroupCreator;
     }

     public void setPriceGroupCreator(String priceGroupCreator) {
          this.priceGroupCreator = priceGroupCreator;
     }
}
