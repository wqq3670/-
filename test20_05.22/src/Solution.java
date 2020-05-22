/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-22
 * Time: 23:51
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    int i = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(preorder,inorder,0,preorder.length-1);
    }

    public TreeNode create(int[] preorder, int[] inorder,int left,int right){
        // 限定范围
        if(left > right)
            return null;
        // 从左范围出发，从中序遍历中找到与根节点相同的值
        int j = left;
        while(j <= right && preorder[i] != inorder[j])
            j++;
        // 构造树，并将i指向下一位
        TreeNode root = new TreeNode(preorder[i++]);
        // 根据中序遍历左区间，构造左子树
        root.left = create(preorder,inorder,left,j-1);
        // 根据中序遍历有区间，构造右子树
        root.right = create(preorder,inorder,j+1,right);
        return root;
    }
}
