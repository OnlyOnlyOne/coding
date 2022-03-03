package dynamicProgramming;

public class Lc96不同的二叉搜索树 {
    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
                System.out.println(dp[i]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        numTrees(3);
    }
}
