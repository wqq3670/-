import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-16
 * Time: 16:22
 **/
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            func(str);
        }
    }

    private static void func(String str) {
        List<String> list = new ArrayList<>();
        String[] st = str.split(" ");
        list.addAll(Arrays.asList(st));
        String tmp = null;
        for (int i = 0; i < list.size(); i++) {
            int pre = i-1;
            if(list.get(i).equals("undo")) {
                if(i > 0) {
                    tmp = list.get(i-1);
                    list.remove(i-1);
                }
            }else if(list.get(i).equals("redo")) {
                if(i > 0) {
                    list.add(i-1,tmp);
                }
            }

        }
        System.out.println(list);
    }
}
