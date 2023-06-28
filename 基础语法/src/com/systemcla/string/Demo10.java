package com.systemcla.string;

/**
 * 作者：whl
 * 日期：2023-06-28 10:25
 * 描述：StringBuilder
 */
public class Demo10 {
    public static void main(String[] args) {
        StringBuilder timber = new StringBuilder("timber");
        StringBuilder append = timber.append("will").append("ok").append("hello");
        System.out.println(timber.hashCode());
        System.out.println(append.hashCode());
    }

}
