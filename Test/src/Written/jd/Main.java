package Written.jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-17
 * Time: 19:57
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        List<String> list = new ArrayList<>();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(fun(arr[i])) {
                if(Integer.parseInt(arr[i])<=3999 && Integer.parseInt(arr[i])>=1000) {
                    System.out.println(arr[i]);
                }
            }
        }

    }

    private static boolean fun(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='0' && ch[i]<='9') {
                count++;
            }
        }
        if(count == ch.length) {
            return true;
        }
        return false;
    }
}
