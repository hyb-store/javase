package javaexperiment.javatest3;
/*
实例成员与类成员。

实验要求：
按程序模板的要求编写源文件，要特别注意程序的输出结果，并能正确解释输出的结果。
填写用方括号括起来的代码块，使程序能正确地编译、运行。
 */
class A
{
   //声明一个float型实例变量a
    float a;
   //声明一个float型类变量b,即static变量b
    static float b;
    void setA(float a) {
      //将参数a的值赋值给成员变量a
        this.a = a ;
    }
    void setB(float b) {
      //将参数b的值赋值给成员变量b
        this.b = b;
    }
    float getA() {
        return a;
    }
    float getB() {
        return b;
    }
    void inputA() {
        System.out.println(a);
    }
    static void inputB() {
        System.out.println(b);
    }
}
public class Example
{
    public static void main(String args[])
    {
      //通过类名操作类变量b,并赋值100
        A.b = 100;
      //通过类名调用方法inputB()
        A.inputB();

        A cat=new A();
        A dog=new A();
       //cat象调用方法setA(int a)将cat的成员a的值设置为200
        cat.setA(200);
       //cat调用方法setB(int b)将cat的成员b的值设置为400
        cat.setB(400);
       //dog象调用方法setA(int a)将dog的成员a的值设置为150
        dog.setA(150);
       //dog调用方法setB(int b)将dog的成员b的值设置为300
        dog.setB(300);
       //cat调用inputA()。
        cat.inputA();
       //cat调用inputB()。
        cat.inputB();
       //dog调用inputA()。
        dog.inputA();
       //dog调用inputB()。
        dog.inputB();
    }
}