package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.*;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        //利用栈实现中序遍历
//
//        indoor(root,result);
//
//        return result;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }

        return result;

    }

    public void indoor(TreeNode tree,List<Integer> result){
        if(tree == null)
            return;
        indoor(tree.left,result);
        result.add(tree.val);
        indoor(tree.right,result);
    }
}
