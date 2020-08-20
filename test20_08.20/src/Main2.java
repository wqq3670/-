import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-20
 * Time: 21:05
 **/
public class Main2 {
    public int eraseOverlapIntervals (int[][] intervals) {

        if(intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int count = 0;
        int r = intervals[0][0];

        for (int[] arr: intervals) {
            int l = arr[0];
            if(l >= r) {
                count++;
                r = arr[1];
            }
        }
        return intervals.length-count;
    }
}
