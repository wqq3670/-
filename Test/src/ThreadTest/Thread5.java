package ThreadTest;

/**
 * Created with IntelliJ IDEA.
 * Description:龟兔赛跑
 * User: dell
 * Date: 2020-09-20
 * Time: 0:19
 **/
//模拟龟兔赛跑
public class Thread5 implements Runnable{

    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {

            //模拟兔子休息
            if(Thread.currentThread().getName().equals("兔子")&& i%10==0) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //判断比赛是否结束
            boolean flag = gameOver(i);
            //如果比赛结束了，就停止程序
            if(flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");

        }
    }

    //判断是否完成比赛
    private boolean gameOver(int steps) {
        //判断是否有胜利者
        if(winner != null) {//已经存在胜利者了
            return true;
        }else {
            if(steps >= 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner is :"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Thread5 thread5 = new Thread5();

        new Thread(thread5,"乌龟").start();
        new Thread(thread5,"兔子").start();
    }
}
