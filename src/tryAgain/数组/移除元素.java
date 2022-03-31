package tryAgain.数组;

public class 移除元素 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        while (index < nums.length) {
            if (nums[index] != val) {
                nums[index - count] = nums[index];
                index++;
            } else {
                count++;
                index++;
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] nums = {
                0,1,2,2,3,0,4,2

        };
        removeElement(nums, 2);
        System.out.println(removeElement(nums, 2));
    }
}
