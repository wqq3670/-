package Written.baidu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-10-12
 * Time: 19:49
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        fun(s);
    }

    private static void fun(String s) {

        String[] strArr = s.split(" ");

        int count = 0;
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {

            if(map.containsKey(strArr[i])) {
                count = map.get(strArr[i])+1;
                map.put(strArr[i],count);
            }else {
                map.put(strArr[i],1);
            }
        }
        int max = 0;
        String tmp = "";

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                tmp = entry.getKey();
            }
        }
        System.out.println(tmp+" "+max);
    }
}
