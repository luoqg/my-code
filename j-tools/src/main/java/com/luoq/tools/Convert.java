package com.luoq.tools;

import java.io.UnsupportedEncodingException;

/**
 * 转化工具类
 * @author luoqiang
 * @data 2016/11/09
 */
public class Convert {

    /**
     * 转化 字符串 为 二进制
     * @param str
     * @return
     */
    public static byte[] convertToBytes(String str){
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unknown str:"+str);
        }
    }

    /**
     * 转化 二进制 为 字符串
     * @param data
     * @return
     */
    public static String convertToHexString(byte data[]) {
        StringBuffer strBuffer = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            strBuffer.append(Integer.toHexString(0xff & data[i]));
        }
        return strBuffer.toString();
    }

}
