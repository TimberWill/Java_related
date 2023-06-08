package com.oop.demo05;

/**
 * 作者：whl
 * 日期：2023-06-08 10:36
 * 描述：类
 */
public class Student {
    //属性私有
    private String name;//名字
    private int id;//学号
    private char sex;//性别
    private int age;//年龄

    //生成get、set方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>120||age<0){
            this.age = 3;
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
