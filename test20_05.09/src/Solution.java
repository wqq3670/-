/**
 * Created with IntelliJ IDEA.
 * Description: x平方根
 * User: dell
 * Date: 2020-05-09
 * Time: 12:41
 **/
public class Solution {
    /*
    暴力求解法
     */
    public int mySqrt1(int x) {
        for(long i = 1; i <= x; i++) {
            if(i*i > x) {
                return (int)i-1;
            }else if(i*i == x) {
                return (int)i;
            }
        }
        return 0;
    }
    /*
    二分查找法
     */
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ret = 0;//记录平方根

        while(left <= right) {

            //求平均数  相当于left/2+right/2
            int mid = left+(right-left)/2;
            //如果mid*mid小于等于x  那么我们要找的中间数在mid右侧
            if((long)mid*mid <= x) {
                ret = mid;//把mid记录下来 解决8这种情况
                left = mid+1;//在右边找
            }else {
                right = mid-1;//在左边找
            }
        }
        return ret;

    }
}
