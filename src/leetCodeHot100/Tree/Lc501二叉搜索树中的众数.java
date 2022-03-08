package leetCodeHot100.Tree;

import leetCodeHot100.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Lc501二叉搜索树中的众数 {
    List<Integer> res = new ArrayList<Integer>();
    int count = 0 ;
    int maxCount = 0;
    TreeNode pre = null;
    public int[] findMode(TreeNode root) {
        //中序遍历-不使用额外的空间，利用二叉搜索树的特性
        findMode1(root);
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    public void findMode1(TreeNode root) {
        if(root == null) return;

        findMode1(root.left);
        int cur = root.val;

        if (pre == null || cur != pre.val) {
            count = 1;
        } else {
            count++;
        }
        if(count==maxCount) res.add(cur);
        if (count > maxCount) {
            res.clear();
            res.add(cur);
            maxCount = count;
        }
        pre = root;
        findMode1(root.right);
    }

}
