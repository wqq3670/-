import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-06
 * Time: 19:10
 **/
public class Main {
    public static void fun(List<String> list) {
        if(list == null) {
            return;
        }
        int len = list.size();
        int n = Integer.parseInt(list.get(len-2));//拿到临界值
        String aimStr = list.get(len-1);//拿到目标字符串

        //找特征值封
        String aim = funChild(aimStr,n);//拿到目标字符串的特征值

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < len-2; i++) {
            String tmp = list.get(i);
            ls.add(funChild(tmp,n));//拿到其他字符串的特征值
        }

        for (int i = 0; i < ls.size(); i++) {
            String tmp = ls.get(i);
            if(tmp.contains(aim)) {
                System.out.println(list.get(i));
            }
        }
    }

    //找特征值
    private static String funChild(String aimStr, int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < aimStr.length(); i++) {
            char c = aimStr.charAt(i);
            if(c-'0' < n) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(sc.hasNext()) {
            list.add(sc.nextLine());
        }
        fun(list);
    }
}
