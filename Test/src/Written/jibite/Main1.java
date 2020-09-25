package Written.jibite;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-25
 * Time: 21:14
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = func(n);
        System.out.println(ret);
    }

    private static int func(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            while(n % i == 0) {
                count++;
                n = n/i;
            }
        }
        return count;
    }
}
