package javaexperiment.javatest4;
/*
比较日期的大小。
    编写一个Java应用程序，用户从输入对话框输入了两个日期，程序将判断两个日期的大小关系，以及两个日期之间的间隔天数。
     练习：
        1. Calendar对象可以将时间设置到年、月、日、时、分、秒。请改进上面的程序，使用户输入的两个日期包括时、分、秒。
        2. 根据本程序中的一些知识，编写一个计算利息（按天计算）的程序。从输入对话框输入存款的数目和起止时间
 */
import java.util.*;
import javax.swing.JOptionPane;
public class DateExample
{
    public static void main(String args[ ]) {

        String str=JOptionPane.showInputDialog("输入第一个日期的年份:");
        int yearOne=Integer.parseInt(str);
        str=JOptionPane.showInputDialog("输入该年的月份:");
        int monthOne=Integer.parseInt(str);
        str=JOptionPane.showInputDialog("输入该月份的日期:");
        int dayOne=Integer.parseInt(str);

//        str=JOptionPane.showInputDialog("输入该月份的时:");
//        int h1=Integer.parseInt(str);
//        str=JOptionPane.showInputDialog("输入该月份的分:");
//        int m1=Integer.parseInt(str);
//        str=JOptionPane.showInputDialog("输入该月份的秒:");
//        int s1=Integer.parseInt(str);

        str=JOptionPane.showInputDialog("输入第二个日期的年份:");
        int yearTwo=Integer.parseInt(str);
        str=JOptionPane.showInputDialog("输入该年的月份:");
        int monthTwo=Integer.parseInt(str);
        str=JOptionPane.showInputDialog("输入该月份的日期:");
        int dayTwo=Integer.parseInt(str);

//        str=JOptionPane.showInputDialog("输入该月份的时:");
//        int h2=Integer.parseInt(str);
//        str=JOptionPane.showInputDialog("输入该月份的分:");
//        int m2=Integer.parseInt(str);
//        str=JOptionPane.showInputDialog("输入该月份的秒:");
//        int s2=Integer.parseInt(str);

        Calendar calendar=Calendar.getInstance();   //初始化日历对象

//        calendar.set(yearOne,monthOne,dayOne,h1,m1,s1);      //将calendar的时间设置为yearOne年monthOne月dayOne日
        calendar.set(yearOne,monthOne,dayOne);      //将calendar的时间设置为yearOne年monthOne月dayOne日
        long timeOne=calendar.getTime().getTime();  //calendar表示的时间转换成毫秒

//        calendar.set(yearTwo,monthTwo,dayTwo,h2,m2,s2);      //将calendar的时间设置为yearTwo年monthTwo月dayTwo日
        calendar.set(yearTwo,monthTwo,dayTwo);      //将calendar的时间设置为yearTwo年monthTwo月dayTwo日
        long timeTwo=calendar.getTime().getTime();  //calendar表示的时间转换成毫秒。

        Date date1=new Date(timeOne);               // 用timeOne做参数构造date1
        Date date2=new Date(timeTwo);               // 用timeTwo做参数构造date2
        if(date2.equals(date1)) {
            System.out.println("两个日期的年、月、日完全相同");
        } else if(date2.after(date1)) {
            System.out.println("您输入的第二个日期大于第一个日期");
        } else if(date2.before(date1)) {
            System.out.println("您输入的第二个日期小于第一个日期");
        }
        long days=Math.abs(timeOne-timeTwo)/1000/60/60/24;//计算两个日期相隔天数
//        long hours=Math.abs(timeOne-timeTwo)/1000/60/60%24 ;
//        long min =Math.abs(timeOne-timeTwo)/1000/60%60 ;
//        long s =Math.abs(timeOne-timeTwo)/1000%60 ;
//        System.out.println(yearOne+"年"+monthOne+"月"+dayOne+"日"+h1+"时"+m1+"分"+s1+"秒"
//                +yearTwo+"年"+monthTwo+"月"+dayTwo+"日"+h2+"时"+m2+"分"+s2+"秒"+"  相隔"+days+"天"
//                +hours+"时"+min+"分"+s+"秒");
        System.out.println(yearOne+"年"+monthOne+"月"+dayOne+"日和"
                +yearTwo+"年"+monthTwo+"月"+dayTwo+"相隔"+days+"天");
    }
}
