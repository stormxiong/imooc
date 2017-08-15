package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by xiongpc on 2017/8/15.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler timeHandler = new TimeHandler(car);
        Class<?> cls = car.getClass();
        IMoveable o = (IMoveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), timeHandler);
        //o.move();
        InvocationHandler logHandler = new LogHandler(o);
        Class<?> cls1 = o.getClass();
        IMoveable o1 = (IMoveable) Proxy.newProxyInstance(cls1.getClassLoader(), cls1.getInterfaces(), logHandler);
        o1.move();
    }
}
