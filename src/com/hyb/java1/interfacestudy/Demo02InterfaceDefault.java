package com.hyb.java1.interfacestudy;

/*
从Java 8开始，接口里允许定义默认方法。
格式：
public default 返回值类型 方法名称(参数列表) {
    方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题。
 */
interface InterfaceDefault {

    // 抽象方法
    public abstract void methodAbs();

    // 新添加了一个抽象方法
//    public abstract void methodAbs2();

    // 新添加的方法，改成默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }

}
class InterfaceDefaultA implements InterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，AAA");
    }
}
class InterfaceDefaultB implements InterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}

/*
1. 接口的默认方法，可以通过接口实现类对象，直接调用。
2. 接口的默认方法，也可以被接口实现类进行覆盖重写。
 */
public class Demo02InterfaceDefault {

    public static void main(String[] args) {
        // 创建了实现类对象
        InterfaceDefaultA a = new InterfaceDefaultA();
        a.methodAbs(); // 调用抽象方法，实际运行的是右侧实现类。

        // 调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault(); // 这是新添加的默认方法
        System.out.println("==========");

        InterfaceDefaultB b = new InterfaceDefaultB();
        b.methodAbs();
        b.methodDefault(); // 实现类B覆盖重写了接口的默认方法
    }

}
