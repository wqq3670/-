import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-08
 * Time: 15:11
 **/
public class Main {
    public static void main(String[] args) {
        //首先判断字符串是不是回文串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ret = func1(str);
        //是  直接输出
        //不是，如果是
        // 不==开始添加字符，每添加一次就判断一次
        if(ret) {
            System.out.println(str);
        }else {
            char[] ch = str.toCharArray();
            int right = ch.length-1;
            if(ch[right] == ch[right-1]) {
                StringBuffer sb = new StringBuffer(str);

            }
        }



    }

    //判断字符串是不是回文串
    private static boolean func1(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left < right) {
            if(ch[left] == ch[right]) {
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
     }
}
