package com.systemcla.date;

import java.util.Date;

/**
 * 作者：whl
 * 日期：2023-06-28 16:09
 * 描述：Date类
 */
public class Demo01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
        System.out.println(date.toLocaleString());
    }

}
