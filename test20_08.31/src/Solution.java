import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-31
 * Time: 23:56
 **/
public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size(), num = 0;
        boolean[] vis = new boolean[n];
        Queue<Integer> que = new LinkedList<Integer>();
        vis[0] = true;
        que.offer(0);
        while (!que.isEmpty()) {
            int x = que.poll();
            num++;
            for (int it : rooms.get(x)) {
                if (!vis[it]) {
                    vis[it] = true;
                    que.offer(it);
                }
            }
        }
        return num == n;
    }


}
