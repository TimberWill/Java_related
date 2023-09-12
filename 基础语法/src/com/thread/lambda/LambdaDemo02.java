package com.thread.lambda;

/**
 * 作者：whl
 * 日期：2023-09-11 13:02
 * 描述：lambda表达式的简化
 */
public class LambdaDemo02 {
    public static void main(String[] args) {
        ILove iLove = null;
        //1. lambda表达式
        iLove = (int a)-> {
            System.out.println("i love you! "+a);
        };
        //简化1：去掉参数
        iLove = (a)-> {
            System.out.println("i love you! "+a);
        };
        //简化2：去掉括号
        iLove = a-> {
            System.out.println("i love you! "+a);
            System.out.println("i love you! "+a);
        };
        //简化3：去掉花括号
        iLove = (a)->System.out.println("i love you! "+a);

        iLove.love(520);
    }
}
interface ILove{
    void love(int a);
}
