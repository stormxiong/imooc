package com.imooc.demo;

/**
 * Created by xiongpc on 2017/8/2.
 */
public class Car {

    public int id;//序号
    public String name;//车名
    public int seat;//座位数
    public double load;//载重
    public  double price;//价格

    public Car(int id, String name, int seat, double load, double price) {
        this.id = id;
        this.name = name;
        this.seat = seat;
        this.load = load;
        this.price = price;
    }

    @Override
    public String toString() {
         return id + ".\t" + name + "\t" + seat + "\t" + load + "\t" + price;
    }
}
