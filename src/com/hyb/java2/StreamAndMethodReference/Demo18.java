package com.hyb.java2.StreamAndMethodReference;

/*
    类的构造器(构造方法)引用
 */
public class Demo18 {
    //定义一个方法,参数传递姓名和PersonBuilder接口,方法中通过姓名创建Person对象
    public static void printName(String name,PersonBuilder pb){
        Person1 person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //调用printName方法,方法的参数PersonBuilder接口是一个函数式接口,可以传递Lambda
        printName("迪丽热巴",(String name)->{
            return new Person1(name);
        });

        /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name) 已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        printName("古力娜扎", Person1::new);//使用Person类的带参构造方法,通过传递的姓名创建对象
    }
}
/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
interface PersonBuilder {
    //定义一个方法,根据传递的姓名,创建Person对象返回
    Person1 builderPerson(String name);
}

class Person1 {
    private String name;

    public Person1() {
    }

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
