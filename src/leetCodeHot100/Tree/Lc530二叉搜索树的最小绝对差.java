package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lc530二叉搜索树的最小绝对差 {
    List<Integer> list = new ArrayList<Integer>();

    public int isValidBST(TreeNode root) {
        //中序遍历
        inorder(root);
        int[] nums = new int[list.size() - 1];
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            nums[index++] = list.get(i) - list.get(i - 1);
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min) min = nums[i];
        }
        return min;

    }

    public List<Integer> inorder(TreeNode root) {
        if (root == null) return null;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        return list;
    }
}
