package 阿里笔试;

import java.util.Scanner;

public class first {
    public static int returnNumber(int A,int B) {
        //A表示形状是正A变形。B表示多少S
        //首先是先确定A边型变换的规则，第几S怎么变换,使用动态规划
        int[] nums = new int[B+2];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = A;
        for (int i = 3; i <= B+1; i++) {
            nums[i] = nums[i-1] + (A-2)*(i-2)+(A-1);
        }
        return nums[B+1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            count += returnNumber(A, B);
        }
//        int result = returnNumber(5,3);
//        System.out.println(result);
        System.out.println(count);
    }
}
