package com.imooc.demo;

/**
 * Created by xiongpc on 2017/7/28.
 */
public class InnerClassDemo {

    public class Inner{
         public void show(){
             System.out.println("welcome to imooc");
         }
    }

    /*
        内部类 作用
            1.内部类提供更好的封装，不允许同一个包中的其他类访问该类
            2.内部类的方法可以访问外部类的全部数据，包括私有数据
        内部类种类
            成员内部类
            静态内部类
                只可以访问外部类的静态成员和方法（包括私有的）
            方法内部类
            匿名内部类
                隐藏的继承一个父类或者实现了一个接口
     */
    public static void main(String[] args) {
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        Inner inner = innerClassDemo.new Inner();
        inner.show();

    }
}
