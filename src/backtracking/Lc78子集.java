package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lc78子集 {
    static List<List<Integer>> result = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        return result;
    }

    public static void backtracking(int[] nums, int startIndex) {

        result.add(new ArrayList<>(path));
        if(startIndex>=nums.length) return;
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        subsets(nums);
    }
}
