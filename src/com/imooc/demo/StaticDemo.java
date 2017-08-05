package com.imooc.demo;

/**
 * Created by xiongpc on 2017/7/28.
 */
public class StaticDemo {
    String name;
    String  sex;
    static int age;

    //构造方法
    public StaticDemo(){
        System.out.println("通过构造方法初始化name");
        name =  "tom";
    }
    //初始化块
    {
        System.out.println("通过初始化块初始化sex");
        sex = "女";

    }
    //静态初始化块
    static {
        System.out.println("通过静态初始化块初始化age");
        age = 18;
    }

    public void show(){
        System.out.println("姓名："+name+" 性别："+sex+" 年龄："+age);
    }

    public static void main(String[] args) {
        //System.out.println();
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.show();
        StaticDemo staticDemo2 = new StaticDemo();
        //staticDemo2.show();
    }


}
