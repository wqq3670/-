//package bishi;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: dell
// * Date: 2020-09-15
// * Time: 20:11
// **/
//public class te2 {
//    int row = 0;
//    int col = 0;
//    int target = 0;
//    public boolean exits(char[][] board, String word) {
//        if(board == null) {
//            return false;
//        }
//        row = board.length;
//        col = board[0].length;
//        boolean[][]  isVisted = new boolean[row][col];
//        target = word.length();
//        char[] chars = word.toCharArray();
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if(dfs(0,i,j,isVisted,chars,board)) {
//                    return  true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private boolean dfs(int index, int i, int j, boolean[][] isVisted,
//                        char[] chars, char[][] board) {
//        if(chars[index] != board[i][j]) {
//            return false;
//        }
//        if(index == target-1) {
//            return true;
//        }
//        isVisted[i][j] = true;
//        if(i+1<row && !isVisted[i+1][j] && dfs(index+1,i+1,j,isVisted,chars,board)) {
//            return true;
//        }
//
//        if(j+1<col && !isVisted[i][j+1] && dfs(index+1,i,j+1,isVisted,chars,board)) {
//            return true;
//        }
//
//        if(i-1>=0 && !isVisted[i-1][j] && dfs(index+1,i-1,j,isVisted,chars,board)) {
//            return true;
//        }
//
//        if(j-1>=0 && !isVisted[i][j-1] && dfs(index+1,i,j-1,isVisted,chars,board)) {
//            return true;
//        }
//        isVisted[i][j] = false;
//        return false;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str0 = sc.nextLine();
//        String[] arr0 = str0.split(",");
//        HashMap<String,Integer> map = new HashMap<>();
//
//
//        for (int i = 0; i < arr0.length; i++) {
//            String m = arr0[i];
//            if(map.containsKey(m)) {
//                map.put(m,map.get(m)+1);
//            }else {
//                map.put(m,1);
//            }
//        }
//
//        boolean f = true;
//        String end = new String();
//
//        while(f) {
//            String str = sc.nextLine();
//            if(!str.contains(",")) {
//                f = false;
//                end = str;
//                break;
//            }
//
//            String[] arr = str.split(",");
//            for (int i = 0; i < arr.length ; i++) {
//                String m = arr[i];
//                if(map.containsKey(m)) {
//                    map.put(m,map.get(m)+1);
//                }else {
//                    map.put(m,1);
//                }
//            }
//        }
//
//        String[] array = end.split("");
//        System.out.println(exits(array,map));
//     }
//
//
//}
