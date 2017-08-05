package com.imooc.demo;

/**
 * Created by xiongpc on 2017/8/2.
 */
public class CellPhone extends Telephone1 {
    @Override
    void call() {
        System.out.println("可以打电话");
    }

    @Override
    void message() {
        System.out.println("可以发信息");
    }
}
