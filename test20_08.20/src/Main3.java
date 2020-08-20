import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-20
 * Time: 21:40
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ret = func(str);
        System.out.println(ret);
    }

    private static int func(String str) {
        char[] ch = str.toCharArray();
        int count = 0;
        int[] arr = 
        for (int i = 0; i < ch.length; i++) {
            int countG = 0;
            int countO = 0;
            int countD = 0;
            char c = ch[i];
            if(c == 'G') {
                countG++;
            }
            if(c == 'o') {
                countO++;
            }
            if(c == 'd') {
                countD++;
            }

        }

    }

}
