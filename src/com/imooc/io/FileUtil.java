package com.imooc.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by xiongpc on 2017/8/5.
 */
public class FileUtil {

    public static void main(String[] args) throws IOException {
        listDirectory(new File("E:\\"));
    }

    public static void listDirectory(File dir) throws IOException{
        if (!dir.exists()){
            throw new IllegalArgumentException("目录:"+dir+"不存在");
        }
        if (!dir.isDirectory()){
            throw new IllegalArgumentException(dir+"不是目录");
        }

        //String[] fileNames = dir.list();
        //for (String s:fileNames){
        //    System.out.println(s);
        //}
        //循环遍历文件夹
        File[] listFiles = dir.listFiles();
        if (listFiles!=null && listFiles.length>0){
            for (File file :listFiles){
                if (file.isDirectory()){
                    listDirectory(file);
                }else {
                    System.out.println(file);
                }
            }
        }
    }
}
