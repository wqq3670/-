import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-07-26
 * Time: 20:54
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            funcation(str);
        }
    }

    public static void funcation(String str) {
        int max = 0;
        int len = 0;
        int end_pos = 0;//用来记录最长数字串的尾
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9') {
                len++;
                if(len > max) {
                    max = len;
                    end_pos = i;
                }
            }else {
                len = 0;
            }
        }
        System.out.println(str.substring(end_pos+1-max,end_pos+1));
    }
}
