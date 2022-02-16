package leetCodeHot100.Tree;

import java.util.Deque;
import java.util.LinkedList;

public class Lc116填充每个节点的下一个右侧节点指针 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
        public Node connect(Node root) {
            if(root == null) return root;
            Deque<Node> deque = new LinkedList<>();
            deque.offer(root);
            while (!deque.isEmpty()) {
                int size = deque.size();
                while (size > 0) {
                    Node node = deque.poll();
                    if (size == 1) {
                        node.next = null;
                        if (node.left != null) deque.offer(node.left);
                        if (node.right != null) deque.offer(node.right);
                        size--;
                    } else {
                        node.next = deque.getFirst();
                        if (node.left != null) deque.offer(node.left);
                        if (node.right != null) deque.offer(node.right);
                        size--;
                    }
                }

            }
            return root;
            }
        }


}

