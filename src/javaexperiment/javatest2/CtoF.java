package javaexperiment.javatest2;
/*
使用循环语句，按5 度的增量打印出一个从摄氏温度到华氏温度的转换表。
 */
public class CtoF {
    public static void main(String[] args){
        double F;
        for(int i = 0;i <= 100;i=i+5){
            F = 32 + i*1.8;
            System.out.println("摄氏度:"+i+"°C=="+"华氏度:"+F+"°F");
        }
    }
}

