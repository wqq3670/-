import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-15
 * Time: 19:08
 **/
public class Main {
    public static int[] divingBoard(int a, int b, int k) {
        int[] arr = new int[k+1];

        for (int i = 0; i <= k; i++) {
            //b砖 0-k  a砖 k-0
            arr[i] = i*b+(k-i)*a;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divingBoard(1,2,5)));
    }

}
