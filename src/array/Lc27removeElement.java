package array;

import java.sql.SQLOutput;

public class Lc27removeElement {
    public static int removeElement(int[] nums, int val) {
        //移除元素
        //其实本质就是快慢指针
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                total++;
                continue;
            }
            nums[i-total] = nums[i];
        }
        return nums.length-total;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums,2));
    }
}
