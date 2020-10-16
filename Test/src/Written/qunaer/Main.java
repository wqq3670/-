package Written.qunaer;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-10-14
 * Time: 19:57
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(eatFunc(n));
    }

    private static int eatFunc(int n) {
        if(n == 1 || n == 2){
            return n;
        }else {
            int a = 1;
            int b = 2;
            int ret = 0;
            while (n >= 3) {
                ret = a+b;
                a = b;
                b = ret;
                n--;
            }
            return ret;
        }

    }
}
