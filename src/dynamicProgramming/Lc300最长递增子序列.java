package dynamicProgramming;

import java.util.Arrays;

public class Lc300最长递增子序列 {
    public static int lengthOfLIS(int[] nums) {
        if(nums.length == 1) return 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            result = Math.max(result,dp[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {
                1, 3, 6, 7, 9, 4, 10, 5, 6
        };
        lengthOfLIS(nums);
        System.out.println("1");
    }
}
