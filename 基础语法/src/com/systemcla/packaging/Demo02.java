package com.systemcla.packaging;

/**
 * 作者：whl
 * 日期：2023-06-14 11:38
 * 描述：手动装箱、拆箱
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("------------------手动装箱、拆箱-------------------");
        int a = 10;
        Integer integer = new Integer(a);//手动装箱
        int i = integer.intValue();//手动拆箱

        System.out.println("------------------自动装箱、拆箱-------------------");
        //jdk 1.5之后不再使用手动，而是自动
        Integer integer2 = a;//自动装箱，底层还是new Integer()对象
        int j = integer2;//自动拆箱，底层还是intValue()方法

        System.out.println("------------------隐藏的装箱、拆箱-----------------");
        Integer c = new Integer(1);
        c++;//隐藏的拆箱，包装类不能自增，这里隐藏的转化成了基本类型
        int cc = 10;
        c.equals(cc);//隐藏的装箱，cc变成包装类

    }
}
