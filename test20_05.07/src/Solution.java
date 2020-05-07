/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-07
 * Time: 23:52
 **/

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // s t 均为空
        if(s == null && t == null) {
            return false;
        }
        //s t 是相同的树
        if(isSametree(s,t)) {
            return true;
        }
        //s空 t不空的情况
        if(s==null && t!=null) {
            return false;
        }
        //s不空 t空的情况
        if(s!=null && t==null) {
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);

    }
    //判断是否为相同的树
    public boolean isSametree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if((p==null && q!=null)||(p!=null && q==null)) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSametree(p.left,q.left) && isSametree(p.right,q.right);
    }
}
