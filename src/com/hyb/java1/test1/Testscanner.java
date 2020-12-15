package com.hyb.java1.test1;

import java.util.Scanner;
/*
* scannner测试
* 两数相加
*/
public class Testscanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("a+b="+result);
    }
}
