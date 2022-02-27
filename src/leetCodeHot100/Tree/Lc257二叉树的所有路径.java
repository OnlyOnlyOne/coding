package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Lc257二叉树的所有路径 {
    //按任意顺序，返回所有从根节点到叶子节点的路径
    List<String> paths = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {

        if(root == null) return paths;
        String s = "" + root.val;
        getPaths(root, s);
        return paths;
    }

    public void getPaths(TreeNode root, String s) {
        if(root == null) return;
        if (root.left == null && root.right == null) {

            paths.add(s);
            return;
        }


        if (root.right != null) {
            getPaths(root.right,s + "->" + root.right.val);
        }
        if (root.left != null) {
            getPaths(root.left,s + "->" + root.left.val);
        }
    }
}
