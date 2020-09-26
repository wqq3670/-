package Written.jibite;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-25
 * Time: 21:25
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattren = sc.next();
        String content = sc.next();
        int ret = fun(pattren,content);
    }

    private static int fun(String pat, String cont) {
        //回文是一种情况
        if(isHuiWen(pat) && isHuiWen(cont)) {
            return 1;
        }
        return 0;
    }

    private static boolean isHuiWen(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch[ch.length-1];
        while(left <= right) {
            if(ch[left] != ch[right]) {
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}
