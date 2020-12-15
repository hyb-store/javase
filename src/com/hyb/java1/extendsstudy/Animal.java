package com.hyb.java1.extendsstudy;

// 最高的抽象父类
public abstract class Animal {

    public abstract void eat();

    public abstract void sleep();

}
class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // 错误！

//        Dog dog = new Dog(); // 错误，这也是抽象类

        Dog2Ha ha = new Dog2Ha(); // 这是普通类，可以直接new对象。
        ha.eat();
        ha.sleep();
        System.out.println("==========");

        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
    }


}
abstract class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // public abstract void sleep();
}

class Dog2Ha extends Dog {
    @Override
    public void sleep() {
        System.out.println("嘿嘿嘿……");
    }
}
class DogGolden extends Dog {
    @Override
    public void sleep() {
        System.out.println("呼呼呼……");
    }
}
