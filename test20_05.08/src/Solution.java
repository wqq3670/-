/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-08
 * Time: 16:43
 **/
public class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;//用来表示最大的边长
        //排除数组只有一行一列或者数组为空的情况
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return maxSide;
        }

        int row = matrix.length;//二维数组的行
        int col = matrix[0].length;//二维数组的列



        //一个和给定数组同样大小的数组用来存放
        //以tmp[i][j]为右下角时所构成的正方形的最大边长的值
        int[][] tmp = new int[row][col];

        for(int i = 0; i < row; i++) {

            for(int j = 0; j < col; j++) {

                if(matrix[i][j] == '1') {       //遍历原数组 当遇到数组中字符是 1 时

                    //如果是边界 为0行或者0列，只能以matrix[i][j]自己本身构成正方形，在tmp数组对应位置填1就好
                    if(i == 0 || j == 0) {
                        tmp[i][j] = 1;

                    }else {  //不是0行或者0列的情况  tmp[i][j]位置的值（以matrix[i][j]为右下角构成正方形的最大边长值）就是tmp[i][j]的左、左上、上三个中的最小值+1
                        tmp[i][j] = Math.min(Math.min(tmp[i][j-1],tmp[i-1][j]),tmp[i-1][j-1])+1;
                    }

                }else {    //遍历原数组 当遇到数组中字符是 0 时，那么以它为右下角是肯定构不成正方形的，对应位置填0就好
                    tmp[i][j] = 0;
                }

                //每次取tmp[i][j]和maxSide的最大值作为新的maxSide
                maxSide = Math.max(tmp[i][j],maxSide);
            }
        }
        //返回边长的平方即可
        return maxSide*maxSide;

    }
}
