package ThreadTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-22
 * Time: 0:41
 **/
//测试join方法
//想象成插队

public class ThreadJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程vip来了"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //启动我们的线程
        ThreadJoin threadJoin = new ThreadJoin();
        Thread thread = new Thread(threadJoin);
        thread.start();

        //主线程
        for (int i = 0; i < 500; i++) {
            if(i == 200) {
                thread.join();//插队
            }
            System.out.println("main"+i);
        }

    }
}
