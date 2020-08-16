import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-16
 * Time: 16:58
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strings = str.split(" ");
        int len = strings.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < len-1; i++) {
            if(arr[i] == arr[i+1]) {
                count++;
                if(count >= len/2 ) {
                    System.out.println(arr[i]);
                }
            }else {
                count = 1;
            }
        }
        System.out.println(-1);
    }
}
