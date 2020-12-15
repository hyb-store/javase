package javaexperiment.javatest3;
/*
三角形、梯形和圆形的类封装

编写一个Java应用程序，该程序中有3个类：Trangle、Leder和Circle，分别用来刻画“三角形”、“梯形”和“圆形”。
具体要求如下：
    a)	Trangle类具有类型为double的三个边，以及周长、面积属性，Trangle类具有返回周长、面积以及修改三个边的功能。
         另外，Trangle类还具有一个boolean型的属性，该属性用来判断三个属能否构成一个三角形。
    b)	Lader类具有类型double的上底、下底、高、面积属性，具有返回面积的功能。
    c)	Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能。
    填写用方括号括起来的代码块，使程序能正确地编译、运行。
 */
class Trangle {
    double sideA,sideB,sideC,area,length;
    boolean boo;
    public  Trangle(double a,double b,double c) {
       //参数a,b,c分别赋值给sideA,sideB,sideC
        sideA = a;
        sideB = b;
        sideC = c;
        if(a + b > c &&a + c > b && b + c > a){ //a,b,c构成三角形的条件表达式
          //给boo赋值。
            boo = true;
        }else{//给boo赋值
            boo = false;
        }
    }
    double getLength() {
        //方法体，要求计算出length的值并返回
        return sideA+sideC+sideB;
    }
    public double  getArea() {
        if(boo) {
            double p=(sideA+sideB+sideC)/2.0;
            area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
            return area;
        }
        else {
            System.out.println("不是一个三角形,不能计算面积");
            return 0;
        }
    }
    public void setABC(double a,double b,double c) {
    //参数a,b,c分别赋值给sideA,sideB,sideC
        sideA = a;
        sideB = b;
        sideC = c;
        if(a + b > c &&a + c > b && b + c > a) {//a,b,c构成三角形的条件表达式
        //给boo赋值。
            boo = true;
        } else {
        //给boo赋值。
            boo = false;
        }
    }
}
class Lader {
    double above,bottom,height,area;
    Lader(double a,double b,double h) {
      //方法体，将参数a,b,c分别赋值给above,bottom,height
        above = a;
        bottom = b;
        height = h;
    }
    double getArea() {
      //方法体，,要求计算出area返回
        return (above+bottom)*height/2;
    }
}

class Circle {
    double radius,area;
    Circle(double r) {
        //方法体
        radius = r;
    }
    double getArea() {
        //方法体，要求计算出area返回
        return radius*radius*Math.PI;
    }
    double getLength() {
      //getArea方法体的代码,要求计算出length返回
        return 4*radius*Math.PI;
    }
    void setRadius(double newRadius) {
        radius=newRadius;
    }
    double getRadius() {
        return radius;
    }
}
public class AreaAndLength {
    public static void main(String args[]) {
        double length,area;
        Circle circle=null;
        Trangle trangle;
        Lader lader;
        //创建对象circle
        circle = new Circle(5);
        //创建对象trangle。
        trangle = new Trangle(3,4,5);
       //创建对象lader
        lader = new Lader(2,3,2);

       // circle调用方法返回周长并赋值给length
        length = circle.getLength();
        System.out.println("圆的周长:"+length);

       // circle调用方法返回面积并赋值给area
        area = circle.getArea();
        System.out.println("圆的面积:"+area);

       // trangle调用方法返回周长并赋值给length
        length = trangle.getLength();
        System.out.println("三角形的周长:"+length);

       // trangle调用方法返回面积并赋值给area
        area = trangle.getArea();
        System.out.println("三角形的面积:"+area);

       // lader调用方法返回面积并赋值给area
        area = lader.getArea();
        System.out.println("梯形的面积:"+area);

       // trangle调用方法设置三个边，要求将三个边修改为12,34,1。
        trangle.setABC(12,34,1);

       // trangle调用方法返回面积并赋值给area
        area = trangle.getArea();
        System.out.println("三角形的面积:"+area);

        // trangle调用方法返回周长并赋值给length
        length = trangle.getLength();
        System.out.println("三角形的周长:"+length);
    }
}