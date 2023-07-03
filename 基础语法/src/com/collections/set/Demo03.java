package com.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 作者：whl
 * 日期：2023-06-30 10:56
 * 描述：Set集合中存对象
 */
public class Demo03 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("zs",10));
        set.add(new Student("ls",10));
        set.add(new Student("zs",10));
        System.out.println(set);
    }

}
