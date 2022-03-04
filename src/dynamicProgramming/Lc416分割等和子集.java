package dynamicProgramming;

public class Lc416分割等和子集 {
    public static boolean canPartition(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        if(count%2==1) return false;
        int sum = count / 2;
        int[] dp = new int[sum + 1];

        for (int i = 0; i < nums.length; i++) {
            for(int j = sum;j>=nums[i];j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        if(dp[sum] == sum) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,4,5};
        canPartition(nums);
    }
}
