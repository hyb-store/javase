package com.hyb.java2.FunctionalInterface;

/*
    函数式接口:有且只有一个抽象方法的接口,称之为函数式接口
    当然接口中可以包含其他的方法(默认,静态,私有)

    @FunctionalInterface注解
    作用:可以检测接口是否是一个函数式接口
        是:编译成功
        否:编译失败(接口中没有抽象方法抽象方法的个数多余1个)
 */
@FunctionalInterface
public interface Demo01MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();
}

/*
    @Override注解
    检查方法是否为重写的方法
        是:编译成功
        否:编译失败
 */
class Demo01MyFunctionalInterfaceImpl implements Demo01MyFunctionalInterface {
    @Override
    public void method() {

    }

    /*@Override
    public void method2() {

    }*/

    /*@Override
    public void method3() {

    }*/
}
/*
    函数式接口的使用:一般可以作为方法的参数和返回值类型
 */
class Demo {
    //定义一个方法,参数使用函数式接口MyFunctionalInterface
    public static void show(Demo01MyFunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法,方法的参数是一个接口,所以可以传递接口的实现类对象
        show(new Demo01MyFunctionalInterfaceImpl());

        //调用show方法,方法的参数是一个接口,所以我们可以传递接口的匿名内部类
        show(new Demo01MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        //调用show方法,方法的参数是一个函数式接口,所以我们可以Lambda表达式
        show(()->{
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });

        //简化Lambda表达式
        show(()-> System.out.println("使用Lambda表达式重写接口中的抽象方法"));
    }
}
