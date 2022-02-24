package dynamicProgramming;

public class Lc63不同路径Ⅱ {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[m - 1].length;
        int[][] dp = new int[m][n];
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                for (int j = i; j < n; j++) {
                    dp[0][j] = 0;
                }
                break;
            } else {
                dp[0][i] = 1;
            }
        }
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                for (int j = i; j < n; j++) {
                    dp[j][0] = 0;
                }
                break;
            } else {
                dp[i][0] = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
