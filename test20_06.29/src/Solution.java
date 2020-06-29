/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-06-29
 * Time: 23:00
 **/
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        // 从后往前遍历升序数组，直到找到第 k 个最大的元素。
        for (int i = len - 1; i >= 0; i--) {
            k--;
            if (k == 0) {
                return nums[i];
            }
        }
        return nums[len - 1];


    }
}
