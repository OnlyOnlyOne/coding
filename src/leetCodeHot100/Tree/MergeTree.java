package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.List;

public class MergeTree {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode treeNode = new TreeNode();
        preorder(root1, root2, treeNode);
        return treeNode;
    }

    public void preorder(TreeNode root1, TreeNode root2,TreeNode res) {
        if (root1 == null && root2 == null) {
            res =null;
        }
        if (root1 != null && root2 != null) {
            res.val = root1.val + root2.val;
        } else if(root1 == null && root2 != null){
            res.val = root2.val;
        } else {
            res.val = root1.val;
        }

        preorder(root1.left, root2.left,res.left);
        preorder(root1.right, root2.right,res.right);
    }
}
