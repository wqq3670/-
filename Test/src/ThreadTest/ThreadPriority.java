package ThreadTest;

/**
 * Created with IntelliJ IDEA.
 * Description:测试线程的优先级
 * User: dell
 * Date: 2020-09-22
 * Time: 1:46
 **/
public class ThreadPriority {
    public static void main(String[] args) {
        //主线程默认优先级
        System.out.println(Thread.currentThread().getName()+"------>"+Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();
        Thread thread1 = new Thread(myPriority);
        Thread thread2 = new Thread(myPriority);
        Thread thread3 = new Thread(myPriority);
        Thread thread4 = new Thread(myPriority);
        Thread thread5 = new Thread(myPriority);

        //设置优先级，再启动
        thread1.start();

        thread2.setPriority(2);
        thread2.start();

        thread3.setPriority(4);
        thread3.start();

        thread4.setPriority(Thread.MAX_PRIORITY);//MAX_PRIORITY=10
        thread4.start();

        thread5.setPriority(8);
        thread5.start();
    }

}

class MyPriority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"------>"+Thread.currentThread().getPriority());

    }
}