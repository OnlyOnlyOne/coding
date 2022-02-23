package greedy;

public class Lc376摆动序列 {
    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length <= 1) return nums.length;
        int result = 1;
        int preDiff = 0;
        int curDiff = 0;
        for (int i = 1; i < nums.length; i++) {
            curDiff = nums[i] - nums[i - 1];
            //出现段落
            if (curDiff > 0 && preDiff <= 0 || curDiff < 0 && preDiff >= 0) {
                result++;
                preDiff = curDiff;
            }
        }
        return result;
    }


}
