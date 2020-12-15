package com.hyb.java2.generic;

/*
    定义一个含有泛型的类,模拟ArrayList集合
    泛型是一个未知的数据类型,当我们不确定什么什么数据类型的时候,可以使用泛型
    泛型可以接收任意的数据类型,可以使用Integer,String,Student...
    创建对象的时候确定泛型的数据类型
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
class DemoGenericClass {
    public static void main(String[] args) {

        //不写泛型默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //创建GenericClass对象,泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

        //创建GenericClass对象,泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小明");
        String name1 = gc3.getName();
        System.out.println(name1);
    }
}