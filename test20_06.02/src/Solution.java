/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-06-02
 * Time: 23:54
 **/
public class Solution {
    int res = 0;
    public int sumNums(int n) {
        boolean x = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }
}
