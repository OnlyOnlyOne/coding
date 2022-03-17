package dynamicProgramming;

import java.util.Arrays;
import java.util.Map;

public class Lc674最长连续递增序列 {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i-1] + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
