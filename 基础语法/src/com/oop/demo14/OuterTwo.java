package com.oop.demo14;

/**
 * 作者：whl
 * 日期：2023-06-08 20:04
 * 描述：
 */
public class OuterTwo {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService() {
            @Override
            public void hello() {

            }
        };
    }
}
interface CustomerService{
    void hello();
}