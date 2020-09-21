package Written.tongcheng;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-21
 * Time: 21:12
 **/
public class Main2 {
    public int getABA (int number) {
        // write code here
        String tmp = number+"";
        int len = tmp.length();

        if(len == 2) {
            int left = (tmp.charAt(0)-1)*10+(tmp.charAt(0)-1);
            int right = (tmp.charAt(0))*10+(tmp.charAt(0));
            if(number-left <= right-number) {
                return left;
            }
            return right;
        }
        if(len == 3) {
            int ret = tmp.charAt(0)*100+tmp.charAt(1)*10+tmp.charAt(0);
            return ret;
        }
        return 0;
    }
}
