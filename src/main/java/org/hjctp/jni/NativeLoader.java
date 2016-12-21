package org.hjctp.jni;

import org.hjctp.spi.MdSpi;

import java.util.List;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/6.
 */
public class NativeLoader {
    static{
        System.loadLibrary("hjctp");
    }
    public static native void createMdApi(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast);
    public static native void registerSpi(MdSpi mdSpi);
    public static native void registerFront(String mdSpi);
    public static native void registerLoginInfo(String brokerId, String investorId, String password);
    public static native void registerSubMarketData(String[] contracts, int iInstrumentID);
    public static native void connect();
    public static native String getTradingTay();
    public static native void stop();
}
