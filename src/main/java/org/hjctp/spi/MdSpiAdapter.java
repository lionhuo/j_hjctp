package org.hjctp.spi;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/7.
 */
public class MdSpiAdapter implements MdSpi {
    public void OnFrontConnected() {
        System.out.println("front connect success");
    }

    public void OnFrontDisconnected(int nReason) {

    }
}
