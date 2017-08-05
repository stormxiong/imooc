package com.imooc.demo;

/**
 * Created by xiongpc on 2017/8/2.
 */
public class LoadCar extends Car {

    public LoadCar(int id, String name, double load, double price) {
        super(id, name, 0, load, price);
    }

    @Override
    public String toString() {
         return id + ".\t" + name + "\t" + seat + "\t" + load + "\t" + price;
    }
}
