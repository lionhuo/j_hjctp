package org.hjctp;

import org.hjctp.api.MdApi;
import org.hjctp.spi.MdSpiAdapter;

import java.util.ArrayList;
import java.util.List;

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
        String[] contracts = new String[]{"m1701","TA701","rb1701"};
        MdApi mdApi = new MdApi("d:/tmp", true, true);
        MdSpiAdapter mdSpiA = new MdSpiAdapter();
        mdApi.registerMdSpi(mdSpiA);
        mdApi.registerFront("tcp://180.168.146.187:10031");
        mdApi.registerLoginInfo("9999", "077580", "hp120416");
        mdApi.registerSubMarketData(contracts, 2);
        mdApi.connect();
    }
}
