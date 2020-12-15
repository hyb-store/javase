package com.hyb.java2.thread;

/*
    模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售
 */
public class Demo08Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl1 run = new RunnableImpl1();
        //创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
/*
    实现卖票案例
 */
class RunnableImpl1 implements Runnable{
    //定义一个多个线程共享的票源
    private  int ticket = 100;


    //设置线程任务:卖票
    @Override
    public void run() {
        //使用死循环,让卖票操作重复执行
        while(true){
            //先判断票是否存在
            if(ticket>0){
                //提高安全问题出现的概率,让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //票存在,卖票 ticket--
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
