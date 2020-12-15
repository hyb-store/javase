package com.hyb.java2.object.objects;
/*
Object类
toString（） 方法
A:作用：打印对象的信息
B :重写前:打印的是包名类名@地址值
C :重写后:打印的是对象中的属性值

 */
public class TestToString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);    //abc

        Student s = new Student("张三",12);
        //System.out.println(s);    //com.hyb.java2.object.objects.Student@14ae5a5
        System.out.println(s);      //Student{name='张三', age=12}
    }
}
