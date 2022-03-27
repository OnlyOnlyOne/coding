package 网易;

import java.util.Scanner;

public class Demo1 {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        //回溯加动态
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[][] cross = new int[n][m];
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cross[i][j] = input.nextInt();
            }
        }

        //先考虑可以向下向右
        for (int i = 1; i < m; i++) {
            if (cross[0][i] == cross[0][i - 1]) {
                dp[0][i] = dp[0][i - 1] + 1;
            } else {
                dp[0][i] = dp[0][i - 1] + 2;
            }
        }

        for (int j = 1; j < n; j++) {
            if (cross[j][0] == cross[j - 1][0]) {
                dp[j][0] = dp[j-1][0] + 1;
            } else {
                dp[j][0] = dp[j-1][0] + 2;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                //从上下来
                int up = 0;
                if (cross[i][j] == cross[i - 1][j]) {
                    up = dp[i - 1][j] + 1;
                } else {
                    up = dp[i - 1][j] + 2;
                }
                int left = 0;
                if (cross[i][j - 1] == cross[i][j]) {
                    left = dp[i][j - 1] + 1;
                } else {
                    left = dp[i][j - 1] + 2;
                }
                dp[i][j] = Math.min(up, left);
            }
        }
        System.out.println(dp[n-1][m-1]);
    }

//    public static void backtracking(int[][] cross, int row, int col) {
//
//    }
}
