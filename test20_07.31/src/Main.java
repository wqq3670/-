import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-07-31
 * Time: 14:46
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 1) {
            System.out.println(-1);
        }
        int ret = 0;
        int lon = n/2;
        if(n%2 == 0) {
            ret = lon*lon;
        }else {
            ret = lon*(lon+1);
        }
        System.out.println(ret);
    }
}
