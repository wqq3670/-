import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-13
 * Time: 23:45
 **/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }

        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.println(cur.val);
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }

}
