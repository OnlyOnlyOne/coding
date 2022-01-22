package leetCodeHot100;

public class SolutionOne {
    public static int solution(String S) {
        // write your code in Java SE 8

        //block相同的长度返回0
        //先把字符串分块，用一个count记住最大的块的长度,最大的块减去其他块字母的数量，得到的就是要添加字母的数量
        int count = 0;
        int size = 1;
        int temp;
        char[] s = S.toCharArray();
        int len = s.length;
        if(len == 0 || len == 1 || len == 2) return 0;
        int[] blockSize = new int[len];
        int m = 0;

        for (int i = 1; i < len; i++) {
            if (s[i] == s[i-1]) {
                size++;
            }
             else {
                blockSize[m] = size;
                size = 1;
                m++;
            }
            if (size > count) {
                count = size;
            }
        }
        blockSize[m] = size;


        int num = 0;
        int k =0;
        while (blockSize[k] != 0) {
            num += count - blockSize[k];
            k++;
        }
        return num;

    }

    public static void main(String[] args) {
        String S = "babaa";
        solution(S);

    }
}
