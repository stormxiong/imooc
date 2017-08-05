package com.imooc.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by xiongpc on 2017/8/3.
 */
public class StringDemo {
    public static void main(String[] args) {

        String fileName = "HelloWorld.java";
        String email = "luorenyang@imooc.com";

        int index = fileName.lastIndexOf(".");
        String prefix = fileName.substring(index+1);

        System.out.println(index);
        System.out.println(prefix);
        if (index>0 && prefix.endsWith("java")){
            System.out.println("java文件名正确");
        }else {
            System.out.println("java文件名不正确");
        }

        StringDemo stringDemo = new StringDemo();
       // int result = staticDemo
        int i = stringDemo.test1();
        System.out.println(i);
        stringDemo.test2();
    }

    public int  test1(){
        String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
        int num=0;
        for (int i=0;i<s.length();i++){
            //char c = s.charAt(i);
            if ('a'==s.charAt(i)){
                num++;
            }
        }
        return  num;
    }

    public void  test2(){
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        Long time = c.getTimeInMillis();
        //date.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String string = simpleDateFormat.format(date);
        System.out.println("当前时间是："+string);
    }
}
