package org.hjctp.spi;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.hjctp.entity.*;
import org.hjctp.util.WriteUtil;

import java.io.*;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/7.
 */
public class MdSpiAdapter implements MdSpi {

    BufferedWriter bufWriter = WriteUtil.buildWrite();

    @Override
    public void onFrontConnected() {
        System.out.println("front connect success");
    }

    @Override
    public void onFrontDisconnected(int nReason) {

    }

    @Override
    public void onRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo,
                               int nRequestID, boolean bIsLast) {
        System.out.println(pRspUserLogin);
        System.out.println(pRspInfo);
        System.out.println(nRequestID);
        System.out.println(bIsLast);
    }

    @Override
    public void onRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    }

    @Override
    public void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    }

    @Override
    public void onRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    }

    @Override
    public void onRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    }

    @Override
    public void onRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    }

    @Override
    public void onRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    }


    @Override
    public void onRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
//        System.out.println(pDepthMarketData.getInstrumentId());
        try {
            bufWriter.newLine();
            bufWriter.write(pDepthMarketData.getInstrumentId() + " " + pDepthMarketData.getLastPrice() + " " + pDepthMarketData.getUpdateTime());
            bufWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            try {
//                bufWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println(pDepthMarketData.getInstrumentId() + " " + pDepthMarketData.getLastPrice() + " " + pDepthMarketData.getUpdateTime());
//        System.out.println(pDepthMarketData.getClosePrice());
//        System.out.println(pDepthMarketData);
    }

    @Override
    public void onRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp) {

    }
}