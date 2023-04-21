package com.whl.strcut;

/**
 * 作者：whl
 * 日期：2023-04-21 19:56
 * 描述：打印101-150之间的所有质数
 */
public class ForDemo02 {
    public static void main(String[] args) {
        //outer标签
        outer :for (int i = 101; i <= 150; i++) {
            for (int j = 2; j < i/2; j++) {
                if (i%j ==0){
                    continue outer;//内部循环跳到外部循环，走下一个数字
                }
            }
            System.out.print(i + "\t");
        }
    }
}
