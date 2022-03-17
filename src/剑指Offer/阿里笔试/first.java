package 剑指Offer.阿里笔试;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


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

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//            count += returnNumber(A, B);
//        }
////        int result = returnNumber(5,3);
////        System.out.println(result);
//        System.out.println(count);
//        Scanner input = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        int length = 0;
//        while(input.hasNextInt()){
//            int a = input.nextInt();
//            list.add(a);
//        }




            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            String[] s=r.readLine().split(" ");
            int[] left=new int[s.length];
            int[] right=new int[s.length];
            boolean flag=true;    //false 前一个为1,true 前left[i-1]个为0


            for(int i=1;i<s.length;i++) {
                if(s[i].equals("0")) {
                    if(!flag) {
                        flag=true;
                        left[i]=1;
                    }
                    else {
                        left[i]=left[i-1]+1;
                    }
                }
                else {
                    flag=false;
                }
            }
            if(s[0].equals("0"))
                left[0]=Integer.MAX_VALUE;


            flag=true;    //false 后一个为1,true 后right[i-1]个为0
            for(int i=s.length-2;i>=0;i--) {
                if(s[i].equals("0")) {
                    if(!flag) {
                        flag=true;
                        right[i]=1;
                    }
                    else {
                        right[i]=right[i+1]+1;
                    }
                }
                else {
                    flag=false;
                }
            }
            if(s[s.length-1].equals("0"))
                right[s.length-1]=Integer.MAX_VALUE;

            int[] min=new int[s.length];
            for(int i=0;i<s.length;i++) {
                min[i]=Math.min(left[i], right[i]);
            }
            int maxlength=0;
            for(int i=0;i<s.length;i++) {
                if(min[i]>maxlength)
                    maxlength=min[i];
            }
            System.out.print(maxlength);
        }
}

