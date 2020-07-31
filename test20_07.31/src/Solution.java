import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-07-31
 * Time: 14:56
 **/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();//拿到元素个数
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        binarySearch(arr,0,len-1,key);

    }

    private static void binarySearch(int[] arr,int left,int right,int key) {
        if(left > right) {
            System.out.println(-1);
        }
        if(left <= right) {
            int point = (left+right)/2;
            if(arr[point] ==  key) {
                System.out.println(point);
            }else if(arr[point] < key) {
                binarySearch(arr,point+1,right,key);
            }else{
                binarySearch(arr,left,point-1,key);
            }
        }
    }
}
