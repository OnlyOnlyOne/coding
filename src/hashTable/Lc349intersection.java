package hashTable;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Lc349intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> check = new HashMap<Integer, Integer>();
        Set<Integer> resSet = new HashSet<>();
//        ArrayList<Integer> inter = new ArrayList<Integer>();
        //这里的做法还可以再改进，比如说健壮性，还有可以建立第二个map，不用再重新赋值
        int[] inter = new int[1000];
        int length = 0;
        for (int i = 0; i < nums1.length; i++) {
            check.put(nums1[i],1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(check.get(nums2[i])!=null) {
//                inter[length++] = nums2[i];
//                check.remove(nums2[i]);
                resSet.add(i);
            }
        }
//        int[] result = new int[length];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = inter[i];
//        }
//        return result;
        int[] resArr = new int[resSet.size()];
        int index = 0;
        //将结果几何转为数组
        for (int i : resSet) {
            resArr[index++] = i;
        }
        return resArr;

    }
}
