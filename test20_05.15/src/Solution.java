/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-15
 * Time: 18:21
 **/
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        for(int i = 0; i < len; i++) {
            int sum = 0;
            for(int j = i; j < len; j++) {
                sum = sum+nums[j];
                if(sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
