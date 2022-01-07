package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode preAccess = null;
        //循环遍历
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == preAccess) {
                result.add(root.val);
                preAccess = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
//        postorder(root, result);
        return result;
    }

    public void postorder(TreeNode r, List<Integer> result) {
        if (r == null) {
            return;
        }
        result.add(r.val);
        postorder(r.left, result);
        postorder(r.right, result);
        result.add(r.val);
    }
}
