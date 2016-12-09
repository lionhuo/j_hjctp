package org.hjctp;

import org.hjctp.api.MdApi;
import org.hjctp.spi.MdSpiAdapter;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/6.
 */
public class TestMain {
    static{
        System.loadLibrary("hjctp");
    }

    public static void main(String[] args) {
//        System.out.println(System.getProperty("java.library.path"));
        MdApi mdApi = new MdApi();
        MdSpiAdapter mdSpiA = new MdSpiAdapter();
        mdApi.connect("e:/test", true, true, mdSpiA, "tcp://180.168.146.187:10010");
//        mdApi.login("", "", "");
//        mdApi.registerMdSpi(mdSpiA);
//        mdApi.registerFront("tcp://180.168.146.187:10010");//tcp://180.168.146.187:10031
    }
}
