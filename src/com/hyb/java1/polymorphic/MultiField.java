package com.hyb.java1.polymorphic;
/*
访问成员变量的两种方式：

1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
2. 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
 */
public class MultiField {
    public static void main(String[] args) {
        // 使用多态的写法，父类引用指向子类对象
        Fu1 obj = new Zi1();
        System.out.println(obj.num); // 父：10
//        System.out.println(obj.age); // 错误写法！
        System.out.println("=============");

        // 子类没有覆盖重写，就是父：10
        // 子类如果覆盖重写，就是子：20
        obj.showNum();
    }
}
class Fu1 /*extends Object*/ {

    int num = 10;

    public void showNum() {
        System.out.println(num);
    }
}
class Zi1 extends Fu1 {

    int num = 20;

    int age = 16;

    @Override
    public void showNum() {
        System.out.println(num);
    }
}