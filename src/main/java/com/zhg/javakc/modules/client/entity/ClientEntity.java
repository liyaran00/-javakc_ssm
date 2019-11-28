package com.zhg.javakc.modules.client.entity;

import com.zhg.javakc.base.entity.BaseEntity;



/**
 * @author Lee
 * @version v1.0
 * @date 2019/11/19 14:59
 */
public class ClientEntity extends BaseEntity<ClientEntity> {

    private String clientId;
    private String clientName;
    private String clientAbbr;
    private String clientLinkman;
    private String linkmanPhone;
    private String clientCode;


    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAbbr() {
        return clientAbbr;
    }

    public void setClientAbbr(String clientAbbr) {
        this.clientAbbr = clientAbbr;
    }

    public String getClientLinkman() {
        return clientLinkman;
    }

    public void setClientLinkman(String clientLinkman) {
        this.clientLinkman = clientLinkman;
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }
}
