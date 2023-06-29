package com.systemcla.date;

import java.util.Date;

/**
 * 作者：whl
 * 日期：2023-06-28 16:37
 * 描述：毫秒
 */
public class Demo02 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
    }
}
