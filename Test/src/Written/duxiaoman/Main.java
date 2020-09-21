package Written.duxiaoman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-20
 * Time: 21:13
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            fun(list.get(i));
        }
    }

    private static void fun(String str) {
        if(str.length() < 3 ) {
            System.out.println("NO");
        }else if(str.length()%3 != 0) {
            System.out.println("NO");
        }else {
            String[] s = new String[str.length()/3];
            for (int i = 0; i < s.length; i++) {

            }

        }

    }
}
