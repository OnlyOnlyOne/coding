package backtracking;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

public class Lc39组合总和 {
    static Set<List<Integer>> result = new HashSet<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int sum = 0;
        backtracking(candidates, target, sum, 0);
        return new ArrayList<>(result);
    }

    public static void backtracking(int[] candidates, int target, int sum,int index) {
        if (sum == target ) {
            if(index>= candidates.length) return;
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            path.add(candidates[i]);
            sum += candidates[i];
            backtracking(candidates,target,sum,i);
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        combinationSum(arr,7);
    }
}
