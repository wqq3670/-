import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:实现pow(x,n)
 * User: dell
 * Date: 2020-05-11
 * Time: 17:22
 **/
public class Solution {
    public static double myPow(double x,int n) {
        long N = n;
        return myPowChild(x,N);
    }

    private static double myPowChild(double x, long N) {
        double ret = 1.0;
        if(N == 0) {
            return ret;
        }else if(N > 0) {
            if(N%2 == 0) {
                double half = myPowChild(x,N/2);
                ret = half * half;
            }else {
                double half = myPowChild(x,N/2);
                ret = half*half*x;
            }
        }else {
            ret = 1/myPowChild(x,-N);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(myPow(x,n));
    }

}
