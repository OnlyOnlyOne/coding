package array;

public class Lc209minSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        //滑动窗口的妙点在于：可以根据当前子序列和大小的情况，修改子序列的起始位置

        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
