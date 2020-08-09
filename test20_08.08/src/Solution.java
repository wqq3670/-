/**
 * Created with IntelliJ IDEA.
 * Description:剑指offer
 * 不用考虑负数的情况，因为再底层存储负数就是以其补码形式存储的
 * User: dell
 * Date: 2020-08-08
 * Time: 23:51
 **/
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0) {
            if((n&1) == 1) {
                count++;
            }
            n = n>>>1;//无符号右移，最高位补0(不会改变值的大小)
        }
        return count;
    }
}
