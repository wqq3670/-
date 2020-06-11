/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-06-11
 * Time: 23:54
 **/
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int current = T[i];
            if (current < 100) {
                for (int j = i + 1; j < length; j++) {
                    if (T[j] > current) {
                        result[i] = j - i;
                        break;
                    }
                }
            }
        }
        return result;

    }
}
