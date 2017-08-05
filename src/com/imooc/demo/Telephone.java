package com.imooc.demo;

/**
 * Created by xiongpc on 2017/7/28.
 */
public class Telephone {

    public Telephone(){
        System.out.println("构造方法执行了");
    }
    private float screen;
    float cpu;
    float mem;
    int var = 5 ;

    void call(){
        int var = 10;
        System.out.println("var:"+var);
        System.out.println("打电话");
    }

    void sendMessage(){
        int var = 15;
        System.out.println("var:"+var);
        System.out.println("cpu:"+cpu+"screen:"+screen+"发信息");
    }

    public static void main(String[] args) {
        Telephone telephone = new Telephone();
        telephone.sendMessage();
        telephone.cpu = 1.4f;
        telephone.screen = 5.0f;
        telephone.mem = 3f;
        telephone.sendMessage();

        telephone.call();

    }
}
