/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-18
 * Time: 23:45
 **/
public class Solution {
    public int maxProduct(int[] nums) {
        int ans = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                ans = nums[j]*ans;
                max = Math.max(max,ans);
            }
            ans = 1;
        }
        return max;
    }
}
