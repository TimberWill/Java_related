package com.systemcla.string;


/**
 * 作者：whl
 * 日期：2023-06-28 15:18
 * 描述：String常见面试题
 */
public class InterviewTest {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";

        String s1 = a + b + c + d;//（3个）相当于new了3个变量："ab","abc","abcd"
        String s2 = "abcd";//（1个/0个）常量池中没有，就创建一个；有就指向已有的常量池
        String s3 = "a" + "b" + "c" + "d";//（1个/0个）JVM自动优化，当作"abcd"来处理
        //s1和s3的区别是，+的是常量还是变量，+变量就是new，+常量就不用

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
    }
}
