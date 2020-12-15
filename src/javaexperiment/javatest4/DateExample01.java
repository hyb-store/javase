package javaexperiment.javatest4;
/*
比较日期的大小。
    编写一个Java应用程序，用户从输入对话框输入了两个日期，程序将判断两个日期的大小关系，以及两个日期之间的间隔天数。
     练习：
        1. Calendar对象可以将时间设置到年、月、日、时、分、秒。请改进上面的程序，使用户输入的两个日期包括时、分、秒。
        2. 根据本程序中的一些知识，编写一个计算利息（按天计算）的程序。从输入对话框输入存款的数目和起止时间
 */
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class DateExample01
{
    public static void main(String args[ ]) {

        String str=JOptionPane.showInputDialog("输入存款年份:");
        int yearOne=Integer.parseInt(str);
        str=JOptionPane.showInputDialog("输入存款的月份:");
        int monthOne=Integer.parseInt(str);
        str=JOptionPane.showInputDialog("输入存款月份的日期:");
        int dayOne=Integer.parseInt(str);

        str=JOptionPane.showInputDialog("输入存款金额");
        int money=Integer.parseInt(str);

        str=JOptionPane.showInputDialog("输入截止的年份:");
        int yearTwo=Integer.parseInt(str);
        str=JOptionPane.showInputDialog("输入截止的月份:");
        int monthTwo=Integer.parseInt(str);
        str=JOptionPane.showInputDialog("输入截止月份的日期:");
        int dayTwo=Integer.parseInt(str);

        Calendar calendar=Calendar.getInstance();

        calendar.set(yearOne,monthOne,dayOne);
        long timeOne=calendar.getTime().getTime();

        calendar.set(yearTwo,monthTwo,dayTwo);
        long timeTwo=calendar.getTime().getTime();
        Date date1=new Date(timeOne);
        Date date2=new Date(timeTwo);

        long days=Math.abs(timeOne-timeTwo)/1000/60/60/24;
        double rate = 0.01;
        long interest = (long) (rate*days*money);
        long total = money+interest;
        System.out.println(yearOne+"年"+monthOne+"月"+dayOne+"日和"
                +yearTwo+"年"+monthTwo+"月"+dayTwo+"日\n"+"相隔"+days+"天"+"\n"
                +"本金:"+money+" 利率:"+rate+" 利息:"+interest+" \n总共:"+total);
    }
}
