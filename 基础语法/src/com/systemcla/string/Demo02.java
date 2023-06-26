package com.systemcla.string;

import java.io.UnsupportedEncodingException;

/**
 * 作者：whl
 * 日期：2023-06-26 15:39
 * 描述：中文乱码处理
 */
public class Demo02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "timber";
        //主要作用是对中文乱码进行处理，对字符串进行重新编码
        //如：将ISO-8859-1编码，转为UTF-8编码
        byte[] bytes = str.getBytes("ISO-8859-1");
        String string = new String(bytes, "UTF-8");
        System.out.println(string);

    }
}
