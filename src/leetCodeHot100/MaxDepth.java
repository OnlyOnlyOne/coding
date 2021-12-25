package leetCodeHot100;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        //dfs 就可以解决
//        int max = 0;
//        int depth = 0;
//        if (root == null) {
//            return 0;
//        }else {depth++;
//                max++;}
//
//        search(root.left, depth, max);
//        search(root.right, depth, max);
//
//        return max;
        if (root == null) {
            return 0;
        }else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }





    }

//    public void search(TreeNode root,int depth,int max) {
//        if(root == null) return;
//            else depth++;
//        if(depth>max) max=depth;
//
//        search(root.left,depth,max);
//        search(root.right, depth, max);
//
//
//    }
}
