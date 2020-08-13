/**
 * Created with IntelliJ IDEA.
 * Description:树的子结构
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * User: dell
 * Date: 2020-08-13
 * Time: 0:34
 **/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //若root1为空，则其没有子树，空树不是任意一个数的子结构
        if(root1==null || root2==null) {
            return false;
        }
        //判断root2节点是不是root1的子结构
        if(isPartSame(root1,root2)) {
            return true;
        }
        //如果不是，递归判断root2是不是root1.left的子结构，root2是不是root1.right的子结构
        return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    //递归判断root2节点是不是root1的子结构
    public boolean isPartSame(TreeNode root1,TreeNode root2) {
        //两个节点都为空，则是
        if(root1 == null && root2 == null) {
            return true;
        }
        //如果root1为空，那么root2不是其子结构
        if(root1 == null) {
            return false;
        }
        //如果root2为空，那么是任何树的子结构
        if(root2 == null) {
            return true;
        }
        //判断当前节点的值是否相等
        if(root1.val != root2.val) {
            return false;
        }
        //递归判断其左右节点
        return isPartSame(root1.left,root2.left) && isPartSame(root1.right,root2.right);
    }
}
