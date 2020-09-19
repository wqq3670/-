package ThreadTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-19
 * Time: 18:44
 **/
public class Thread1 extends Thread{
    @Override
    public void run() {
        //run()方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我是子线程"+i);
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();


        for (int i = 0; i < 1000; i++) {
           System.out.println("我是main线程"+i);
       }

    }
}
