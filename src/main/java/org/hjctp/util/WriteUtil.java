package org.hjctp.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/16.
 */
public class WriteUtil {
    private static BufferedWriter bufWriter;
    static {
        try {
            bufWriter = new BufferedWriter(new FileWriter("E:\\test\\trade.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedWriter buildWrite(){
        return bufWriter;
    }
}
