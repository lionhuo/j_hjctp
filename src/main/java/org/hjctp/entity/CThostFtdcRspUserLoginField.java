package org.hjctp.entity;

import java.io.Serializable;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p>
 * Created on 2016/12/11.
 */
public class CThostFtdcRspUserLoginField implements Serializable {

    String tradingDay;

    String loginTime;

    private String brokerId;

    private String userId;

    private String systemName;

    private int	frontID;

    private int	sessionID;

    private String maxOrderRef;

    private String shfeTime;

    private String dcetime;

    private String czceTime;

    private String ffexTime;

    private String ineTime;

    public String getTradingDay() {
        return tradingDay;
    }

    public void setTradingDay(String tradingDay) {
        this.tradingDay = tradingDay;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public int getFrontID() {
        return frontID;
    }

    public void setFrontID(int frontID) {
        this.frontID = frontID;
    }

    public int getSessionID() {
        return sessionID;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public String getMaxOrderRef() {
        return maxOrderRef;
    }

    public void setMaxOrderRef(String maxOrderRef) {
        this.maxOrderRef = maxOrderRef;
    }

    public String getShfeTime() {
        return shfeTime;
    }

    public void setShfeTime(String shfeTime) {
        this.shfeTime = shfeTime;
    }

    public String getDcetime() {
        return dcetime;
    }

    public void setDcetime(String dcetime) {
        this.dcetime = dcetime;
    }

    public String getCzceTime() {
        return czceTime;
    }

    public void setCzceTime(String czceTime) {
        this.czceTime = czceTime;
    }

    public String getFfexTime() {
        return ffexTime;
    }

    public void setFfexTime(String ffexTime) {
        this.ffexTime = ffexTime;
    }

    public String getIneTime() {
        return ineTime;
    }

    public void setIneTime(String ineTime) {
        this.ineTime = ineTime;
    }

    @Override
    public String toString() {
        return "CThostFtdcRspUserLoginField{" +
                "tradingDay='" + tradingDay + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", userId='" + userId + '\'' +
                ", systemName='" + systemName + '\'' +
                ", frontID=" + frontID +
                ", sessionID=" + sessionID +
                ", maxOrderRef='" + maxOrderRef + '\'' +
                ", shfeTime='" + shfeTime + '\'' +
                ", dcetime='" + dcetime + '\'' +
                ", czceTime='" + czceTime + '\'' +
                ", ffexTime='" + ffexTime + '\'' +
                ", ineTime='" + ineTime + '\'' +
                '}';
    }
}
