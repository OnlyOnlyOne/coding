package array;

public class Lc209minSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        //滑动窗口的妙点在于：可以根据当前子序列和大小的情况，修改子序列的起始位置
        int left = 0;
        int length = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while( sum >= s) {
                length = Math.min(length, i - left + 1);
                sum-=nums[left++];
            }
        }
        return length == Integer.MIN_VALUE ? 0 : length;
    }
}
