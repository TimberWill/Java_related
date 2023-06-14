package com.systemcla.packaging;

/**
 * 作者：whl
 * 日期：2023-06-14 10:51
 * 描述：包装类
 */
public class Demo01 {
    public static void main(String[] args) {
        //包装类中的常用属性
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.TYPE);
        //1. 把String类型转为int类型（符合范围，格式也对的才能转）
        String str = "123";
        int num = Integer.parseInt(str);
        //2. 把String类型转为Integer类型
        Integer integer = Integer.valueOf(str);
        //3. 把Integer类型转为String类型
        String s = integer.toString();
        System.out.println(num);
        System.out.println(integer);
        System.out.println(s);
    }
}
