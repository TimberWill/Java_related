package com.collections.set;

import java.util.TreeSet;

/**
 * 作者：whl
 * 日期：2023-07-03 20:04
 * 描述：
 */
public class Demo05 {
    public static void main(String[] args) {
        Teacher zs = new Teacher("zs", 16);
        Teacher zs2 = new Teacher("zs2", 16);
        //将外部比较器设置到set中
        MyCompa myCompa = new MyCompa();
        int i = myCompa.compare(zs, zs2);
        System.out.println(i);

        TreeSet<Teacher> teachers = new TreeSet<>(myCompa);
        teachers.add(zs);
        teachers.add(zs2);
        System.out.println(teachers);



    }

}
