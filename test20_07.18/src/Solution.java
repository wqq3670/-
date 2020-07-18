/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-07-18
 * Time: 23:55
 **/
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
        if (len1 + len2 != len3) {
            return false;
        }
        // 定义 dp 数组，记录 s1 和 s2 的前 j 个字符能否交错组成 s3 的前 len1 + j 个字符。
        boolean[] dp = new boolean[len2 + 1];
        dp[0] = true;
        // 外层循环遍历 s1 的每个字符，内层循环遍历 s2 的每个字符。
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                // 找到当前要匹配的 s3 字符索引。
                int p = i + j - 1;
                // 依次判断 s2 前 j 个字符能否和 s1 前 i 个字符交错组成 s3 的前 i + j 个字符。
                if (i > 0) {
                    dp[j] = dp[j] && s1.charAt(i - 1) == s3.charAt(p);
                }
                // 当 s3 的 p 索引字符能匹配当前 s1 字符或者 s2 字符使得前缀匹配完成则记录符合。
                if (j > 0) {
                    dp[j] = dp[j] || (dp[j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }
        // 遍历完成返回完整的 s1 和 s2 能否交错组成 s3 。
        return dp[len2];


    }
}
