/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-08-06
 * Time: 14:38
 **/
public class Main {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null && q != null || p != null && q == null) {//结构不相同
            return false;
        }
        if(p.val != q.val) {//值不同
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);


    }
}
