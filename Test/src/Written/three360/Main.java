package Written.three360;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-26
 * Time: 20:04
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            int ret = func(str);
            System.out.println(ret);
        }
    }

    private static int func(String str) {
        int count = 0;
        int sum = 0;
        int a = str.charAt(0);//物品数
        int b = str.charAt(1);//隔板数
        int k = str.charAt(2);//每个箱子最多几个空间
        int v = str.charAt(4);//每个隔间放几个

        if(k-1 <= b) {
            sum = k*v;
            if(a < sum) {
                return count;
            }
        }
    }
}
