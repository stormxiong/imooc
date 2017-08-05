package com.imooc.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by xiongpc on 2017/8/5.
 */
public class RafDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("rafdemo");
        if (!file.exists()){
            file.mkdir();
        }
        File file1 = new File(file,"raf.dat");
        if (!file1.exists()){
            file1.createNewFile();
        }

        RandomAccessFile randomAccessFile = new RandomAccessFile(file1,"rw");
        //指针的位置
        System.out.println(randomAccessFile.getFilePointer());
        randomAccessFile.write('A');
        System.out.println(randomAccessFile.getFilePointer());
        randomAccessFile.write('B');

        int i= 0x7fffffff;
        randomAccessFile.write(i >>>24);//高8位
        randomAccessFile.write(i >>>16);
        randomAccessFile.write(i >>>8);
        randomAccessFile.write(i);
        System.out.println(randomAccessFile.getFilePointer());

        randomAccessFile.writeInt(i);//直接写一个int

        String str = "中";
        byte[] gbk = str.getBytes("gbk");
        randomAccessFile.write(gbk);
        System.out.println(randomAccessFile.getFilePointer());

        //读文件 将指针移到头部
        randomAccessFile.seek(0);
        //一次性读取
        byte[] buf = new byte[(int) randomAccessFile.length()];
        randomAccessFile.read(buf);
        System.out.println(Arrays.toString(buf));
        randomAccessFile.close();
    }
}
