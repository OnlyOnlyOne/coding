package array;

import com.sun.org.apache.xpath.internal.operations.Minus;

public class Lc704Search {
//    public int search(int[] nums, int target) {
//        //使用二分查找
//        //方法一：左闭右闭空间
//        int length = nums.length;
//        return erfenSearch(nums, 0, length - 1, target);
//
//    }
//
//    private int erfenSearch(int[] nums, int left, int right, int target) {
//        if(left<=right) return -1;
//        int length = nums.length;
//        if(nums[(right - left)/2] ==target ) return (right - left)/2;
//        int a = erfenSearch(nums,left,length/2,target);
//        int b = erfenSearch(nums,length/2+1,right,target);
//        if(a == target ) return a;
//        else if (b == target) { return b;
//        } else return -1;
//    }

    public int search(int[] nums, int target) {
        if(target<nums[0] || target > nums[nums.length - 1]) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= nums.length - 1) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else {
                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    //方法二：左必右开
    public int search2(int[] nums, int target) {
        if(target<nums[0] || target >nums[nums.length - 1]) return -1;
        int left = 0,right = nums.length ;
        while (left < right) {
            int mid = left +  (right - left)>>1;
            if(nums[mid]>target) right = mid;
            else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
