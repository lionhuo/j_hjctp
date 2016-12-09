package org.hjctp.api;

import org.hjctp.jni.NativeLoader;
import org.hjctp.spi.MdSpi;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/6.
 */
public class MdApi {

//    public MdApi(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast){
//        long rep = NativeLoader.createMdApi(pszFlowPath, bIsUsingUdp, bIsMulticast);
//        System.out.println(rep);
//    };

    public void connect(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast, MdSpi mdSpi, String frontAddress){
        NativeLoader.connect(pszFlowPath, bIsUsingUdp, bIsMulticast, mdSpi, frontAddress);
    }

    public void login(String brokerId, String invesotrId, String password){
        NativeLoader.login(brokerId, invesotrId, password);
    }

//    public void registerMdSpi(MdSpi mdSpi){
//        NativeLoader.registerSpi(mdSpi);
//    }
//
//    public void registerFront(String frontAddress){
//        NativeLoader.registerFront(frontAddress);
//    }
}
