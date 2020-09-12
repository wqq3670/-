/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-12
 * Time: 14:18
 **/
public class Solution {
    public int climbStairs1 (int n) {
        if(n <= 1) {
            return 1;
        }else {
            return climbStairs1(n-1)+climbStairs1(n-2);
        }


    }
    public int climbStairs (int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }

        int a = 2;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a+b;
            b = a;
            a = c;
        }
        return c;

    }
}
