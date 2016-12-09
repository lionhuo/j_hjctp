package org.hjctp.jni;

import org.hjctp.spi.MdSpi;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/6.
 */
public class NativeLoader {
//    public static native long createMdApi(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast);
//    public static native long registerSpi(MdSpi mdSpi);
//    public static native long registerFront(String mdSpi);
    public static native void connect(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast, MdSpi mdSpi, String frontAddress);
}
