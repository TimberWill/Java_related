package com.whl.scanner;

/**
 * 作者：whl
 * 日期：2023-04-21 19:10
 * 描述：
 */
public class ForDemo01 {
    public static void main(String[] args) {
        int oddSum = 0;//奇数和
        int evenSum = 0;//偶数和
        for (int i = 0; i <= 100; i++) {
            if (i%2 != 0){
                oddSum += i;
            }else {
                evenSum += i;
            }
        }
        System.out.println("奇数和：" + oddSum);
        System.out.println("偶数和：" + evenSum);
    }
}
