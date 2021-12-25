package leetCodeHot100;

public class MoveZero {
    public static void moveZero(int[] nums) {
        //给定一个数组nums，编写一个函数将所有0移动到数组的末尾，并保持0元素的相对顺序
        //从后往前，利用双指针，找到0和非0的数字交换
//        int i = nums.length - 1; //找0
//        int j = 0; //找非0
//        while (i >= 0 && j >= 0) {
//            if (nums[i] != 0 && i > 0 ) i--;
//            if (nums[j] == 0 && j > 0) j--;
//            if (nums[i] == 0 && nums[j] != 0 ) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i--;
//                j--;
//            }
//            if(i == 0 && nums[i] !=0) break;
//            if(j == 0 && nums[j] ==0) break;
//        }
        //设置一个计数器，表示0的个数，遍历整个数组，根据0的个数往前移动多少次
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else{
                int temp = nums[i];
//                交换
//                nums[i]=0;
//                nums[i-count] = temp;

                //挪动
                for (int j = 1; j <= count; j++) {
                    nums[i-j+1] = nums[i-j];
                }
                nums[i-count] = temp;
            }
        }

        for (int a = 0; a < nums.length; a++) {
            System.out.println(nums[a]);
        }
    }

    public static void main(String[] args) {
//        int test[] = {1, 0, 2, 8, 0, 6, 5};
        int test[] = {0,1};
        moveZero(test);

    }
}
