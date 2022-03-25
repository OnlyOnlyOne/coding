package backtracking;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

public class Lc491递增子序列 {
    List<List<Integer>> results = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public void backtracking(int[] nums, int index) {
        if (path.size() > 1) {
            results.add(new ArrayList<>(path));
        }

        int[] flag = new int[201];
        for (int i = index; i < nums.length; i++) {
            if (!path.isEmpty() && nums[i] < path.get(path.size() - 1) || (flag[nums[i] + 100] == 1)) {
                continue;
            }
            flag[nums[i] + 100] = 1;
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.remove(path.size() - 1);

        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums, 0);
        return results;
    }
}
