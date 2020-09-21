package ThreadTest;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:模拟倒计时
 * User: dell
 * Date: 2020-09-21
 * Time: 13:27
 **/
public class ThreadSleep2 implements Runnable {
    @Override
    public void run() {

    }


    //模拟倒计时
    public void tearDown() throws InterruptedException {
        int num = 10;
        while(true) {
            Thread.sleep(1000);
            System.out.println(num--);
            if(num <= 0) {
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //打印当前系统时间
        Date startTime = new Date(System.currentTimeMillis());//获取系统当前时间
        while(true) {
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
            startTime = new Date(System.currentTimeMillis());//更新时间
        }
    }
}
