package com.oop;

/**
 * 作者：whl
 * 日期：2023-06-07 14:52
 * 描述：引用传递（传递的是对象，本质还是值传递）
 */
public class Demo04 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("person.name:" + person.name);
        change(person);
        System.out.println("person.name:" + person.name);
    }
    public static void change(Person person){
        //这里person是一个对象。指向的是---->Person person = new Person();具体的人，可以改变属性。
        person.name = "whl";
    }
}
class Person{
    String name;
}