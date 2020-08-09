import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-08
 * Time: 16:12
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n-1];
            for (int i = 0; i < n-1; i++) {
                b[i] = sc.nextInt();
            }
            func1(n,a,b);
        }
    }

    private static void func1(int n, int[] a, int[] b) {
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += a[i];
        }
        int sum2 = 0;
        for (int i = 0; i < n-1; i++) {
            sum2 += b[i];
        }
        if(sum1 > sum2) {
            System.out.println(8+sum2/3600+":"+sum2/60+":"+sum2%60+"/am");

        }
        if(sum1 < sum2) {
            System.out.println(8+sum1/3600+":"+sum1/60+":"+sum1%60+"/am");

        }

    }
}
