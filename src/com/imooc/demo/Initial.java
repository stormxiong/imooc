package com.imooc.demo;

import java.util.Scanner;

/**
 * Created by xiongpc on 2017/8/2.
 */
public class Initial {
    public static void main(String[] args) {
        int totalSeat = 0;
        double totalLoad = 0.0;
        double totalPrice = 0.0;
        String loadCarList = "";//载重车辆
        String seatCarList = "";//载人车辆

        Car[] carArr = new Car[5];
        carArr[0] = new SeatCar(1,"奥迪A4L",4,500.0);
        carArr[1] = new SeatCar(2,"马自达6",4,300);
        carArr[2] = new Car(3,"铃木皮卡",4,2,400);
        carArr[3] = new LoadCar(4,"松花江",4,700);
        carArr[4] = new LoadCar(5,"依维何",7,900);

        System.out.println("欢迎使用租车系统");
        System.out.println("是否租车：1是 2否");

        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1){
            System.out.println("目前可选车辆");
            System.out.println("序号\t汽车名称\t载人（人）\t载货（吨）\t租金（元/天）");
            for (Car car:carArr){
                System.out.println(car);
            }
        }
    }
}
