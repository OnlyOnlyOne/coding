package 剑指Offer.美团;

import java.util.Arrays;
import java.util.Scanner;

public class 淘汰分数 {
    public static int score(int[] nums, int n, int x, int y) {
        if(x>n) return -1;
        if(x>y) return -1;
        Arrays.sort(nums);
        int size = nums.length;
        //x是晋级人数 y是淘汰人数
        int index = 0;
        int min = Integer.MAX_VALUE;
        while (index <= y) {
            if(index<x) {
                index++;
                continue ;
            }
            int success = n - index - 1;
            if(success<=y&&success>=x) min = Math.min(min, nums[index]);
            index++;
        }
        return min==Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(score(nums, n, x, y));
    }
}
