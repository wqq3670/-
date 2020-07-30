/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-07-30
 * Time: 23:56
 **/
public class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];


    }
}
