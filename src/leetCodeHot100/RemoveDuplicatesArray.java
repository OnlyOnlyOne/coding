package leetCodeHot100;

import java.sql.SQLOutput;

public class RemoveDuplicatesArray {
    public  static int removeDuplicates(int[] nums) {
        //删除有序数组中的重复项，使用原地空间
        int count = 0;
        if(nums.length <= 0) return 0;
        int cur1 = 0;
        int cur2 = 1;
        while (cur2 < nums.length) {
            if (nums[cur1] != nums[cur2]) {
                nums[cur2-count] = nums[cur2];
                cur1++;
                cur2++;
            }else {
                count++;
                cur2++;
            }
        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 4, 5, 6};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
}
