package com.collections.set;

import java.util.TreeSet;

/**
 * 作者：whl
 * 日期：2023-07-03 17:43
 * 描述：TreeSet
 */
public class Demo04 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("zs",16));
        treeSet.add(new Student("ls",17));
        treeSet.add(new Student("zs2",16));
        System.out.println(treeSet);

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(17);
        integerTreeSet.add(11);
        integerTreeSet.add(12);
        System.out.println(integerTreeSet);

    }

}
