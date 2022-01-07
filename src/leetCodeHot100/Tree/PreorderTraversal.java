package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;
import sun.reflect.generics.tree.Tree;

import javax.xml.transform.Result;
import java.util.*;

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
//        preorder(root, result);
        //前序遍历栈的实现
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                result.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return result;

    }

    public void preorder(TreeNode r, List<Integer> result) {
        if (r == null) {
            return;
        }
        result.add(r.val);
        preorder(r.left, result);
        preorder(r.right, result);
    }


}
