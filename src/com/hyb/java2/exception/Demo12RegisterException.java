package com.hyb.java2.exception;


import java.util.Scanner;

/*
    要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。

    分析:
        1.使用数组保存已经注册过的用户名(数据库)
        2.使用Scanner获取用户输入的注册的用户名(前端,页面)
        3.定义一个方法,对用户输入的中注册的用户名进行判断
            遍历存储已经注册过用户名的数组,获取每一个用户名
            使用获取到的用户名和用户输入的用户名比较
                true:
                    用户名已经存在,抛出RegisterException异常,告知用户"亲，该用户名已经被注册";
                false:
                    继续遍历比较
            如果循环结束了,还没有找到重复的用户名,提示用户"恭喜您,注册成功!";
 */
public class Demo12RegisterException {
    // 1.使用数组保存已经注册过的用户名(数据库)
    static String[] usernames = {"张三","李四","王五"};

    public static void main(String[] args) {
        //2.使用Scanner获取用户输入的注册的用户名(前端,页面)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String username = sc.next();
        checkUsername(username);

    }

    //3.定义一个方法,对用户输入的中注册的用户名进行判断
    public static void checkUsername(String username)  {
        //遍历存储已经注册过用户名的数组,获取每一个用户名
        for (String name : usernames) {
            //使用获取到的用户名和用户输入的用户名比较
            if(name.equals(username)){
                //true:用户名已经存在,抛出RegisterException异常,告知用户"亲，该用户名已经被注册";
                throw new RegisterException1("亲，该用户名已经被注册");//抛出运行期异常,无需处理,交给JVM处理,中断处理
            }
        }

        //如果循环结束了,还没有找到重复的用户名,提示用户"恭喜您,注册成功!";
        System.out.println("恭喜您,注册成功!");
    }
}
/*
    自定义异常类:
        java提供的异常类,不够我们使用,需要自己定义一些异常类
    格式:
        public class XXXExcepiton extends Exception | RuntimeException{
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
        }
     注意:
        1.自定义异常类一般都是以Exception结尾,说明该类是一个异常类
        2.自定义异常类,必须的继承Exception或者RuntimeException
            继承Exception:那么自定义的异常类就是一个编译期异常,如果方法内部抛出了编译期异常,就必须处理这个异常,要么throws,要么try...catch
            继承RuntimeException:那么自定义的异常类就是一个运行期异常,无需处理,交给虚拟机处理(中断处理)
 */
class RegisterException1 extends /*Exception*/ RuntimeException{
    //添加一个空参数的构造方法
    public RegisterException1(){
        super();
    }
    /*
        添加一个带异常信息的构造方法
        查看源码发现,所有的异常类都会有一个带异常信息的构造方法,
        方法内部会调用父类带异常信息的构造方法,
        让父类来处理这个异常信息
     */
    public RegisterException1(String message){
        super(message);
    }
}
