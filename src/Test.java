public class Test {
    static int max = 0;

    public static void main(String[] args) {
        int[] nums = {
                1, 5, 2, 4, 3
        };
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, helper(nums, i));
        }
        System.out.println(max);

    }

    public static int helper(int[] nums, int startIndex) {
        if (startIndex >= nums.length) return 1;
        int maxLen = 1;
        for (int i = startIndex + 1; i < nums.length; i++) {
            if(nums[i] > nums[startIndex]) maxLen = Math.max(maxLen , helper(nums,i) + 1);
        }
        return maxLen;
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[ i - 1][j];
            }
        }
        return dp[m-1][n-1];
    }


}
