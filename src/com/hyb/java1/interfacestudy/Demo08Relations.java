package com.hyb.java1.interfacestudy;

/*
1. 类与类之间是单继承的。直接父类只有一个。
2. 类与接口之间是多实现的。一个类可以实现多个接口。
3. 接口与接口之间是多继承的。

注意事项：
1. 多个父接口当中的抽象方法如果重复，没关系。
2. 多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，【而且带着default关键字】。
 */

public class Demo08Relations {
    public static void main(String[] args) {

        MyInterfaceImpl iml = new MyInterfaceImpl();
        iml.method();
        iml.methodA();
        iml.methodB();
        iml.methodCommon();
        iml.methodDefault();

    }
}

/*
这个子接口当中有几个方法？答：4个。
methodA 来源于接口A
methodB 来源于接口B
methodCommon 同时来源于接口A和B
method 来源于我自己
 */
interface MyInterface1 extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    @Override
    public default void methodDefault() {
        System.out.println("AAABBB");

    }
}
interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("AAA");
    }

}
interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("BBB");
    }

}
class MyInterfaceImpl implements MyInterface1 {
    @Override
    public void method() {

    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodCommon() {

    }
}