package greedy;

public class Lc45跳跃游戏Ⅱ {
    public static int jump(int[] nums) {
        if(nums.length <=1) return 0;
        int  step = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i + nums[i] >= nums.length - 1) return step + 1;
            int cover = i+nums[i];
            int cover1 = 0;
            for (int j = i + 1; j <= cover; j++) {
//                i = cover1 >= nums[j] + j?i:j;
                if (cover1 >= nums[j] + j) {
                    continue;
                } else {
                    cover1 = nums[j] + j;
                    i = j - 1;
                }
            }
            step++;
        }
        return step++;
    }

    public static void main(String[] args) {
        int[] n = {2, 3, 0, 1, 4};
        jump(n);
    }
}
