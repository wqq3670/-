import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-06
 * Time: 20:28
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(";");

        String s1 = strArr[0];
        String s2 = strArr[1];//拿到两个字符串

        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");
        int count = 0;
        if(s1Arr.length > s2Arr.length) {
            count = s1Arr.length - s2Arr.length;//如果两个长度不一样，首先偏差最小是差值；
            for (int i = 0; i < s2Arr.length; i++) {
                if(!s1Arr[i].equals(s1Arr[i])) {
                    count+=2;
                }
            }
            System.out.println("("+count+","+s1Arr.length+")");
        }else {
            count = s2Arr.length - s1Arr.length;
            for (int i = 0; i < s1Arr.length; i++) {
                if(!s1Arr[i].equals(s1Arr[i])) {
                    count+=2;
                }
            }
            System.out.println("("+count+","+s2Arr.length+")");
        }

    }
}
