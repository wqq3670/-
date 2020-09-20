/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-18
 * Time: 10:17
 **/
public class Main3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i, k = 0;
        for (i = 0; i < 10; i++) {
            arr[i] = i;
            for (i = 1; i < 4; i++) {
                k += arr[i] + i;
                System.out.print(k);
            }
        }

    }
}
