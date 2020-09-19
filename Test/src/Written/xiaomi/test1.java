package Written.xiaomi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-15
 * Time: 19:28
 **/
public class test1 {
    static int[] primeFactorization(int num) {

        //1.拿到一个数，先判断其是不是质数
        List<Integer> list = new ArrayList<>();
        if(num <= 3) {
            list.add(num);
        }
        for (int i = 2; i <= num ; i++) {
            if(num % i == 0) {
                list.add(i);
                num /= i;
                i = 1;
            }
        }

        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {

            ret[i] = list.get(i);
        }
        return ret;
    }

    /**
     * 判断一个数是不是素数
     * @param num
     * @return
     */
    private static boolean isZhiShu(int num) {
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _num;
        _num = Integer.parseInt(in.nextLine().trim());

        res = primeFactorization(_num);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
