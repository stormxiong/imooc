package com.imooc.io;

/**
 * Created by xiongpc on 2017/8/5.
 */
public class EncodeDemo {

    public static void main(String[] args) throws Exception{

        String str = "慕课网ABC";
        byte[] bytes = str.getBytes();
        for (byte b:bytes){
            System.out.print(Integer.toHexString(b & 0xff)+ " ");
        }

        System.out.println();
        byte[] bytes1 = str.getBytes("gbk");
        for (byte b:bytes1){
            System.out.print(Integer.toHexString(b& 0xff)+" ");
        }
        System.out.println();
        byte[] bytes2 = str.getBytes("utf-16be");
        for (byte b : bytes2){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();
        String string = new String(bytes1);
        System.out.println(string);
        String string1 = new String(bytes1,"gbk");
        System.out.println(string1);
    }
}
