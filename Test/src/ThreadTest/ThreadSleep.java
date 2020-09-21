package ThreadTest;

/**
 * Created with IntelliJ IDEA.
 * Description:模拟网络延时:放大问题的发生性
 * User: dell
 * Date: 2020-09-21
 * Time: 13:05
 **/
public class ThreadSleep implements Runnable {

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
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNums--+"张票");
        }
    }

    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();

        new Thread(threadSleep,"sehun").start();
        new Thread(threadSleep,"beakyun").start();
        new Thread(threadSleep,"chanyeol").start();
    }

}
