package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

public class IsBalance {
    public boolean isBalance(TreeNode root) {
        if(root == null) return true;

        int res = compare(root);
        return res!=-1;
    }

    public int compare(TreeNode root) {
        if(root ==null) return 0;
        int left = compare(root.left);
        int right = compare(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) >1) {
            return -1;
        }
        return Math.max(left,right) + 1;
    }
}
