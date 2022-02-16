package leetCodeHot100.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Lc429N叉树的层序遍历 {
    List<List<Integer>> resLists = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(Node root) {
        fun(root);
        return resLists;
    }

    public void fun(Node root) {
        if(root==null) return;
        Deque<Node> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> temp = new ArrayList<>();
            while (size > 0) {
                Node node = deque.poll();
                temp.add(node.val);
                if (node.children != null) {
                    for (Node n : node.children) {
                        deque.offer(n);
                    }
                }
                size--;
            }
            resLists.add(temp);
        }
    }
}
