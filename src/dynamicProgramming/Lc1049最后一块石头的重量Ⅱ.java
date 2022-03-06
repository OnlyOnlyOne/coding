package dynamicProgramming;

import java.util.Arrays;

public class Lc1049最后一块石头的重量Ⅱ {
    public static int lastStoneWeightII(int[] stones) {
        //
        int[] dp = new int[1501];
        int count = 0;
        for (int i = 0; i < stones.length; i++) {
            count += stones[i];
        }
        int target = count / 2;
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return count - dp[target] - dp[target];
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeightII(new int[]{
                2, 7, 4, 1, 8, 1
        }));
    }
}
