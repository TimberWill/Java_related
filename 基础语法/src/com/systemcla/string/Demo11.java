package com.systemcla.string;

/**
 * 作者：whl
 * 日期：2023-06-28 11:09
 * 描述：StringBuilder
 */
public class Demo11 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("timber");
        builder.insert(2, "will");
        System.out.println(builder);

//        builder.setCharAt(3,'a');
//        System.out.println(builder);
//
//        builder.replace(1,3,"ok");
//        System.out.println(builder);
//
//        builder.deleteCharAt(0);
//        System.out.println(builder);
//
//        builder.delete(5,8);
//        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
