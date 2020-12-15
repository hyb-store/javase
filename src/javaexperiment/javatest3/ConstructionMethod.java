package javaexperiment.javatest3;
/*
1．构造方法的使用

编写一个Java应用程序，测试用户名和密码是否合法。具体要求如下：
a) 定义两个私有的成员变量：用户名，密码；
b) 设计三个构造方法：
     1）无参构造方法，用户名和密码均为空。
     2)有参构造方法，参数为用户名，功能为初始化用户名。
     3）有参构造方法，参数为用户名和密码，功能为初始化用户名和密码。
     4）构造方法中能使用this的，尽量使用。
c) 设计一个检查方法：检查用户名和密码是否合法，假设正确密码为“12345678”。
d) 测试以上功能。
 */
class People{
    private String name;
    private String password;

    public People() {
    }

    public People(String name){
        this.name = name;
    }

    public People(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void check(){
        if (!password.equals("12345678"))
        System.out.println("用户："+this.getName()+"  您的用户名和密码不合法");
        else
            System.out.println("用户："+this.getName()+"  您的用户名和密码合法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class ConstructionMethod {
    public static void main(String[] args) {
        People p1 = new People();
        p1.setName("张三");
        p1.setPassword("123465875");
        p1.check();

        People p2 = new People("李四");
        p2.setPassword("167135641");
        p2.check();

        People p3 = new People("王五","12345678");
        p3.check();;
    }
}
