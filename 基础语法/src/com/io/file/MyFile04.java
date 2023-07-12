package com.io.file;

import java.io.File;
import java.io.IOException;

/**
 * 作者：whl
 * 日期：2023-07-12 14:35
 * 描述：案例2-文件存在就删除，不存在就创建
 */
public class MyFile04 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\aa\\bb\\cc\\dd.txt");//目录D:\aa\bb\cc不一定存在

        //判断文件/文件夹是否存在
        if (file.exists()){
            file.delete();
        }else {
            //获得父级文件夹
            File parentFile = file.getParentFile();
            if (!parentFile.exists()){
//                parentFile.mkdir();//创建一个目录(文件夹)
                parentFile.mkdirs();//创建多个目录(文件夹)
            }
            file.createNewFile();//创建文件
        }

    }

}
