package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lc40组合总和Ⅱ {
    public LinkedList<Integer> path = new LinkedList<Integer>();
    public List<List<Integer>> result = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] flag = new boolean[candidates.length];
        backtracking(candidates, target, 0, flag);
        return result;
    }

    public void backtracking(int[] arr, int target,int start, boolean[] flag) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < arr.length&&arr[i] + sum <=target; i++) {
            if (i > 0 && arr[i] == arr[i - 1] && !flag[i - 1]) {
                continue;
            }
            flag[i] = true;
            sum = sum + arr[i];
            path.push(arr[i]);
            backtracking(arr, target, i + 1, flag);
            sum = sum - path.pop();
            flag[i] = false;
        }
    }

}
