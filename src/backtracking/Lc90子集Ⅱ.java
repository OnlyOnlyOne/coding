package backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc90子集Ⅱ {
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int[] flags = new int[nums.length];
        backtracking(nums, flags,0);
        return result;
    }

    public static void backtracking(int[] nums, int[] flag,int index) {
        result.add(new ArrayList<>(path));
        for (int i = index; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && flag[i - 1] == 0) {
                continue;
            }
            path.add(nums[i]);
            flag[i] = 1;
            backtracking(nums, flag, i + 1);
            flag[i] = 0;
            path.remove(path.size() - 1);

        }
    }
}
