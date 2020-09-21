package Written.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-20
 * Time: 10:59
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.nextLine();
        String t = sc.nextLine();
        fun(n,m,s,t);
    }

    private static void fun(int n, int m, String s, String t) {
        List<Character> sList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sList.add(s.charAt(i));
        }
        List<Character> tList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            sList.add(t.charAt(i));
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

    }

}
