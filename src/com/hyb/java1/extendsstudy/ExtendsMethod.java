package com.hyb.java1.extendsstudy;

/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找。

注意事项：
无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。

重写（Override）
概念：在继承关系当中，方法的名称一样，参数列表也一样。

重写（Override）：方法的名称一样，参数列表【也一样】。覆盖、覆写。
重载（Overload）：方法的名称一样，参数列表【不一样】。

方法的覆盖重写特点：创建的是子类对象，则优先用子类方法。
 */
public class ExtendsMethod {

    public static void main(String[] args) {
        Zi2 zi2 = new Zi2();

        zi2.methodFu();
        zi2.methodZi();

        // 创建的是new了子类对象，所以优先用子类方法
        zi2.method();
    }
}

class Fu2 {

    public void methodFu() {
        System.out.println("父类方法执行！");
    }

    public void method() {
        System.out.println("父类重名方法执行！");
    }

}

class Zi2 extends Fu2 {

    public void methodZi() {
        System.out.println("子类方法执行！");
    }

    public void method() {
        System.out.println("子类重名方法执行！");
    }

}
