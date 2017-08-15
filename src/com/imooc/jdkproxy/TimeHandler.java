package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xiongpc on 2017/8/15.
 */
public class TimeHandler implements InvocationHandler {
    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行使.....");
        method.invoke(target);
        long endTimes = System.currentTimeMillis();
        System.out.println("汽车行使结束，时间为："+(endTimes-startTime)+"毫秒");
        return null;
    }
}
