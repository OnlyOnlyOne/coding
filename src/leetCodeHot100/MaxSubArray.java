package leetCodeHot100;

//给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//子数组 是数组中的一个连续部分。

import java.io.PrintWriter;
import java.sql.SQLOutput;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for (int j = 1; j < nums.length; j++) {
            int temp = sum + nums[j];
            if (temp<nums[j]) {
                sum = nums[j];
            }else{
                sum = temp;
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static int maxSubArray2(int[] nums) {
        //采用贪心算法
        if(nums.length == 1) return nums[0];
        int result = 0;
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
            sum = Math.max(sum, result);
            if(result <= 0) result = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray(nums);
        System.out.println(max);
    }
}
