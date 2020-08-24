/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-24
 * Time: 23:53
 **/
public class Main6 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int r = n/2; r >= 1; r--){
            if(n % r == 0){
                String substring = s.substring(0, r);
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < n / r; i++){
                    sb.append(substring);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;


    }
}
