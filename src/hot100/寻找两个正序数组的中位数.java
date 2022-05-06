package hot100;

public class 寻找两个正序数组的中位数 {


    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        //二分模拟
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);
        if (len1 == 0) return nums2[start2 + k - 1];

        if (k == 1) return Math.min(nums1[start1], nums2[start2]);

        return 0;

    }
}
