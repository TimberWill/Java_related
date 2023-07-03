package com.collections.set;

import java.util.Comparator;

/**
 * 作者：whl
 * 日期：2023-07-03 20:01
 * 描述：
 */
public class Teacher {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }
}
