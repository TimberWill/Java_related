package com.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 作者：whl
 * 日期：2023-07-18 11:27
 * 描述：runnable接口实现网图下载
 */
public class ThreadTest04 implements Runnable{
    private String url;
    private String name;

    public ThreadTest04(String url,String name){
        this.url = url;
        this.name = name;

    }

    @Override
    public void run() {
        WebDownLoader02 webDownLoader = new WebDownLoader02();
        webDownLoader.downloader(url,name);
        System.out.println("下载了文件名为：" + name);
    }

    public static void main(String[] args) {
        ThreadTest02 t1 = new ThreadTest02("https://ssl.gstatic.com/ui/v1/icons/mail/rfr/logo_gmail_lockup_default_2x_r5.png", "1.jpg");
        ThreadTest02 t2 = new ThreadTest02("https://ssl.gstatic.com/ui/v1/icons/mail/rfr/logo_gmail_lockup_default_2x_r5.png", "2.jpg");
        ThreadTest02 t3 = new ThreadTest02("https://ssl.gstatic.com/ui/v1/icons/mail/rfr/logo_gmail_lockup_default_2x_r5.png", "3.jpg");

//        t1.start();
//        t2.start();
//        t3.start();
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();

    }

}
//下载器
class WebDownLoader02{
    //下载方法，将网上一个文件地址变成文件下载下来
    public void downloader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }

}