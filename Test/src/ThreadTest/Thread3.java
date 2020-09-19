package ThreadTest;

/**
 * Created with IntelliJ IDEA.
 * Description:Runnable接口实现多线程
 * User: dell
 * Date: 2020-09-19
 * Time: 23:44
 **/
//创建的方式2：实现Runnable接口，重写run()方法，执行线程需要丢入Runnable接口实现类，调用start()方法。

public class Thread3 implements Runnable {
    @Override
    public void run() {
        //run()方法执行体
        for (int i = 0; i < 200; i++) {
            System.out.println("我是子线程"+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象

        Thread3 thread3 = new Thread3();
        //创建线程对象，通过线程对象来开启线程  （代理）
        new Thread(thread3).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我是main线程"+i);
        }
    }
}
