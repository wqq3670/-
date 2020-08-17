/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-17
 * Time: 23:54
 **/

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Main {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHight = maxDepth(root.left);
        int rightHifht = maxDepth(root.right);

        return leftHight > rightHifht ? leftHight+1 : rightHifht+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftHight = maxDepth(root.left);
        int rightHifht = maxDepth(root.right);

        return Math.abs(leftHight - rightHifht) <= 1 && isBalanced(root.left)
                && isBalanced(root.right);
    }
}
