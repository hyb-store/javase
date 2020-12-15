package com.hyb.java1.staticstudy;

/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 */

public class StaticField {

    public static void main(String[] args) {

        Student two = new Student("黄蓉", 16);
        two.room = "101教室";
        System.out.println("姓名：" + two.getName()
                + "，年龄：" + two.getAge() + "，教室：" + two.room
                + "，学号：" + two.getId());

        Student one = new Student("郭靖", 19);
        System.out.println("姓名：" + one.getName()
                + "，年龄：" + one.getAge() + "，教室：" + one.room
                + "，学号：" + one.getId());
    }

}

class Student {

    private int id; // 学号
    private String name; // 姓名
    private int age; // 年龄
    static String room; // 所在教室
    private static int idCounter = 0; // 学号计数器，每当new了一个新对象的时候，计数器++

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
