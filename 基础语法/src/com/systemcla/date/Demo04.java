package com.systemcla.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：whl
 * 日期：2023-06-28 20:11
 * 描述：Date类
 */
public class Demo04 {
    public static void main(String[] args) throws ParseException {
        //String转Date
        String str = "2023-06-28 20:35:06";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse(str);
        System.out.println(date);

        String str2 = "2023/06/28 20:35:06";
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date2 = dateFormat.parse(str);
        System.out.println(date2);

        String str3 = "2023年06月28日 20:35:06";
        DateFormat dateFormat3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date3 = dateFormat.parse(str);
        System.out.println(date3);

        //Date转String
        Date date1 = new Date();
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = format1.format(date1);
        System.out.println(s);
    }


}
