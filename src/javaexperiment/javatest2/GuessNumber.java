package javaexperiment.javatest2;
/*
编写一个Java应用程序，实现下列功能：
1)程序随机分配给客户一个1—100之间的整数
2)用户在输入对话框中输入自己的猜测
3)程序返回提示信息，提示信息分别是：“猜大了”、“猜小了”和“猜对了”。
用户可根据提示信息再次输入猜测，直到提示信息是“猜对了”
 */
import javax.swing.JOptionPane;
public class GuessNumber
{
    public static void main (String args[ ])
    {
        System.out.println("给你一个1至100之间的整数,请猜测这个数");
        int realNumber=(int)(Math.random()*100)+1;
        int yourGuess=0;
        String str=JOptionPane.showInputDialog("输入您的猜测:");
        yourGuess=Integer.parseInt(str);
        while(true) //循环条件
        {
            if(yourGuess > realNumber) //条件代码
            {
                str=JOptionPane.showInputDialog("猜大了,再输入你的猜测:");
                yourGuess=Integer.parseInt(str);
            }
            else if(yourGuess < realNumber) //条件代码
            {
                str=JOptionPane.showInputDialog("猜小了,再输入你的猜测:");
                yourGuess=Integer.parseInt(str);
            }
            else{
                System.out.println("猜对了！");
                break;
            }
        }
    }
}