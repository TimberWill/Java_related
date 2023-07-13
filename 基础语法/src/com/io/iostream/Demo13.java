package com.io.iostream;

import java.io.*;

/**
 * 作者：whl
 * 日期：2023-07-13 22:45
 * 描述：数据流
 */
public class Demo13 {
    public static void main(String[] args) throws IOException {

        //1. 创建字节流读入对象，数据流读入对象
        FileInputStream inputStream = new FileInputStream("D:\\WHL\\a.txt");
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        //2. 读取文件
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readUTF());
        System.out.println(dataInputStream.readBoolean());

    }

    private static void w() throws IOException {
        int a = 6;
        String b = "ok";
        boolean c = true;

        //1. 创建字节流对象、数据流对象
        FileOutputStream outputStream = new FileOutputStream("D:\\WHL\\a.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        //2. 往文件中写内容
        dataOutputStream.writeInt(a);
        dataOutputStream.writeUTF(b);
        dataOutputStream.writeBoolean(c);

        //3. 关闭流
        dataOutputStream.close();
    }
}
