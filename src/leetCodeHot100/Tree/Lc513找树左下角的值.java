package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lc513找树左下角的值 {

    public static int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        int value = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            value = deque.getFirst().val;
            while (size > 0) {
                TreeNode node = deque.poll();
                if(node.left!=null) deque.offer(node.left);
                if(node.right!=null) deque.offer(node.right);
                size--;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(findBottomLeftValue(root));
    }
}
