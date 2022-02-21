package hashTable;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Lc454四数相加Ⅱ {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        //使用hashtable
        //第一步，先统计nums1和nums2相加的值，以及值出现的次数，使用两个for循环
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int temp = nums1[i] + nums2[j];
                if (result.containsKey(temp)) {
                    result.put(temp, result.get(temp) + 1);
                } else {
                    result.put(temp, 1);
                }
            }
        }
        //第二步，查看result.containsKey(0 - temp)
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int temp = nums3[i] + nums4[j];
                if (result.containsKey(0 - temp)) {
                    count = count + result.get(0 - temp);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {-1, -2};
        int[] nums3 = {0, 0};
        int[] nums4 = {0, 0};
        System.out.println(fourSumCount(nums2, nums1, nums3, nums4));

    }
}
