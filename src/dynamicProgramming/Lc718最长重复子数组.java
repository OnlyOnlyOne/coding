package dynamicProgramming;

import com.sun.xml.internal.ws.spi.db.DatabindingProvider;

public class Lc718最长重复子数组 {
    public int findLength(int[] nums1, int[] nums2) {
        //dp[i][j]从dp[i-1][j-1]+1推出来
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int result = 0;
        for (int i = 1; i < nums1.length; i++) {
            for (int j = 1; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
        return result;
    }
}
