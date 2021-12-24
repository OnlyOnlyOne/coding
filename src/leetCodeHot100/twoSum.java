package leetCodeHot100;

import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>(nums.length);
        int[] index = new int[2];
        Integer res = 0;

        for (int i = 0; i < nums.length; i++) {
            res = target - nums[i];
            if (result.get(res) != null) {
                index[0] = i;
                index[1] = result.get(res).intValue();
                break;
            }
            result.put(nums[i], i);
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {8, 5, 3, 2, 4};
        int target = 11;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
