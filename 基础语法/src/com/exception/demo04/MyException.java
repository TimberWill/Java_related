package com.exception.demo04;

/**
 * 作者：whl
 * 日期：2023-06-09 11:37
 * 描述：异常机制
 */
//自定义的异常类
public class MyException extends Exception{
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
