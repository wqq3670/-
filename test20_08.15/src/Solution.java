import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-16
 * Time: 19:46
 **/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = fib(n);
        System.out.println(ret);

    }
    private static int fib(int n) {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 1; i < n-1; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
}
