package com.imooc.demo;

/**
 * Created by xiongpc on 2017/7/28.
 */
public class HelloWorld {

    static String className = "开发班级";
    static int score1 = 86;
    static int score2 = 92;

    public  static  int sum(){
        return  score1+score2;
    }
    public static void main(String[] args) {
        int allScore = sum();
        System.out.println(HelloWorld.className);
        System.out.println("总分："+allScore);
    }
}
