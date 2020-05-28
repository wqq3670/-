/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-28
 * Time: 23:55
 **/
public class Solution {
    public String decodeString(String s) {
        LinkedList<Integer> numStack = new LinkedList();
        LinkedList<String> strStack = new LinkedList();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            } else if (c == '[') {
                if (num > 0) numStack.push(num);
                strStack.push(sb.toString());
                sb = new StringBuilder();
                num = 0;
            } else {
                //c==']'
                StringBuilder preSB = new StringBuilder().append(strStack.pop());
                int times = numStack.pop();
                for (int j = 0; j < times; j++) {
                    preSB.append(sb);
                }
                sb = preSB;
            }
        }
        return sb.toString();


    }
}
