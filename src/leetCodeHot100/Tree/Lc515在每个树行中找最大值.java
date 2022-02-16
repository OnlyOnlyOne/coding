package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Lc515在每个树行中找最大值 {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> largestValues(TreeNode root) {
        fun(root);
        return result;
    }

    public void fun(TreeNode root) {
        if(root == null) return;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            int max = Integer.MAX_VALUE;
            while (size > 0) {
                TreeNode node = deque.poll();
                max = Math.max(max, node.val);
                if(node.left!=null) deque.offer(node.left);
                if(node.right!=null) deque.offer(node.right);
                size--;
            }
            result.add(max);
        }
    }
}
