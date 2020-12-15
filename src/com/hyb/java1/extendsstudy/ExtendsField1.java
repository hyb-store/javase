package com.hyb.java1.extendsstudy;

/*
局部变量：         直接写成员变量名
本类的成员变量：    this.成员变量名
父类的成员变量：    super.成员变量名
 */

public class ExtendsField1 {
    public static void main(String[] args) {
        Zi1 zi1 = new Zi1();

        zi1.method();
    }
}

class Zi1 extends Fu1 {

    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num); // 30，局部变量
        System.out.println(this.num); // 20，本类的成员变量
        System.out.println(super.num); // 10，父类的成员变量
    }
}

class Fu1 {

    int num = 10;

}
