package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.*;

public class Lc199二叉树的右视图 {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        fun(root);
        return result;
    }

    public void fun(TreeNode root) {
        if(root == null) return;
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (size == 1) {
                    result.add(node.val);
                    if(node.left!=null) queue.offer(node.left);
                    if(node.right!=null) queue.offer(node.right);
                    size--;
                } else {
                    if(node.left!=null) queue.offer(node.left);
                    if(node.right!=null) queue.offer(node.right);
                    size --;
                }

            }
        }
    }
}
