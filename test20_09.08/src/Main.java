import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-08
 * Time: 20:05
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        int[] perArr = func1(str1);
        int[] taskArr = func1(str2);

        int count = 0;
        for (int i = 0; i < perArr.length; i++) {

            for (int j = 0; j < taskArr.length; j++) {

                if(perArr[i] <= taskArr[j]) {
                    count++;
                    continue;
                }

            }
        }
        System.out.println(count);

    }
    public static int[] func1(String str) {
        String[] strings = str.split(" ");
        int[] arr = new int[strings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        return arr;
    }

}
