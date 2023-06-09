package com.exception;

/**
 * 作者：whl
 * 日期：2023-06-09 11:04
 * 描述：异常机制
 */
public class Demo01 {
    public static void main(String[] args) {
        try {
            new Demo01().a();
        }catch (Exception e){
            System.out.println("exception");
        }catch (Error error){
            System.out.println("error");
        }catch (Throwable throwable){
            System.out.println("throwable");
        }finally {
            System.out.println("善后工作");
        }
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
