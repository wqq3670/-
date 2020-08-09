import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-08
 * Time: 15:37
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long ret = func(n,a);
        System.out.println(ret);
    }

    private static long func(int n, int[] a) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == 3 || a[i] == 2) {
                count++;
            }else if(a[i] == 1){
                count += 0;
            }else {
                count += a[i]/2;
            }
        }
        return count;
    }
}
