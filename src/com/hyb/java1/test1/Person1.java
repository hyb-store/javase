package com.hyb.java1.test1;
/*
标准的类
*/
public class Person1{
    private String name;
    private int age;

    public Person1(){

    }
    public Person1(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class test1 {
    public static void main(String[] args){
        Person1 per = new Person1();
        per.setName("abcd");
        per.setAge(26);
        System.out.println("name:"+per.getName()+",age:"+per.getAge());
        per.setAge(39);
        System.out.println("name:"+per.getName()+",age:"+per.getAge());
    }
}
