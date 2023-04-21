package com.whl.base;

/**
 * 作者：whl
 * 日期：2023-04-19 18:30
 * 描述：
 */
public class Demo6 {
    //类变量 static
    static double salary = 2500;

    //实例变量：从属于对象；如果不自行初始化，这个类型的默认值
    //数值型：默认0/0.0
    //布尔值：默认false
    //除了基本类型，其余的默认值都为null
    String name;
    int age;

    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化
        int i = 0;
        System.out.println(i);

        //变量类型  变量名 = new com.whl.base.Demo6()
        Demo6 demo6 = new Demo6();
        System.out.println(demo6.age);
        System.out.println(demo6.name);

        //类变量：加了static，从属于类
        System.out.println(salary);//可以直接输出类变量，随着类一起出来，一起消失
    }
}
