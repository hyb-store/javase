package com.hyb.java2.FunctionalInterface;

import java.util.function.Consumer;

/*
    练习:
        字符串数组当中存有多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。
        要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
        将打印性别的动作作为第二个Consumer接口的Lambda实例，
        将两个Consumer接口按照顺序“拼接”到一起。
 */
public class Demo07Test {
    //定义一个方法,参数传递String类型的数组和两个Consumer接口,泛型使用String
    private static void printInfo(String[] array, Consumer<String> con1, Consumer<String> con2) {
        //遍历数组
        for (String message : array) {
            //使用andThen进行连接
            con1.andThen(con2).accept(message); // 姓名：迪丽热巴。性别：女。
        }
    }

    public static void main(String[] args) {
        //定义一个字符串数组
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};

        //传递字符串数组和两个Lambda表达式
        printInfo(array, (message) -> {
            //对message进行切割，按指定格式输出
            String name = message.split(",")[0];
            System.out.print("姓名:" + name);
        }, (message) -> {
            String sex = message.split(",")[1];
            System.out.println("性别:" + sex);
        });
    }
}

