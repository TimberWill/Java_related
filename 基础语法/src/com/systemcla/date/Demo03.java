package com.systemcla.date;

import java.sql.Date;

/**
 * 作者：whl
 * 日期：2023-06-28 19:21
 * 描述：
 */
public class Demo03 {
    public static void main(String[] args) {
        String str = "2023-06-28";
        Date date = Date.valueOf(str);
        System.out.println(date);

    }
}
