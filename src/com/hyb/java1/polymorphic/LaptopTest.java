package com.hyb.java1.polymorphic;
/*
笔记本电脑(laptop) 通常具备使用USB设备的功能。在生产时,笔记本都预留了可以插入USB设备的USB接口,
但具体是什么USB设备，笔记本厂商并不关心，只要符合USB规格的设备都可以。
定义USB接口，具备最基本的开启功能和关闭功能。鼠标和键盘要想能在电脑上使用，那么鼠标和键盘也必须遵守
USB规范,实现USB接口,否则鼠标和键盘的生产出来也无法使用。
案例分析：
进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘
●USB接口,包含打开设备功能、关闭设备功能
●笔记本类,包含开机功能、关机功能、使用USB设备功能
●鼠标类，要实现USB接口，并具备点击的方法
●键盘类,要实现USB接口，具备敲击的方法

 */
public class LaptopTest {
    public static void main(String[] args) {
        // 首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        // 准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        // 首先进行向上转型
        USB usbMouse = new Mouse(); // 多态写法
        // 参数是USB类型，我正好传递进去的就是USB鼠标
        computer.useDevice(usbMouse);

        // 创建一个USB键盘
        Keyboard keyboard = new Keyboard(); // 没有使用多态写法
        // 方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard); // 正确写法！也发生了向上转型
        // 使用子类对象，匿名对象，也可以
//        computer.useDevice(new Keyboard()); // 也是正确写法

        computer.powerOff();
        System.out.println("==================");

        method(10.0); // 正确写法，double --> double
        method(20); // 正确写法，int --> double
        int a = 30;
        method(a); // 正确写法，int --> double
    }

    public static void method(double num) {
        System.out.println(num);
    }

}
class Computer {

    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    // 使用USB设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb) {
        usb.open(); // 打开设备
        if (usb instanceof Mouse) { // 一定要先判断
            Mouse mouse = (Mouse) usb; // 向下转型
            mouse.click();
        } else if (usb instanceof Keyboard) { // 先判断
            Keyboard keyboard = (Keyboard) usb; // 向下转型
            keyboard.type();
        }
        usb.close(); // 关闭设备
    }

}

interface USB {

    public abstract void open(); // 打开设备

    public abstract void close(); // 关闭设备

}


// 键盘就是一个USB设备
class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("键盘输入");
    }
}

// 鼠标就是一个USB设备
class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}