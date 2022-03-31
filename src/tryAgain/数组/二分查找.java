package tryAgain.数组;

public class 二分查找 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length ;
        int mid = -1;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return mid;
    }
}
