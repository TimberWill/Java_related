package com.thread;


/**
 * 作者：whl
 * 日期：2023-09-11 9:22
 * 描述：静态代理——婚庆代理
 */
public class StaticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.HappyMarry();
        //回顾下多线程
        new Thread(() -> System.out.println("早上好！")).start();
    }
}

//结婚接口
interface Marry{
    void HappyMarry();
}

class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("老张要结婚了，真开心！");
    }
}

class WeddingCompany implements  Marry{
    //指定结婚对象
    private Marry target;

    //构造方法
    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚后，收尾款");
    }

    private void before() {
        System.out.println("结婚前，布置现场");
    }
}