package org.hjctp.spi;

import org.hjctp.entity.CThostFtdcDepthMarketDataField;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/6.
 */
public interface MdSpi {
    void OnFrontConnected();

    void OnFrontDisconnected(int nReason);

    void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData);
}
