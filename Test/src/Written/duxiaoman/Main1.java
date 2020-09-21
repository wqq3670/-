package Written.duxiaoman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-20
 * Time: 20:54
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sHave = sc.nextLine();
        String t = sc.nextLine();

        int ret = fun(sHave,t);
        System.out.println(ret);
    }

    /**
     * 遍历需要的颜料颜色，如果手里有这个颜色，删除手里颜色并且给count++;
     * @param sHave
     * @param t
     * @return
     */
    private static int fun(String sHave, String t) {
        int count = 0;
        //把手里颜色放入slist列表
        List<Character> slist = new ArrayList<>();
        for (int i = 0; i < sHave.length(); i++) {
            slist.add(sHave.charAt(i));
        }


        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(slist.contains(c)) {
                int index = slist.indexOf(c);
                slist.remove(index);
                count++;
            }
        }
        return count;
    }
}
