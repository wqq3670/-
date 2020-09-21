package Written.meituan;


import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-20
 * Time: 10:06
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ret = 0;
        String[] strArr = str.split(" ");

        if(strArr.length > 1) {
            int start = Integer.parseInt(strArr[0]);
            int end = Integer.parseInt(strArr[1]);

            for (int i = start; i <= end; i++) {
                //先判断每一位是否不一样，以及A C E位是否不为0
                if(fun(i+"")) {
                    //再去判断AB+CD=EF；
                    ret += fun2(i+"");
                }
            }
        }
        System.out.println(ret);
    }

    private static int fun2(String s) {
        int num1 = (s.charAt(0)-'0')*10+s.charAt(1)-'0';
        int num2 = (s.charAt(2)-'0')*10+s.charAt(3)-'0';
        int num3 = (s.charAt(4)-'0')*10+s.charAt(5)-'0';
        if(num1+num2 == num3) {
            return 1;
        }
        return 0;
    }

    /**
     * 先判断每一位是否不一样，以及A C E位是否不为0
     * @param s
     * @return
     */
    private static boolean fun(String s) {
        int[] ch = new int[10];
        if(s.charAt(0)== '0') {
            return false;
        }else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                ch[c-'0']++;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] > 1) {
                return false;
            }
        }
        return true;
    }
}
