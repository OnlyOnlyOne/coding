package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.Arrays;

public class Lc654最大二叉树 {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return getMaximum(nums, 0, nums.length - 1);
    }

    public static  TreeNode getMaximum(int[] nums,  int left, int right) {
        if(left>right) return null;
        int max = nums[left];
        int index = left;
        //获得最大值
        for (int i = left; i < right - left; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode l = getMaximum(nums, left, index - 1);
        TreeNode r = getMaximum(nums, index + 1, right);
        TreeNode node = new TreeNode(nums[index], l, r);
        return node;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 6, 0, 5};
        constructMaximumBinaryTree(nums);
    }
}
