package ThreadTest;

/**
 * Created with IntelliJ IDEA.
 * Description:多个线程同时操作一个类
 * User: dell
 * Date: 2020-09-20
 * Time: 0:11
 **/
//模拟买火车票的例子

//发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱。
public class Thread4 implements Runnable {
    //票数
    private int ticketNums = 10;


    @Override
    public void run() {
        while(true) {
            if (ticketNums <= 0) {
                break;
            }

            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        Thread4 ticket = new Thread4();

        new Thread(ticket,"sehun").start();
        new Thread(ticket,"beakyun").start();
        new Thread(ticket,"chanyeol").start();

    }
}
