package com.reflection;

/**
 * 作者：whl
 * 日期：2023-09-13 12:07
 * 描述：Class类的创建方式
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);

        //方法一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //方法二：通过forname获得
        Class c2 = Class.forName("com.reflection.Student");
        System.out.println(c2.hashCode());

        //方法三：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //方法四：基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }

}
//人类
class Person{
    public String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
//学生类
class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}
//老师类
class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}