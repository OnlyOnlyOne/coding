package leetCodeHot100;

import com.sun.jmx.snmp.internal.SnmpOutgoingRequest;

public class MergeTwoArray {
    static void mergeTwoArray(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                //k每次都会指向一个空的位置
                temp[k] = nums1[i];
                k++;
                i++;
            }else{
                temp[k] = nums2[j];
                k++;
                j++;
            }



        }
        //加入后面的数组
        if (i < m) {
            for (int q = i; q < m; q++) {
                temp[k++] = nums1[q];
            }
        }

        if (j < n) {
            for (int q = j; q < m; q++) {
                temp[k++] = nums2[q];
            }
        }

        for (int z = 0; z < m + n; z++) {
            nums1[z] = temp[z];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2  = {2,5,6};
        int n = 3;
        mergeTwoArray(nums1,m,nums2,n);
    }
}
