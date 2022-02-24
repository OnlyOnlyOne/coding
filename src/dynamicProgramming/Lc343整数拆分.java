package dynamicProgramming;

public class Lc343整数拆分 {
    public static int integerBreak(int n) {
        if(n==1) return 1;
        if(n==2) return 1;
        int[] dp = new int[n];
        dp[2] = 1;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(Math.max(j * (i - j), j * dp[i - j]), dp[i]);
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        integerBreak(2);
    }
}
