package javaexperiment.javatest4;
/*
处理大整数。
实验要求：
    编写一个Java应用程序，计算两个大整数的和、差、积和商，并计算一个大整数的因子个数（因子中不包括1和大整数本身）。
    填写用方括号括起来的代码块，使程序能正确地编译、运行。
 */
import java.math.*;
public class BigIntegerExample
{
    public static void main(String args[])
    {   BigInteger n1=new BigInteger("987654321987654321987654321"),
            n2=new BigInteger("123456789123456789123456789"),
            result=null;
        result=n1.add(n2);//n1和n2做加法运算
        System.out.println("和:"+result.toString());
        result=n1.subtract(n2);//n1和n2做减法运算
        System.out.println("差:"+result.toString());
        result=n1.multiply(n2);//n1和n2做乘法运算
        System.out.println("积:"+result.toString());
        result=n1.divide(n2);//n1和n2做除法运算
        System.out.println("商:"+result.toString());
        BigInteger m=new BigInteger("1968957"),
                COUNT=new BigInteger("0"),
                ONE=new BigInteger("1"),
                TWO=new BigInteger("2");
        System.out.println(m.toString()+"的因子有:");
        for(BigInteger i=TWO;i.compareTo(m)<0;i=i.add(ONE)) {
            if((n1.remainder(i).compareTo(BigInteger.ZERO))==0) {
                COUNT=COUNT.add(ONE);
                System.out.print("  "+i.toString());
            }
        }
        System.out.println("");
        System.out.println(m.toString()+"一共有"+COUNT.toString()+"个因子");

        System.out.println("---------------------------");
        //1. 编写程序，计算大整数的阶乘。
        BigInteger che = new BigInteger("68"),mu = new BigInteger("1");
        for(BigInteger i = BigInteger.ONE;i.compareTo(che)<=0;i = i.add(BigInteger.ONE)){
            mu = mu.multiply(i);
        }
        System.out.println(che+"的阶乘是:\n"+mu);

        System.out.println("---------------------------");
        //2. 编写程序，计算1+2+3…的前999999999项的和。
        BigInteger n = new BigInteger("999999999"),num = new BigInteger("0");
        for(BigInteger j = BigInteger.ONE;j.compareTo(n)<=0;j = j.add(BigInteger.ONE)){
            num = num.add(j);
        }
        System.out.println("1+2+3+...的前999999999项的和是:\n"+num);

    }
}
