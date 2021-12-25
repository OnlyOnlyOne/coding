package leetCodeHot100;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //不使用hashmap
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int x = (nums[i] -1 )%n;
            nums[x] +=n;
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i]<=n) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] n = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result=findDisappearedNumbers(n);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
