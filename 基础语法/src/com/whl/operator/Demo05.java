package com.whl.operator;

/**
 * @author: whl
 * @date: 2023-04-20 18:55
 * @descrption: 三元运算符
 */
public class Demo05 {
    public static void main(String[] args) {
        //x ? y : z
        int score = 59;
        String type = score > 60? "及格" : "不及格";

        System.out.println(type);
    }
}
