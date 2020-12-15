package com.hyb.java1.test1;
/*
构造函数
 */
public class Person {

    String name;
    int age;

  /*  public Person(){

    }
    public Person(String name,int age){
        System.out.println("姓名是"+name+"年龄是"+"age");
    }

    public String getName() {
        return name;
    }*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

class Test {
    public static void main(String[] args) {
        Person p = new Person("aabc",18);
    }
}