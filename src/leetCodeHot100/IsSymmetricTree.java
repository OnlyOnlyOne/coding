package leetCodeHot100;



public class IsSymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        //给定一个二叉树，判断是否是对称
        //解法：递归
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if(t1==null || t2==null) return false;

        return isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left)&&(t1.val==t2.val);
    }
}
