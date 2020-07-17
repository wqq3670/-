/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-07-17
 * Time: 23:56
 **/
public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
