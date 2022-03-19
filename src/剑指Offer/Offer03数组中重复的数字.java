package 剑指Offer;

public class Offer03数组中重复的数字 {
    public static int findRepeatNumber(int[] nums) {
        int number = -1;
        for (int i = 0; i < nums.length; i++) {
            while(i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    number = nums[i];
                    break;
                } else {
                    int temp = nums[i];
                    nums[i] = nums[nums[i]];
                    nums[temp] = temp;
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] nums = {
                3, 4, 2, 0, 0, 1
        };
        findRepeatNumber(nums);
    }
}
