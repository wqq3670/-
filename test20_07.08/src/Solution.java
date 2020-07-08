/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-07-08
 * Time: 23:42
 **/
public class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] lengths = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            lengths[i] = shorter * (k - i) + longer * i;
        }
        return lengths;

    }
}
