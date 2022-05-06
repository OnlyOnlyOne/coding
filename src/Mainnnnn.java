import java.util.Scanner;

public class Mainnnnn {
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0; i < n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(n, nums));
    }

    public static int solution(int n, int[] nums) {
        TreeNode root = build(nums,0);
        return burn(root);
    }

    public static int burn(TreeNode root) {
        if (dfs(root) == 0) {
            result++;
        }
        return result;
    }

    public static int dfs(TreeNode root) {
        if (root == null) {
            return 2;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (left == 2 && right == 2) {
            return 0;
        } else if (left == 0 || right == 0) {
            result++;
            return 1;
        } else {
            return 2;
        }
    }

    public static TreeNode build(int[] nums, int startIndex) {
        TreeNode root = null;
        if (startIndex < nums.length && nums[startIndex] != -1) {
            root = new TreeNode(nums[startIndex]);
        } else{
            return root;
        }
        root.left = build(nums,(startIndex + 1) * 2 -1);
        root.right = build(nums,(startIndex + 1) * 2 );
        return root;
    }


    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){};

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
