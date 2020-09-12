import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-12
 * Time: 15:41
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() <= 1) {
            System.out.println(0);
        }else {
            //1.先拿到所有的回文串
            System.out.println(fun1(str));
        }
        
        
    }

    private static boolean isHuiWen(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left <= right) {
            if(ch[left] == ch[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    //先拿到所有的回文串
    private static int fun1(String str) {
        //拿到所有子串
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j <= str.length(); j++) {
                //是不是回文串
                if (isHuiWen(str.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;
    }

}
