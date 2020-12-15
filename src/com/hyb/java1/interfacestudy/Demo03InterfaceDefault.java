package com.hyb.java1.interfacestudy;

//以使用 super 来调用指定接口的默认方法：

public class Demo03InterfaceDefault{
    public static void main(String args[]){
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}

interface Vehicle {
    default void print(){
        System.out.println("我是一辆车!");
    }

    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}

interface FourWheeler {
    default void print(){
        System.out.println("我是一辆四轮车!");
    }
}

class Car implements Vehicle, FourWheeler {
    public void print(){
        //以使用 super 来调用指定接口的默认方法：
        Vehicle.super.print();
        FourWheeler.super.print();

        Vehicle.blowHorn();
        System.out.println("我是一辆汽车!");
    }
}