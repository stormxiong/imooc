package com.imooc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by xiongpc on 2017/8/6.
 */
public class IOUtil {

    public static void main(String[] args) {
        try {
            //printHexByByteArray("e://javaio//AndroidPushBatchUniMsg.java");
            copyFile(new File("e:\\javaio\\imooc.txt"),new File("e:\\javaio\\imocc1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取指定文件内容，按照16进制输出到控制台，每输出10个换行
     * @param fileName
     */
    public static void printHex(String fileName) throws IOException{

        //把文件作为字节流
        FileInputStream in = new FileInputStream(fileName);
        int b;
        int i=1;
        while ((b=in.read())!=-1){
            System.out.print(Integer.toHexString(b+0xff)+"  ");
            if (i++%10==0){
                System.out.println();
            }
        }
        in.close();
    }

    /**
     * 通过字节数组来读取
     * @param fileName
     * @throws IOException
     */
    public static void printHexByByteArray(String fileName) throws IOException{

        FileInputStream in = new FileInputStream(fileName);
        byte[] buf = new byte[8*1024];

        /**
         * 从in中批量读取字节，放入buf中，从0开始放，最多放buf.length个
         * 返回读到的字节的个数
         */
       /* int bytes = in.read(buf, 0, buf.length);//一次性读完，说明buf足够大
        int j = 1;
        for (int i = 0; i < bytes; i++) {
            if (buf[i] <= 0xf){
                System.out.print("0");
            }
            System.out.print(Integer.toHexString(buf[i])+" ");
            if (j++%10==0){
                System.out.println();
            }
        }*/
       int bytes;
       int j=1;
       while ((bytes=in.read(buf,0,buf.length))!=-1){
           for (int i = 0; i < bytes; i++) {
               System.out.print(Integer.toHexString(buf[i] & 0xff)+"  ");
               if (j++%10==0){
                   System.out.println();
               }
           }
       }
        in.close();
    }

    /**
     * 文件拷贝
     * @param srcFile
     * @param destFile
     * @throws IOException
     */
    public static void copyFile(File srcFile,File destFile) throws IOException{

        if (!srcFile.exists()){
            throw new IllegalArgumentException("文件:"+srcFile+"不存在");
        }

        if (!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+"不是文件");
        }

        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(destFile);



        byte[] buf = new byte[8 * 1024];
        int b;
        while ((b=in.read(buf,0,buf.length))!=-1){
            out.write(buf,0,b);
            out.flush();
        }
        out.close();
        in.close();
    }
}
