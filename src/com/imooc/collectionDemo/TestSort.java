package com.imooc.collectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by xiongpc on 2017/8/4.
 */
public class TestSort {
    public static void main(String[] args) {

        //List<Integer> integerList = new ArrayList<>();
        //Random random = new Random();
        //Integer k;
        //for (int i=0;i<10;i++){
        //    do {
        //        k = random.nextInt(100);
        //    }while (integerList.contains(k));
        //    integerList.add(k);
        //    System.out.println("成功添加整数:"+k);
        //}
        //System.out.println("----------------排序前------------------");
        //for (Integer integer : integerList){
        //    System.out.println("元素:"+integer);
        //}
        //Collections.sort(integerList);
        //System.out.println("----------------排序后-------------------");
        //for (Integer integer: integerList){
        //    System.out.println("元素："+integer);
        //}
        //
        //String string = randomString();
        //System.out.println(string);

        List<Integer> list = new ArrayList<>();
        int k;
        for (int i=0;i<10;i++){
            do {
                k = i+10;
            }while (k<15);
            list.add(k);
            System.out.println("添加了数字："+k);
        }
    }

    public static String randomString(){
        String string = "1234567890ABCDERGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        char c = string.charAt(random.nextInt(string.length()));
        //Character character = Character.valueOf(c);
        return String.valueOf(c);
    }

    public static void testDoWhile(){
        List<Integer> list = new ArrayList<>();
        Integer k;
        //for (int i=0;i<10;i++){
        //    do {
        //        k = i+10;
        //    }while (k<15);
        //    list.add(k);
        //    System.out.println("添加了数字："+k);
        //}
    }
}
