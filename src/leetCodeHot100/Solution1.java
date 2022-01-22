package leetCodeHot100;

import java.util.Arrays;

public class Solution1 {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        //得到A的长度
        int length = A.length;
        Arrays.sort(A);
        if (length == 0) {
            return 1;
        }
        int min = A[0];
        int max = A[length - 1];
        if (max <= 0) {
            return 1;
        } else if (min > 0 && min != 1) {
            return 1;
        } else {
            for (int i = 1; i <= max; i++) {
                if (Arrays.binarySearch(A, i) < 0 && i > 0) {
                    return i;
                }
            }
        }
        return max+1;
    }



    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println(solution(nums));
    }

}
