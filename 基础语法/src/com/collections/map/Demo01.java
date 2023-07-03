package com.collections.map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 作者：whl
 * 日期：2023-07-03 23:11
 * 描述：Map
 */
public class Demo01 {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "zs1", 11);
        Student stu2 = new Student(2, "zs2", 12);
        Student stu3 = new Student(3, "zs3", 13);
        Student stu4 = new Student(4, "zs4", 14);
        Student stu5 = new Student(5, "zs5", 15);

        HashMap<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(stu1.getId(),stu1);
        hashMap.put(stu2.getId(),stu2);
        hashMap.put(stu3.getId(),stu3);
        hashMap.put(stu4.getId(),stu4);
        hashMap.put(stu5.getId(),stu5);

        System.out.println("请输入id：");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Student student = hashMap.get(id);
        System.out.println(student);
//        scanner.close();
    }
}
