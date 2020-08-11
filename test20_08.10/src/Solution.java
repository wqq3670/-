/**
 * Created with IntelliJ IDEA.
 * Description:不需要偶数与偶数之间保持相对位置
 * User: dell
 * Date: 2020-08-10
 * Time: 23:55
 **/
public class Solution {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            // 当找到一个偶数时，就跳出循环。
            // (这里有个求奇偶数的小技巧，就是当一个数是奇数时，它的二进制表示的最后一位肯定是1
            while (left < right && (nums[left] & 1) == 1) {
                left++;
            }
            // 当找到一个奇数时，就跳出循环
            while (left < right && (nums[right] & 1) == 0) {
                right--;
            }
            // 如果两个指针还没有碰到一起时，说明找到了需要交换的位置
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }

}
