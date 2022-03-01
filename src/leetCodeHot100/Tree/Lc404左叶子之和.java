package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

public class Lc404左叶子之和 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);

        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        return left + right + sum;
    }
}
