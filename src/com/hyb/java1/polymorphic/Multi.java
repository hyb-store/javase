package com.hyb.java1.polymorphic;
/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象。

格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();
 */
public class Multi {
    public static void main(String[] args) {
        // 使用多态的写法
        // 左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();
    }
}
class Fu {

    public void method() {
        System.out.println("父类方法");
    }

    public void methodFu() {
        System.out.println("父类特有方法");
    }

}
class Zi extends Fu {

    @Override
    public void method() {
        System.out.println("子类方法");
    }
}
