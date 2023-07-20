package com.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * 作者：whl
 * 日期：2023-07-20 11:10
 * 描述：实现callable接口
 */
public class ThreadTest07 implements Callable<Boolean> {
    private String url;
    private String name;

    public ThreadTest07(String url,String name){
        this.url = url;
        this.name = name;

    }

    @Override
    public Boolean call() {
        WebDownLoader03 webDownLoader = new WebDownLoader03();
        webDownLoader.downloader(url,name);
        System.out.println("下载了文件名为：" + name);

        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadTest07 t1 = new ThreadTest07("https://ssl.gstatic.com/ui/v1/icons/mail/rfr/logo_gmail_lockup_default_2x_r5.png", "1.jpg");
        ThreadTest07 t2 = new ThreadTest07("https://ssl.gstatic.com/ui/v1/icons/mail/rfr/logo_gmail_lockup_default_2x_r5.png", "2.jpg");
        ThreadTest07 t3 = new ThreadTest07("https://ssl.gstatic.com/ui/v1/icons/mail/rfr/logo_gmail_lockup_default_2x_r5.png", "3.jpg");

        //创建执行服务：
        ExecutorService service = Executors.newFixedThreadPool(3);
        //提交服务：
        Future<Boolean> result1 = service.submit(t1);
        Future<Boolean> result2 = service.submit(t2);
        Future<Boolean> result3 = service.submit(t3);
        //获取结果
        Boolean r1 = result1.get();
        Boolean r2 = result2.get();
        Boolean r3 = result3.get();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        //关闭服务
        service.shutdownNow();

    }

}
//下载器
class WebDownLoader03{
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