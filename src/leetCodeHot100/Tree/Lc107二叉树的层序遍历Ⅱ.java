package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.*;

public class Lc107二叉树的层序遍历Ⅱ {
    List<List<Integer>> resLists = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        fun(root);
        return resLists;
    }

    public void fun(TreeNode root) {
        if(root==null) return;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            while (size > 0) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
                size--;
            }
            resLists.add(temp);
        }
        Collections.reverse(resLists);

    }


}
