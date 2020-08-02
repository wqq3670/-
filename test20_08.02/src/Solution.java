import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-02
 * Time: 23:51
 **/

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public class Solution {
        public void flatten(TreeNode root) {
            if (root == null) {
                return;
            }
            Deque<TreeNode> stack = new LinkedList<TreeNode>();
            stack.push(root);
            TreeNode prev = null;
            while (!stack.isEmpty()) {
                TreeNode curr = stack.pop();
                if (prev != null) {
                    prev.left = null;
                    prev.right = curr;
                }
                TreeNode left = curr.left, right = curr.right;
                if (right != null) {
                    stack.push(right);
                }
                if (left != null) {
                    stack.push(left);
                }
                prev = curr;
            }
        }
    }
}


