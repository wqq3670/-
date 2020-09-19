package Written.jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-17
 * Time: 20:32
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String s = "\\d{4}";
        Pattern pattern = Pattern.compile(s);

        Matcher matcher = pattern.matcher(str);
        while(true) {
            if(matcher.find()) {
                System.out.println(matcher.group()+" ");
            }else {
                break;
            }
        }
    }
}
