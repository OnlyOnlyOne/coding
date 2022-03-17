package 剑指Offer;

import leetCodeHot100.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class CreateTreeByArray {
    public TreeNode createTree(int[] nums) {
        List<TreeNode> tree = new ArrayList<TreeNode>();
        TreeNode root = null;
        for (int i = 0; i < nums.length; i++) {
            TreeNode node = null;
            if (nums[i] != -1) {
                node = new TreeNode(nums[i]);
                tree.add(node);
            }
            if(i==0) root = node;
        }
        for (int i = 0; i * 2 + 2 < tree.size(); i++) {
            if (tree.get(i)!=null) {
                // 线性存储转连式存储关键逻辑
                tree.get(i).setLeft(tree.get(i * i + 1));
                tree.get(i).setRight(tree.get(i * i + 2));
            }
        }
        return root;
    }
}
