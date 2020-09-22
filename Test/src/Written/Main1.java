package Written;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-22
 * Time: 16:22
 **/
public class Main1 {
    public String changeString (String str) {
        // write code here
        StringBuffer s = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            int sum = 1;

            if(i < str.length()-1) {
                while (str.charAt(i) == str.charAt(i+1)) {
                    sum++;
                    i++;
                }
                s.append(c);
                s.append("_");
                s.append(sum);
            }

            //最后一位处理
            if(str.charAt(i) != str.charAt(i+1)) {

            }

        }

        return s.toString();

    }
}
