//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: dell
// * Date: 2020-08-16
// * Time: 17:27
// **/
//public class Main4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        String[] strings = str.split(" ");
//        int N = Integer.parseInt(strings[0]);//读者数
//        int M = Integer.parseInt(strings[1]);//图书数
//
//        int[] arrM = new int[M]; //图书对应的读者喜欢的个数
//        String[] arrN = new String[N];//每个arrN[i]代表读者喜欢书的编号
//        for (int i = 2; i < strings.length; i++) {
//            arrN[i-2] = strings[i];
//        }
//        for (int i = 0; i < arrN.length; i++) {
//            int tmp = Integer.parseInt(arrN[i])-1;
//            arrM[tmp]++;
//        }
//
//        for (int i = 0; i < arrM.length; i++) {
//            if(arrM[i] > 1) {
//                sout
//            }
//        }
//
//
//    }
//}
