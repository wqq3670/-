/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-06
 * Time: 23:32
 **/
public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int endday= days[days.length-1];// 最后一天
        int [] allay = new int[endday+1]; // 没必要到第365天
        int dayidex=0;
        allay[0]=0;
        int a,b,c;
        // 第一天到最后一天
        for(int i=1;i<=endday;i++){
            // 这一天不是旅游日
            if(i!=days[dayidex]){
                allay[i]=allay[i-1];
            }
            // 是旅游日
            else {
                // 分别判断和一天前，一周前，一月前买票
                // 要判断倒退一天，七天。。前是否越界

                a=allay[i-1]+costs[0];
                if(i-7>=0)
                    b=allay[i-7]+costs[1];
                else b=costs[1];

                if(i-30>=0)
                    c=allay[i-30]+costs[2];
                else c=costs[2];

                allay[i]=Math.min(a,Math.min(b,c));
                dayidex++;
            }
        }
        return allay[endday];

    }
}
