package leetCodeHot100;

public class SortColors {
    public void sortColors(int[] nums) {
        //冒泡
        int n = nums.length;
        int temp ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

}
