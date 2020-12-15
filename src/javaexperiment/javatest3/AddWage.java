package javaexperiment.javatest3;
/*
实现一个名为Person的类和它的子类Employee，Manager是Employee的子类，
设计一 个类Add()用于涨工资，普通员工一次能涨10%，经理能涨20%。
具体要求如下:
a）Person类中的属性有：姓名name （String类型），地址address（String类型），定义该类的构造方法；
   Employee 类中的属性有：工号ID（String类型)，工资wage（double类型），工龄（int 型），定义该类的构造方法；
b）Manager类中的属性有：级别level（String类型）定义该类的构造方法；
c）编写一个测试类，产生一个员工和一个经理，给该员工和经理涨工资。
 */
class Person{
    String name;
    String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
class Employee extends Person{
    String ID;
    double wage;//工资
    int time;//工龄


    public Employee() {
    }

    public Employee(String name, String address,String ID, double wage, int time) {
        super(name,address);
        this.ID = ID;
        this.wage = wage;
        this.time = time;
    }

}
class Manager extends Employee{
    String level;

    public Manager() {
    }

    public Manager(String name, String address,String ID, double wage, int time,String level) {
        super(name,address,ID,wage,time);
        this.level = level;
    }
    public void add(){
        if (this.level.equals("经理")){
            this.wage = this.wage*1.2;
        }
        if (this.level.equals("员工"))
            this.wage = this.wage*1.1;
    }


}
public class AddWage {
    public static void main(String[] args) {
        Manager ma1 = new Manager("张三","西安","0412345",12000,4,"经理");
        Manager ma2 = new Manager("王五","咸阳","0425678",8000,2,"员工");

        System.out.println("经理原工资:"+ma1.wage);
        System.out.println("员工原工资:"+ma2.wage);

        ma1.add();
        System.out.println("经理工资:"+ma1.wage);
        ma2.add();
        System.out.println("员工工资:"+ma2.wage);


    }
}
