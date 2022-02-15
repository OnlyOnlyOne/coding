package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;
import sun.reflect.generics.tree.Tree;

import javax.xml.transform.Result;
import java.util.*;

public class PreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
////        preorder(root, result);
//        //前序遍历栈的实现
//        Deque<TreeNode> stack = new LinkedList<TreeNode>();
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                result.add(root.val);
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            root = root.right;
//        }
//        return result;
        List<Integer> result = new ArrayList<>();
        // Deque<TreeNode> stack = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return result;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.right!=null){
                stack.push(node.left);
            }
        }
        return result;

    }

    public void preorder(TreeNode r, List<Integer> result) {
        if (r == null) {
            return;
        }
        result.add(r.val);
        preorder(r.left, result);
        preorder(r.right, result);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        preorderTraversal(treeNode);
    }


}
