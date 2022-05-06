public class demo7 {
    public static void reverse(int[] nums,int left,int right){
        if(left>right){
            return;
        }
        int temp=0;
        while (left < right) {
            temp= nums[right];
            nums[right]=nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
        return;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        reverse(nums, 0, 5);
        reverse(nums, 6, 11);
        reverse(nums, 0, 11);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
