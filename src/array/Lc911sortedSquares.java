package array;

public class Lc911sortedSquares {
    public int[] sortedSquares(int[] nums) {
        //利用双指针
        int left = 0, right = nums.length - 1;
        int[] result = new int[nums.length];
        int i = nums.length - 1;
        while (left < right) {
            if (nums[left] * nums[left] < nums[right] * nums[right]) {
                result[i] = nums[right] * nums[right];
                i--;
                right--;
            } else {
                result[i] = nums[left] * nums[left];
                i--;
                left++;
            }
        }
        result[i] = nums[left] * nums[left];
        return result;
    }
}
