package greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lc1005K次取反后最大化的数组和 {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        //部分最大推全局最大
        nums = IntStream.of(nums)
                .boxed()
                .sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();
        int index = 0;
        while (k > 0 && index < nums.length) {
            if (nums[index] >= 0) {
                index++;
            } else {
                nums[index] = - nums[index];
                index++;
                k--;
            }
        }
        if (k > 0) {
            while (k > 0) {
                nums[nums.length - 1] = -nums[nums.length - 1];
                k--;
            }
        }
        return Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {
        int[] nums = {
                2, -3, -1, 5, -4
        };
        System.out.println(largestSumAfterKNegations(nums,2));
    }
}
