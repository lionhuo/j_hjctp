package org.hjctp.api;

import org.hjctp.jni.NativeLoader;
import org.hjctp.spi.MdSpi;

import java.util.List;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/6.
 */
public class MdApi {

    public MdApi(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast){
        NativeLoader.createMdApi(pszFlowPath, bIsUsingUdp, bIsMulticast);
    };

    public void registerMdSpi(MdSpi mdSpi){
        NativeLoader.registerSpi(mdSpi);
    }

    public void registerFront(String frontAddress){
        NativeLoader.registerFront(frontAddress);
    }

    public void registerLoginInfo(String brokerId, String investorId, String password){
        NativeLoader.registerLoginInfo(brokerId, investorId, password);
    }

    public void registerSubMarketData(String[] contracts, int iInstrumentID){
        NativeLoader.registerSubMarketData(contracts, iInstrumentID);
    }

    public void connect(){
        NativeLoader.connect();
    }

    public String getTradingDay(){
        return NativeLoader.getTradingTay();
    }

    public void stop() {
        NativeLoader.stop();
    }
}
