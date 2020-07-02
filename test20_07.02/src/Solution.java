/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-07-02
 * Time: 23:52
 **/
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length, columns = matrix[0].length;
        int[] sorted = new int[rows * columns];
        int index = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sorted[index++] = num;
            }
        }
        Arrays.sort(sorted);
        return sorted[k - 1];


    }

}
