package Written.youzan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-10-11
 * Time: 19:26
 **/
public class Main1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将两个有序的整型数组合并为一个相反顺序的数组
     * @param A int整型一维数组
     * @param B int整型一维数组
     * @return int整型一维数组
     */
    public int[] mergeToReversed (int[] A, int[] B) {
        //1.首先判断数组是升序还是降序
        if(A[A.length-1] > A[0]) {
            //目标数组为降序
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                list.add(A[i]);
            }
            for (int i = 0; i < B.length; i++) {
                list.add(B[i]);
            }
            Arrays.sort(new List[]{list});
            int[] ret = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ret[i] = list.get(list.size()-i);
            }
            return ret;
        }else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                list.add(A[i]);
            }
            for (int i = 0; i < B.length; i++) {
                list.add(B[i]);
            }
            Arrays.sort(new List[]{list});
            int[] ret = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ret[i] = list.get(i);
            }
            return ret;

        }

    }
}
