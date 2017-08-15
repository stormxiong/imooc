package com.imooc.jdkproxy;

import java.util.Random;

/**
 * Created by xiongpc on 2017/8/15.
 */
public class Car implements IMoveable {
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
