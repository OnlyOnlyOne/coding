package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

public class Lc700二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if(val == root.val) return root;
        //到右子树查
        TreeNode node = null;
        if (val > root.val && root.right != null) {
            node = searchBST(root.right, val);
        } else if (val < root.val && root.left != null) {
            node = searchBST(root.left, val);
        }
        return node;
    }
}
