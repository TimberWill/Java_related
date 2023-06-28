package com.systemcla.string;

/**
 * 作者：whl
 * 日期：2023-06-28 10:05
 * 描述：StringBuilder
 */
public class Demo09 {
    public static void main(String[] args) {
        String str = "timber";
        StringBuilder builder = new StringBuilder("timber");
        long l = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            str.concat("will");
//            builder.append("will");
        }
        long e = System.currentTimeMillis();
        System.out.println("代码运行时间：" + (e-l));
    }

}
