package org.hjctp.entity;

import java.io.Serializable;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p>
 * Created on 2016/12/11.
 */
public class CThostFtdcUserLogoutField implements Serializable {

    String brokerID;

    String userID;

    public String getBrokerID() {
        return brokerID;
    }

    public void setBrokerID(String brokerID) {
        this.brokerID = brokerID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "CThostFtdcUserLogoutField{" +
                "brokerID='" + brokerID + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }
}
