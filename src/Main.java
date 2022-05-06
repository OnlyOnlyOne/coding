import leetCodeHot100.TreeNode;
import 复习.美团.main;

import java.util.*;

public class Main {
    static int min = Integer.MAX_VALUE;
    public List<List<Integer>> resList = new ArrayList<List<Integer>>();

    //    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//
//    }
    List<Integer> path = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int max = Math.abs(A - B);
        helper(A, B, max, 0);
        System.out.println(min);

    }

    public static void helper(int A, int B, int max, int c) {
        if (c > max) return;
        int temp = Math.abs(A - B);
        if (temp > max) return;
        if (A == B) {
            min = Math.min(min, c);
            return;
        }
        max = Math.abs(A - B);
        for (int i = 0; i < 2; i++) {
            //A变
            //奇数,n/2
            if (A % 2 == 1) {
                A = A / 2;
                helper(A, B, max, c + 1);
                A = A * 2 + 1;
            } else {
                A = A / 2;
                helper(A, B, max, c + 1);
                A = A * 2;
            }
            //n + 1
            A = A + 1;
            helper(A, B, max, c + 1);
            A = A - 1;
            //2n
            A = A * 2;
            helper(A, B, max, c + 1);
            A = A / 2;
            //B变
            if (B % 2 == 1) {
                B = B / 2;
                helper(A, B, max, c + 1);
                B = B * 2 + 1;
            } else {
                B = B / 2;
                helper(A, B, max, c + 1);
                B = B * 2;
            }
            //n + 1
            B = B + 1;
            helper(A, B, max, c + 1);
            B = B - 1;
            //2n
            B = B * 2;
            helper(A, B, max, c + 1);
            B = B / 2;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        // postorder(root,list);
        // return list;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        Collections.reverse(list);
        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if (root == null) return list;

        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode node = stack.pop();
                list.add(node.val);
                cur = node.right;
            }
        }

        return list;
    }

    //BFS--迭代方法--借助队列，层序遍历
    public void checkFun02(TreeNode node) {
        if (node == null) return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            List<Integer> items = new ArrayList<Integer>();
            int len = queue.size();
            while (len > 0) {
                TreeNode n = queue.poll();
                items.add(n.val);
                if (n.left != null) queue.offer(n.left);
                if (n.right != null) queue.offer(n.right);
                len--;
            }

        }
    }


}
