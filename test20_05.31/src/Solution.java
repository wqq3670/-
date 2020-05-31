/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-31
 * Time: 23:50
 **/
public class Solution {
    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        if(leftTree == null && rightTree == null) {
            return true;
        }
        if(leftTree == null && rightTree != null || leftTree != null && rightTree == null) {
            return false;
        }
        return leftTree.val == rightTree.val && isSymmetricChild(leftTree.left,rightTree.right)
                && isSymmetricChild(leftTree.right,rightTree.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
}
