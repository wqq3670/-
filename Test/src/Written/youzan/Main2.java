package Written.youzan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-10-11
 * Time: 19:31
 **/
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

  }
public class Main2 {
    public int[] leftSideView (TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        q1.offer(root);
        while(!q1.isEmpty() || !q2.isEmpty()) {
            Queue<TreeNode> q3;
            Queue<TreeNode> qtmp;
            if(q1.isEmpty()) {
                q3 = q2;
                qtmp = q1;
            }else {
                q3 = q1;
                qtmp = q2;
            }
            list.add(q3.peek().val);
            while(!q3.isEmpty()) {
                TreeNode cur = q3.poll();
                if(cur.left != null) {
                    qtmp.offer(cur.left);
                }
                if(cur.right != null) {
                    qtmp.offer(cur.right);
                }
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
