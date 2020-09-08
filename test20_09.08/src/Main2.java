import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-08
 * Time: 20:33
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String[] s1 = str1.split(" ");
        int[] perArr = new int[s1.length];
        for (int i = 0; i < perArr.length; i++) {
            perArr[i] = Integer.parseInt(s1[i]);
        }

        String[] s2 = str2.split(" ");
        int[] taskArr = new int[s2.length];
        for (int i = 0; i < taskArr.length; i++) {
            taskArr[i] = Integer.parseInt(s2[i]);
        }


        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < taskArr.length; i++) {
            if(map.containsKey(taskArr[i])) {
                map.put(taskArr[i],map.get(taskArr[i])+1);
            }else {
                map.put(taskArr[i],1);
            }
        }
        int ret = 0;
        for (int i = 0; i < perArr.length; i++) {
            if(map.containsKey(perArr[i])) {
                if(map.get(perArr[i])>0){
                    ret++;
                    map.put(perArr[i],map.get(perArr[i])-1);
                }else{
                    map.remove(perArr[i]);
                }
            }
        }
        System.out.println(ret);
    }


    public static int[] func1(String str) {
        String[] strings = str.split(" ");
        int[] arr = new int[strings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        return arr;
    }
}
