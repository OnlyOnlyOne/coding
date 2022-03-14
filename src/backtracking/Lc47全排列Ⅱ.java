package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lc47全排列Ⅱ {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int[] used = new int[nums.length];
        backtracking(nums,used);
        return result;
    }

    public void backtracking(int[] nums, int[] used) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < used.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == 0) {
                continue;
            }
            if(used[i]==1) continue;
            // if (i > 0 && nums[i] == nums[i - 1]) {
            //     used[i]=1;
            //     continue;
            // }
            path.add(nums[i]);
            used[i] = 1;
            backtracking(nums, used);
            used[i] = 0;
            path.removeLast();
        }
    }
}
