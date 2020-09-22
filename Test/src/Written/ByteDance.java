package Written;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-22
 * Time: 14:22
 **/
public class ByteDance {

    public int minPathSum (int[][] matrix) {
        // write code here

        int row = 0;
        int col = 0;
        int min = matrix[0][0];

        while (row < matrix.length && col < matrix[0].length ) {
            List<Integer> list = fun(matrix,row,col);
            min += list.get(0);
            row = list.get(1);
            col = list.get(2);
        }

        return min;

    }

    //走到某个位置   去看下一个要走的位置 并且返回下一个位置的数 以及行和列的号数
    public List<Integer> fun(int[][] matrix,int row,int col) {
        List<Integer> list = new ArrayList<>();
        int right = matrix[row][col+1];
        int down = matrix[row+1][col];
        if(right <= down ) {
            list.add(right);
            list.add(row);
            list.add(col);
        }
        return list;
    }
}
