/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-05
 * Time: 18:41
 **/
public class Solution {
    public int numberofprize (int a, int b, int c) {
        int ret = 0;//获得道具的个数

        int min = Integer.min((Integer.min(a,b)),c);
        ret = min;

        a -= min;
        b -= min;
        c -= min;
        if(a == 0) {
            ret += numChild(b,c);
        }
        if(b == 0) {
            ret += numChild(a,c);
        }
        if(c == 0) {
            ret += numChild(a,b);
        }
        return ret;
    }

    private int numChild(int m, int n) {
        int count = 0;
        if(m==0 || n==0) {
            count = n/6 + m/6;
        }else{
            if(m > n) {
                while(n > 0) {
                    if((m-n) >= 2) {

                    }
                }
            }
        }

    }
}
