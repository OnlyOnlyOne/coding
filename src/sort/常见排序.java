package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 常见排序 {
    public static void quickSort(int[] nums, int left, int right) {
        if(left > right) return;
        int temp = nums[left];
        int a = left;
        int b = right;
        while (left < right) {
            while (left < right && nums[right] >= temp) {
                right--;
            }

            while (left < right && nums[left] <= temp) {
                left++;
            }
            if(left < right){
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
            }
        }
        nums[a] = nums[left];
        nums[left] = temp;
        quickSort(nums, a, left - 1);
        quickSort(nums, left + 1, b);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > 0) return res;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }else if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
//        int[] nums = {
//                3,5,1,7,6
//        };
//        quickSort(nums, 0, nums.length - 1);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//
//        List<Integer> list = new ArrayList<Integer>();
//        test(list);
//
//        System.out.println();
//        int[] nums = {
//                -1,0,1,2,-1,-4
//        };
//        List<List<Integer>> res = threeSum(nums);
//        System.out.println(res);
        System.out.println(21 & -1);

    }
    public static void test(List<Integer> nums){
        nums.add(1);
    }
}
