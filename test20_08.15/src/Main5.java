import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-16
 * Time: 17:52
 **/
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        int[] book = new int[m];
        int[] read = new int[n];

        for (int i = 0; i < n; i++) {
           read[i] = sc.nextInt();
           book[read[i]]++;
        }


        for (int i = 0; i < n; i++) {
            if(book[read[i]] == 1) {
                System.out.println("BeiJu");
            }else {
                System.out.println(book[read[i]]-1);
            }
        }
    }
}
