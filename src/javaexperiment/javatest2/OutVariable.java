package javaexperiment.javatest2;
/*
编写一个Java应用程序，该程序在命令行窗口输出各种类型的变量。
 */
public class OutVariable {
    public static void main(String[] args){
        byte b = 85;
        short s = 22015;
        int i = 1000000;
        long l = 65315;
        char c = 'a';
        float f = 0.23f;
        double d = 7.0E-4;
        boolean B = true;
        String S = "这是字符串类型数据";
        System.out.println("字节型变量 b = "+b);
        System.out.println("短整型变量 s = "+s);
        System.out.println("整型变量 i = "+i);
        System.out.println("长整型变量 l = "+l);
        System.out.println("字符型变量 c = "+c);
        System.out.println("浮点型变量 f = "+f);
        System.out.println("双精度型变量  d = "+d);
        System.out.println("布尔型变量 B = "+B);
        System.out.println("字符串型变量 S = "+S);
    }
}
