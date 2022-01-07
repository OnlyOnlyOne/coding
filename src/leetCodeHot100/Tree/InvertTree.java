package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        //反转二叉树
        if(root == null) return null;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
