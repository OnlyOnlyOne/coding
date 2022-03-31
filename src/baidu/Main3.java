package baidu;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int Q = input.nextInt();


        for (int i = 0; i < Q; i++) {
            String s = input.next();
            System.out.println(helper(N, s));


        }
    }


//回溯
    public static void backtracking(int[] nums, int index) {

    }

    public static void reverseArray(int[] nums, int left, int right) {
        int temp;
        while (left < right) {
            temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }

    public static int[] stringToNums(String s) {
        int[] nums = new int[s.length()];
        for (int i = 0; i < nums.length; i++) {
            if (s.charAt(i) == 'A') {
                nums[i] = 1;
            } else if (s.charAt(i) == 'B') {
                nums[i] = 2;
            } else if (s.charAt(i) == 'C') {
                nums[i] = 3;
            }
        }
        return nums;
    }

    public static int helper(int N, String s) {
        int pl = 0;
        int pr = s.length() - 1;
        int count = 0;
        int temp,p;
        int[] nums = stringToNums(s);
        int a = 1;
        int count2 = 0;
        while (pl < pr) {
            while (nums[pr] == a) {
                pr--;
            }
            if (nums[pl] != a) {
                p = pl;
                pl++;
                while (nums[pl] != a) {
                    pl++;
                }
                if (pl <= pr) {
                    reverseArray(nums, p, pl);
                    count++;
                    pl = p;
                } else {
                    a = 2;
                }
            }
            reverseArray(nums, pl, pr);
            pr--;
            count++;
        }

        while (pl < pr) {
            while (nums[pl] == a) {
                pl++;
            }
            if (nums[pr] != a) {
                p = pr;
                pr--;
                while (nums[pr] != a) {
                    pr--;
                }
                if (pl <= pr) {
                    reverseArray(nums, p, pl);
                    count2++;
                    pl = p;
                } else {
                    a = 2;
                }
            }
            reverseArray(nums, pl, pr);
            pl++;
            count2++;

        }
        reverseArray(nums, 0, nums.length - 1);
        count ++;
        return Math.min(count,count2);



    }


}
