package com.systemcla.object;

/**
 * 作者：whl
 * 日期：2023-06-13 14:43
 * 描述：
 */
public class Application {
    public static void main(String[] args) {
        Student zs = new Student(10, "zs");
        Student zs1 = new Student(10, "zs");
        System.out.println(zs == zs1);
        System.out.println(zs.equals(zs1));
        System.out.println(zs.hashCode());
        System.out.println(zs1.hashCode());
    }
}
