package javaexperiment.javatest2;
/*
编写一个Java应用程序。用户从键盘输入一个1—9999之间的数，
程序将判断这个数是几位数，并判断这个数是否是回文数。
回文数是指将该数含有的数字逆序排列后得到的数和原数相同，
例如12121、3223都是回文数。
 */

import javax.swing.JOptionPane;

public class PalindromeNumber {
    public static void main(String args[])
    {
        int number=0,d5,d4,d3,d2,d1;
        String str= JOptionPane.showInputDialog("输入一个1至99999之间的数");
        number=Integer.parseInt(str);
        if(number >= 1 && number <= 99999) //判断number在1至99999之间的条件
        {
            d5 = number/10000;// 【代码2】   //计算number的最高位（万位）d5
            d4 = number%10000/1000;//【代码3】   //计算number的千位d4
            d3 = number%1000/100;//【代码4】   //计算number的百位d3
            d2 = number%100/10;
            d1 = number%10;
            if(number >= 10000 && number <=99999)  //判断number是5位数的条件
            {
                System.out.println(number+"是5位数");
                if(d5 == d1 && d4 == d2) //判断number是回文数的条件
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(number >= 1000 && number <= 9999)  //判断number是4位数的条件
            {
                System.out.println(number+"是4位数");
                if(d4 == d1 && d3 == d2) //判断number是回文数的条件码
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(number >= 100 && number <= 999)  //判断number是3位数的条件
            {
                System.out.println(number+"是3位数");
                if(d3 == d1) //判断number是回文数的条件
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d2!=0)
            {
                System.out.println(number+"是2位数");
                if(d1==d2)
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d1!=0)
            {
                System.out.println(number+"是1位数");
                System.out.println(number+"是回文数");
            }
        }
        else
        {
            System.out.printf("\n%d不在1至99999之间",number);
        }
    }
}
