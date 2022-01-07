package leetCodeHot100;

public class FindKthLargest {
    public  static int findKthLargest(int[] nums, int k) {
        //快排
        int i = 0,j = nums.length;
        while (i < j) {
            int position = quickSort(nums, i, j);
            if (position+1 == k) {
                return nums[position];
            } else if (position+1 < k) {
                i = position + 1;
            } else {
                j = position;
            }

        }

        return nums[0];

    }

    public static int quickSort(int[] nums,int i,int j ) {

        int temp = nums[i];
        j--;
        while (i < j) {
//            从大到小
            while (i<j&&nums[j]<=temp){
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] >= temp) {
                i++;
            }
            nums[j] = nums[i];

        }
        nums[i] = temp;
        return i;
    }

//    public static int findKthLargest(int[] nums, int k) {
//        int left = 0, right = nums.length ;
//        while(left < right){
//            int position = quick_selections(nums,left,right);
//            if(nums.length - position == k){
//                return nums[position];
//            }else if(nums.length - position > k){
//                left = position + 1;
//            }else{
//                right = position;
//            }
//        }
//        return nums[0];
//    }
//    //快速选择
//    public static int quick_selections(int[] nums, int l, int r){
//        int first = l , last = r - 1, pivot = nums[last];
//        while(first < last){
//            while(first < last && nums[first] <= pivot){
//                ++first;
//            }
//            nums[last] = nums[first];
//            while(first < last && nums[last] >= pivot){
//                --last;
//            }
//            nums[first] = nums[last];
//        }
//        nums[last] = pivot;
//        return last;
//    }


    public static void main(String[] args) {
//        int[] nums = {3, 2, 1, 5, 6, 4};
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(3/2);
        System.out.println(findKthLargest(nums,4));
    }
}
