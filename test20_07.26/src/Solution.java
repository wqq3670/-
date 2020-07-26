import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-07-26
 * Time: 20:38
 **/
public class Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        if(k > input.length) {
            return array;
        }
        Arrays.sort(input);
        for(int i = 0; i < k; i++) {
            array.add(input[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        int k = 4;
        ArrayList<Integer> array = GetLeastNumbers_Solution(arr,k);
        System.out.println(array);
    }
}
