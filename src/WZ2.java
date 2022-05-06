import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WZ2 {
    static List<Integer> temp = new ArrayList<Integer>();
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String len = sc.nextLine();
//        String line = sc.nextLine();
//        String[] str = line.split(" ");
//        int[] nums = new int[str.length];
//        for (int i = 0; i < str.length; i++) {
//            nums[i] = Integer.parseInt(str[i]);
//        }
//        findSubsequences(nums);
//        System.out.println(ans.size());
        String s = "babab";
        String temp = s.substring(0, 1);
        System.out.println(temp);
    }

    public static void findSubsequences(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums);
    }

    public static void dfs(int cur, int last, int[] nums) {
        if (cur == nums.length) {
            if (temp.size() >= 1) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if (nums[cur] >= last) {
            temp.add(nums[cur]);
            dfs(cur + 1, nums[cur], nums);
            temp.remove(temp.size() - 1);
        }
        if (nums[cur] != last) {
            dfs(cur + 1, last, nums);
        }
    }
}
