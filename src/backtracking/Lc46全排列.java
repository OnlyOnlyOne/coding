package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Lc46全排列 {
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        int[] used = new int[nums.length];
        backtracking(nums, used);
        return result;
    }

    public static void backtracking(int[] nums, int[] used) {
//        for (int i = 0; i < nums.length; i++) {
        if (path.size() == nums.length) {
            result.add(path);
            return;
        }
        for (int j = 0; j < used.length; j++) {
            if (used[j] == 1) {
                continue;
            }
                path.add(nums[j]);
                used[j] = 1;
                backtracking(nums, used);
                used[j] = 0;
                path.remove(path.size() - 1);

        }
    }

    public static void main(String[] args) {
        int[] nums = {
                1, 2, 3
        };

        permute(nums);
    }
}
