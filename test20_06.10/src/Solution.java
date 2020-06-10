/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-06-10
 * Time: 23:30
 **/
public class Solution {
    public boolean isPalindrome(int x) {
        String str = x+"";
        char[] ch = new char[str.length()];
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            ch[i] = c;
        }
        int left = 0;
        int right = ch.length - 1;
        while(left < right) {
            if(ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
