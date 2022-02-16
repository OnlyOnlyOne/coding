package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Lc637二叉树的层平均值 {
    List<Double> result = new ArrayList<Double>();

    public List<Double> averageOfLevels(TreeNode root) {
        fun(root);
        return result;
    }

    public void fun(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            int length = deque.size();
            double sum = 0;
            while (size > 0) {
                TreeNode node = deque.poll();
                sum += node.val;
                if(node.left!=null) deque.offer(node.left);
                if(node.right!=null) deque.offer(node.right);
                size--;
            }
            result.add(sum / length);
        }
    }
}
