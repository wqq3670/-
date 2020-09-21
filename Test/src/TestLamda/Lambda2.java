package TestLamda;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-21
 * Time: 1:22
 **/
public class Lambda2 {


    public static void main(String[] args) {


        //lambda表达式
        Ilove love =(int a,int b,int c)-> {
                System.out.println("I love you---》" + a);
        };

        //简化1：去掉参数类型
        love =(a,b,c)-> {
            System.out.println("I love you---》" + b);
        };

        //简化2：去掉括号
        love = (int a,int b,int c)-> {
            System.out.println("I love you---》" + a);
            System.out.println("I love you---》" + b);
            System.out.println("I love you---》" + c);
        };

        //3.去掉大括号
        love = (a,b,c)-> System.out.println("I love you---》" + c);

        love.love(52,55,60);
    }
}

interface Ilove {
    void love(int a,int b,int c);
}