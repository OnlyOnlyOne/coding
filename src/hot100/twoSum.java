package hot100;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        //key保存值，value保存下标
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                index[0] = i;
                index[1] = map.get(result);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return index;
    }
}
