import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-20
 * Time: 20:36
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//行
        int M = sc.nextInt();//列

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ret = func(arr);

    }

    private static int func(int[][] arr) {
        if(arr == null || arr.length < 1) {
            return 0;
        }
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[arr.length][arr[0].length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                list.add(fun2(arr,dp,i,j));
            }
        }
        int len = 0;
        for (int i:list) {
            if(i > len) {
                len = i;
            }

        }
        return len;
    }

    private static int fun2(int[][] arr, int[][]dp,int i, int j) {
        if(dp[i][j] != 0) {
            return dp[i][j];
        }
        int a = 0;//下
        int b = 0;//上
        int c = 0;//右
        int d = 0;//左

        //上
        if(i > 0 && arr[i-1][j] > arr[i][j]) {
            b = fun2(arr,dp,i-1,j);
        }
        //下
        if(i < arr.length-1 && arr[i+1][j] > arr[i][j]) {
            a = fun2(arr,dp,i+1,j);
        }
        //左
        if(j > 0 && arr[i][j-1] > arr[i][j]) {
            d = fun2(arr,dp,i,j-1);
        }
        //右
        if(j < arr[0].length-1 && arr[i][j+1] > arr[i][j]) {
            c = fun2(arr,dp,i,j+1);

        }
        return dp[i][j] = Math.max(Math.min(a,b),Math.max(c,d))+1;

    }
}
