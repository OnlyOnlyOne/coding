import leetCodeHot100.TreeNode;
import 复习.美团.main;

public class Test2 {
    static int result = 0;
    public int dfs(Mainnnnn.TreeNode root){
        //结束条件
        //0代表无覆盖 1代表有相机 2代表有覆盖
        if(root == null) return 2;

        int left = dfs(root.left);
        int right = dfs(root.right);
        if(left == 0  || right == 0){
            result++;
            return 1;}
        if(left == 1 || left == 1) return 2;
        return 0;

    }

    public static Mainnnnn.TreeNode build(int[] nums, int startIndex) {
        Mainnnnn.TreeNode root = null;
        if (startIndex < nums.length && nums[startIndex] != -1) {
            root = new Mainnnnn.TreeNode(nums[startIndex]);
        } else{
            return root;
        }
        root.left = build(nums,(startIndex + 1) * 2 -1);
        root.right = build(nums,(startIndex + 1) * 2 );
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {
                1,1,-1,1,1
        };
        Mainnnnn.TreeNode root = build(nums,5);

        System.out.println();
    }
    static class TreeNode{
        int val;
        Mainnnnn.TreeNode left;
        Mainnnnn.TreeNode right;

        public TreeNode(){};

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
