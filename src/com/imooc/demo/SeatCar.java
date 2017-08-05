package com.imooc.demo;

/**
 * Created by xiongpc on 2017/8/2.
 */
public class SeatCar extends Car {

    public SeatCar(int id, String name, int seat, double price) {
        super(id, name, seat, 0, price);
    }

    @Override
    public String toString() {
        return id + ".\t" + name + "\t" + seat + "\t" + load + "\t" + price;
    }
}
