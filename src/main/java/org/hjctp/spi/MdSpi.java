package org.hjctp.spi;

import org.hjctp.entity.*;

import java.io.BufferedWriter;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/6.
 */
public interface MdSpi {

    void onFrontConnected();

    void onFrontDisconnected(int nReason);

    void onRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast);

    void onRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast);

    void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast);

    void onRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast);

    void onRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast);

    void onRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast);

    void onRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast);

    void onRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData);

    void onRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp);

    void onResetBufferWriter(BufferedWriter bufWriter);
}
