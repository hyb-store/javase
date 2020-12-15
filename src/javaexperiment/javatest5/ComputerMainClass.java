package javaexperiment.javatest5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Teacher {
    int numberOne,numberTwo;
    String operator="";
    boolean right;
    public int giveNumberOne(int n) {
        numberOne=(int)(Math.random()*n)+1;
        return numberOne;
    }
    public int giveNumberTwo(int n) {
        numberTwo=(int)(Math.random()*n)+1;
        return numberTwo;
    }
    public String giveOperator() {
        double d=Math.random();
        if(d>=0.5)
            operator="+";
        else
            operator="-";
        return operator;
    }
    public boolean getRight(int answer) {
        if(operator.equals("+")) {
            if(answer==numberOne+numberTwo)
                right=true;
            else
                right=false;
        }
        else if(operator.equals("-")) {
            if(answer==numberOne-numberTwo)
                right=true;
            else
                right=false;
        }
        return right;
    }
}

class ComputerFrame extends Frame implements ActionListener {
    TextField textOne,textTwo,textResult;
    Button getProblem,giveAnwser;
    Label operatorLabel,message;
    Teacher teacher;
    ComputerFrame(String s)
    {   super(s);
        teacher=new Teacher();
        setLayout(new FlowLayout());
        textOne=new TextField(10);     //创建textOne,其可见字符长是10
        textTwo=new TextField(10);     //创建textTwo,其可见字符长是10
        textResult=new TextField(10);  //创建textResult,其可见字符长是10
        operatorLabel=new Label("+");
        message=new Label("你还没有回答呢");
        getProblem=new Button("获取题目");
        giveAnwser=new Button("确认答案");
        add(getProblem);
        add(textOne);
        add(operatorLabel);
        add(textTwo);
        add(new Label("="));
        add(textResult);
        add(giveAnwser);
        add(message);
        textResult.requestFocus();
        textOne.setEditable(false);
        textTwo.setEditable(false);
        getProblem.addActionListener(this);//【代码4】//将当前窗口注册为getProblem的ActionEvent事件监视器
        giveAnwser.addActionListener(this);//【代码5】//将当前窗口注册为giveAnwser的ActionEvent事件监视器
        textResult.addActionListener(this);//【代码6】//将当前窗口注册为textResult的ActionEvent事件监视器
        setBounds(100,100,450,100);
        setVisible(true);
        validate();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getProblem) {//判断事件源是否是getProblem
            int number1=teacher.giveNumberOne(100);
            int number2=teacher.giveNumberTwo(100);
            String operator=teacher.giveOperator();
            textOne.setText(""+number1);
            textTwo.setText(""+number2);
            operatorLabel.setText(operator);
            message.setText("请回答");
            textResult.setText(null);
        }
        if(e.getSource() == giveAnwser){  //判断事件源是否是giveAnwser
            String answer=textResult.getText();
            try{
                int result=Integer.parseInt(answer);
                if(teacher.getRight(result)==true) {
                    message.setText("你回答正确");
                }
                else {
                    message.setText("你回答错误");
                }
            }
            catch(NumberFormatException ex) {
                message.setText("请输入数字字符");
            }
        }
        textResult.requestFocus();
        validate();
    }
}
public class ComputerMainClass {
    public static void main(String args[]) {
        ComputerFrame frame;
        frame=new ComputerFrame("算数测试");//创建窗口，其标题为：算术测试
    }
}
