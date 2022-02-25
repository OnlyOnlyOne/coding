package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;


public class Lc222完全二叉树的节点个数 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
//        int count = 0;
//        TreeNode cur = root;
//        while (cur != null) {
//            count++;
//            cur = cur.left;
//        }
        int num = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
//        int lever = 0;
        while (!queue.isEmpty()) {
//            lever++;
            int size = queue.size();
//            if (lever == count) {
//                num += size;
//                break;
//            } else {
                while (size > 0) {
                    TreeNode node = queue.poll();
                    num ++;
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                    size--;
                }
            }
        return num;
        }
//        return (int) Math.pow(2,count - 1) - 1 + num;
    }





