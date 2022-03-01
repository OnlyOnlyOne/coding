package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;
import sun.font.TrueTypeFont;

public class Lc112路径总和 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (root.val - targetSum == 0) {
                return true;
            }
        }
        boolean flag=false;
        boolean flag1=false;
        if(root.left!=null) {
             flag = hasPathSum(root.left, targetSum - root.val);
        }
        if (root.right != null) {
             flag1 = hasPathSum(root.right, targetSum - root.val);
        }

        return flag||flag1;

    }
}
