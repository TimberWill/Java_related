package com.systemcla.string;

import java.util.Arrays;

/**
 * 作者：whl
 * 日期：2023-06-26 16:03
 * 描述：字符串的分割
 */
public class Demo03 {
    public static void main(String[] args) {
        String str = "t-i-m-b-e-r";
        String[] split = str.split("-");//以-作为分割
        System.out.println(Arrays.toString(split));
    }
}
