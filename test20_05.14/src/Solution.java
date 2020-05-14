/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-14
 * Time: 18:30
 **/
public class Solution {
    public int singleNumber(int[] nums) {
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }
}
