package com.reflection;

/**
 * 作者：whl
 * 日期：2023-09-13 11:34
 * 描述：反射
 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.reflection.User");
        System.out.println(c1);

        //一个类在内存中只有一个Class对象
        //一个类被加载后，类的整个结构都会被封装在Class对象中
        Class c2 = Class.forName("com.reflection.User");
        Class c3 = Class.forName("com.reflection.User");
        Class c4 = Class.forName("com.reflection.User");
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

    }
}
//实体类
class User{
    private String name;
    private int id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
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

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public User() {
    }
}
