package org.hjctp.entity;

import java.io.Serializable;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p>
 * Created on 2016/12/11.
 */
public class CThostFtdcRspInfoField implements Serializable {

    private int ErrorID;

    private String ErrorMsg;

    public int getErrorID() {
        return ErrorID;
    }

    public void setErrorID(int errorID) {
        ErrorID = errorID;
    }

    public String getErrorMsg() {
        return ErrorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        ErrorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "CThostFtdcRspInfoField{" +
                "ErrorID=" + ErrorID +
                ", ErrorMsg='" + ErrorMsg + '\'' +
                '}';
    }
}
