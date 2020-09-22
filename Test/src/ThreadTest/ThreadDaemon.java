package ThreadTest;

/**
 * Created with IntelliJ IDEA.
 * Description:测试守护线程
 * User: dell
 * Date: 2020-09-22
 * Time: 2:03
 **/

//上帝守护你
public class ThreadDaemon  {

    public static void main(String[] args) {
        God god = new God();
        YouSlef youSlef = new YouSlef();

        Thread thread = new Thread(god);
        thread.setDaemon(true);//默认是false表示为用户线程，正常的线程都是用户线程

        thread.start();//上帝守护线程启动

        new Thread(youSlef).start();//你 用户线程启动
    }

}

//上帝
class God implements Runnable{

    @Override
    public void run() {
        while(true) {
            System.out.println("上帝保佑着你");
        }
    }
}
//你
class YouSlef implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你一生都开心的活着");
        }

        System.out.println("goodbye world!");
    }
}
