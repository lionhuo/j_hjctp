package org.hjctp.spi;

import org.hjctp.entity.CThostFtdcDepthMarketDataField;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/7.
 */
public class MdSpiAdapter implements MdSpi {

    @Override
    public void OnFrontConnected() {
        System.out.println("front connect success");
    }

    @Override
    public void OnFrontDisconnected(int nReason) {

    }

    @Override
    public void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
        System.out.println(pDepthMarketData.getLastPrice());
    }
}
