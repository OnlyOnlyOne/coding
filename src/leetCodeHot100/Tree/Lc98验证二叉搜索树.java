package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Lc98验证二叉搜索树 {
    List<Integer> list = new ArrayList<Integer>();

    public boolean isValidBST(TreeNode root) {
        //中序遍历
        inorder(root);
        if (list.size() <= 1) return true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) return false;
        }
        return true;
    }

    public List<Integer> inorder(TreeNode root) {
        if (root == null) return null;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        return list;
    }
}
