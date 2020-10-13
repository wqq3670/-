package Written.xiecheng;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-10-13
 * Time: 10:59
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//表示倒数第几个元素
        int k = sc.nextInt();//表示有几个链表
        sc.nextLine();
        int ret =0;
        for (int i = 0; i < k; i++) {
            String tmp = sc.nextLine();
            String[] tmpArr = tmp.split(",");
            int cur = Integer.parseInt(tmpArr[tmpArr.length-n]);
            ret += cur;
        }
        System.out.println(ret);
    }


}
